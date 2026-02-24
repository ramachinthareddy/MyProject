import { test, expect } from '@playwright/test';

test.describe('EPAM site navigation', () => {
  test('Navigate to EPAM Client Work via Services menu', async ({ page }) => {
    // Go to EPAM homepage
    await page.goto('https://www.epam.com/', { waitUntil: 'domcontentloaded' });

    // Select "Services" from the header menu
    const servicesLink = page.getByRole('link', { name: 'Services' });
    await expect(servicesLink).toBeVisible({ timeout: 5000 });
    await servicesLink.hover();
    await servicesLink.click();

    // Click the "Explore Our Client Work" link
    const exploreLink = page.getByRole('link', { name: 'Explore Our Client Work' });
    await expect(exploreLink).toBeVisible({ timeout: 5000 });
    await Promise.all([
      page.waitForNavigation({ waitUntil: 'load' }),
      exploreLink.click(),
    ]);

    // Verify that the "Client Work" text is visible on the page
    await expect(page.getByText('Client Work')).toBeVisible({ timeout: 10000 });
  });
});
