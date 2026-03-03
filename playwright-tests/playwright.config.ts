import { defineConfig, devices } from '@playwright/test';

/**
 * Playwright Configuration
 * Docs: https://playwright.dev/docs/test-configuration
 */
export default defineConfig({
  testDir: './tests',

  /* Maximum time (ms) one test can run */
  timeout: 60_000,

  /* Retry failed tests once in CI */
  retries: process.env.CI ? 1 : 0,

  /* Number of parallel workers */
  workers: process.env.CI ? 2 : undefined,

  /* Reporter */
  reporter: [
    ['list'],
    ['html', { outputFolder: 'playwright-report', open: 'never' }],
  ],

  use: {
    /* Base URL (not used here since we navigate to an absolute URL) */
    baseURL: 'https://www.epam.com',

    /* Capture screenshot only on failure */
    screenshot: 'only-on-failure',

    /* Record video only on failure */
    video: 'retain-on-failure',

    /* Collect trace on first retry */
    trace: 'on-first-retry',

    /* Viewport */
    viewport: { width: 1280, height: 720 },

    /* Navigation timeout */
    navigationTimeout: 30_000,

    /* Action timeout */
    actionTimeout: 15_000,
  },

  projects: [
    {
      name: 'chromium',
      use: { ...devices['Desktop Chrome'] },
    },
    {
      name: 'firefox',
      use: { ...devices['Desktop Firefox'] },
    },
    {
      name: 'webkit',
      use: { ...devices['Desktop Safari'] },
    },
  ],
});
