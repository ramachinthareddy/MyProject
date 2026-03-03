import { test, expect } from '@playwright/test';

/**
 * Test Suite: EPAM Website – Services & Client Work Navigation
 *
 * Steps:
 *  1. Navigate to https://www.epam.com/
 *  2. Select "Services" from the header menu
 *  3. Click the "Explore Our Client Work" link
 *  4. Verify that "Client Work" text is visible on the page
 */
test.describe('EPAM Website Navigation', () => {
  test('should navigate to Client Work page via Services menu', async ({ page }) => {

    // ── Step 1: Navigate to EPAM homepage ──────────────────────────────────
    await page.goto('https://www.epam.com/', { waitUntil: 'domcontentloaded' });
    await expect(page).toHaveURL(/epam\.com/);
    console.log('✅ Step 1 – Navigated to https://www.epam.com/');

    // ── Step 2: Click "Services" in the header navigation ──────────────────
    // Hover first to reveal the dropdown / navigate to the Services section
    const servicesLink = page.locator('header nav a', { hasText: /^Services$/i });
    await servicesLink.waitFor({ state: 'visible', timeout: 15_000 });
    await servicesLink.hover();
    await servicesLink.click();
    console.log('✅ Step 2 – Clicked "Services" in the header menu');

    // ── Step 3: Click "Explore Our Client Work" link ────────────────────────
    const exploreClientWorkLink = page.getByRole('link', {
      name: /Explore Our Client Work/i,
    });
    await exploreClientWorkLink.waitFor({ state: 'visible', timeout: 15_000 });
    await exploreClientWorkLink.click();
    console.log('✅ Step 3 – Clicked "Explore Our Client Work" link');

    // ── Step 4: Verify "Client Work" text is visible on the page ───────────
    await page.waitForLoadState('domcontentloaded');
    const clientWorkHeading = page.getByText(/Client Work/i).first();
    await expect(clientWorkHeading).toBeVisible({ timeout: 15_000 });
    console.log('✅ Step 4 – "Client Work" text is visible on the page');
  });
});
