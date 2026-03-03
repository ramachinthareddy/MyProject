import { test, expect, Page } from '@playwright/test';

/**
 * ============================================================
 *  EPAM – Client Work Navigation Test
 *  Branch : feature/playwright-epam-test-v2
 *
 *  Locators captured via live Playwright MCP snapshot
 *  -----------------------------------------------------------
 *  Homepage  (https://www.epam.com/)
 *    Header nav – Services link  : a[href="/services"]                  (snapshot ref e27)
 *    Header nav – Services btn   : button "Services"                    (snapshot ref e28)
 *    Hero – Explore Client Work  : a[href="/services/client-work"]      (snapshot refs e125/e240)
 *
 *  Services page  (https://www.epam.com/services)
 *    Page heading                : h1 "Services"                        (snapshot ref e64)
 *    Explore Client Work link    : a[href="/services/client-work"]
 *                                  text "Explore Our Client Work"       (snapshot ref e77)
 *
 *  Client Work page  (https://www.epam.com/services/client-work)
 *    Page heading                : h1 / text containing "Client Work"
 * ============================================================
 */

// ─── Locator helpers ────────────────────────────────────────────────────────
const LOCATORS = {
  // ── Header (shared across pages) ──────────────────────────────────────────
  skipNav:              (p: Page) => p.locator('a[href="#main"]'),
  headerBanner:         (p: Page) => p.locator('banner, header').first(),
  servicesNavLink:      (p: Page) => p.locator('a[href="/services"]').first(),
  servicesNavButton:    (p: Page) => p.getByRole('button', { name: 'Services' }),
  industriesNavButton:  (p: Page) => p.getByRole('button', { name: 'Industries' }),
  insightsNavLink:      (p: Page) => p.locator('a[href="/insights"]'),
  aboutNavLink:         (p: Page) => p.locator('a[href="/about"]'),
  careersNavLink:       (p: Page) => p.locator('a[href="/careers"]'),
  contactNavLink:       (p: Page) => p.locator('a[href*="contact"]').first(),
  epamLogoLink:         (p: Page) => p.locator('a[href="https://www.epam.com"]'),
  searchButton:         (p: Page) => p.getByRole('button', { name: 'Search' }),
  globalLangButton:     (p: Page) => p.getByRole('button', { name: /Global \(EN\)/ }),

  // ── Homepage hero ──────────────────────────────────────────────────────────
  heroHeading:          (p: Page) => p.getByRole('heading', { level: 1 }).first(),
  heroExploreClientWork:(p: Page) => p.locator('a[href="/services/client-work"]').first(),

  // ── Services page ──────────────────────────────────────────────────────────
  servicesHeading:      (p: Page) => p.getByRole('heading', { name: 'Services', level: 1 }),
  exploreClientWorkLink:(p: Page) => p.getByRole('link', { name: 'Explore Our Client Work' }),
  viewAllCaseStudies:   (p: Page) => p.getByRole('link', { name: /view all case studies/i }),

  // ── Client Work page ───────────────────────────────────────────────────────
  clientWorkHeading:    (p: Page) =>
    p.locator('h1, h2').filter({ hasText: /Client Work/i }).first(),
  clientWorkPageTitle:  (p: Page) => p.title(),
};

// ─── Test suite ─────────────────────────────────────────────────────────────
test.describe('EPAM – Navigate to Client Work via Services menu', () => {

  test.beforeEach(async ({ page }) => {
    // Step 1 – Navigate to EPAM homepage
    await page.goto('https://www.epam.com/', { waitUntil: 'networkidle' });
    await expect(page).toHaveURL('https://www.epam.com/');
  });

  // ── Main happy-path test ────────────────────────────────────────────────
  test('should navigate to Client Work page and verify heading', async ({ page }) => {

    // ── Step 1 – Verify homepage loaded ───────────────────────────────────
    await expect(page).toHaveTitle(/EPAM/i);

    // ── Step 2 – Select "Services" from the header menu ───────────────────
    // Note: The homepage hero image overlay intercepts pointer events, so we
    // use { force: true } on the Services link (as confirmed by live MCP run).
    const servicesLink = LOCATORS.servicesNavLink(page);
    await expect(servicesLink).toBeVisible();
    await servicesLink.click({ force: true });

    // Wait for the Services page to load
    await page.waitForURL('**/services', { waitUntil: 'networkidle' });
    await expect(page).toHaveURL(/\/services$/);
    await expect(LOCATORS.servicesHeading(page)).toBeVisible();

    // ── Step 3 – Capture Services page snapshot & click "Explore Our Client Work" ──
    const exploreLink = LOCATORS.exploreClientWorkLink(page);
    await expect(exploreLink).toBeVisible();
    await exploreLink.click();

    // ── Step 4 – Verify "Client Work" text is visible on the page ─────────
    await page.waitForURL('**/services/client-work', { waitUntil: 'networkidle' });
    await expect(page).toHaveURL(/\/services\/client-work/);

    // Verify the heading / prominent text on the Client Work page
    const clientWorkHeading = LOCATORS.clientWorkHeading(page);
    await expect(clientWorkHeading).toBeVisible();
    await expect(clientWorkHeading).toContainText('Client Work');

    // Also assert page title contains "Client Work"
    await expect(page).toHaveTitle(/Client Work/i);
  });

  // ── Smoke test: header navigation elements are present ──────────────────
  test('header navigation should contain all expected links', async ({ page }) => {
    await expect(LOCATORS.servicesNavLink(page)).toBeVisible();
    await expect(LOCATORS.insightsNavLink(page)).toBeVisible();
    await expect(LOCATORS.aboutNavLink(page)).toBeVisible();
    await expect(LOCATORS.careersNavLink(page)).toBeVisible();
    await expect(LOCATORS.contactNavLink(page)).toBeVisible();
    await expect(LOCATORS.epamLogoLink(page)).toBeVisible();
    await expect(LOCATORS.searchButton(page)).toBeVisible();
  });

  // ── Smoke test: hero "Explore Our Client Work" link resolves correctly ───
  test('hero "Explore Our Client Work" link should point to /services/client-work', async ({ page }) => {
    const heroLink = LOCATORS.heroExploreClientWork(page);
    await expect(heroLink).toBeVisible();
    const href = await heroLink.getAttribute('href');
    expect(href).toContain('/services/client-work');
  });
});
