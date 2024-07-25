package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class KurtosysTest extends Base {


    public void VerifyResources() throws InterruptedException {
        landingPage.acceptAllCookies();
        landingPage.verifyResourceTileisDipslayed();
        takesScreenshots.takesSnapShot(driver, "KurtosysLandingPage");
    }

    @Test(priority = 1)
    public void ClickWhitePaper() throws InterruptedException {
        landingPage.clickWhitePaper();

        takesScreenshots.takesSnapShot(driver, "WhitePaperPage");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
