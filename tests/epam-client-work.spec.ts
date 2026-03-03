import { test, expect } from '@playwright/test';

/**
 * EPAM Client Work Navigation Test
 *
 * Test Scenario:
 *  1. Navigate to https://www.epam.com/
 *  2. Select "Services" from the header menu
 *  3. Click the "Explore Our Client Work" link
 *  4. Verify that the "Client Work" text is visible on the page
 */

test.describe('EPAM - Client Work Navigation', () => {
  test.beforeEach(async ({ page }) => {
    // Accept cookies if the cookie banner appears
    await page.goto('https://www.epam.com/', { waitUntil: 'domcontentloaded' });

    const acceptBtn = page.locator('button:has-text("Accept All")');
    if (await acceptBtn.isVisible({ timeout: 5000 }).catch(() => false)) {
      await acceptBtn.click();
    }
  });

  test('should navigate to Client Work page via Services menu', async ({ page }) => {
    // ── Step 1: Verify we are on the EPAM homepage ────────────────────────────
    await expect(page).toHaveURL('https://www.epam.com/');
    await expect(page).toHaveTitle(/EPAM/i);

    // ── Step 2: Select "Services" from the header menu ────────────────────────
    // The Services nav item is rendered as both a <link> and a <button>;
    // we target the visible <a> inside the top navigation.
    const servicesNavLink = page.locator('nav a[href="/services"]').first();

    // Use force-click to bypass any full-page video/image overlay
    await servicesNavLink.click({ force: true });

    await expect(page).toHaveURL('https://www.epam.com/services');
    await expect(page).toHaveTitle(/Services/i);

    // ── Step 3: Click "Explore Our Client Work" ───────────────────────────────
    const exploreLink = page.locator('a[href*="client-work"]:has-text("Explore Our Client Work")').first();
    await expect(exploreLink).toBeVisible({ timeout: 10_000 });
    await exploreLink.click({ force: true });

    // Wait for navigation to the Client Work page
    await page.waitForURL('**/services/client-work', { timeout: 15_000 });

    // ── Step 4: Verify "Client Work" text is visible on the page ─────────────
    await expect(page).toHaveURL(/client-work/);

    // Verify the page title contains "Client Work"
    await expect(page).toHaveTitle(/Client Work/i);

    // Verify the "Client Work" text is visible in the page body
    const clientWorkHeading = page.locator('text=Client Work').first();
    await expect(clientWorkHeading).toBeVisible({ timeout: 10_000 });
  });
});
