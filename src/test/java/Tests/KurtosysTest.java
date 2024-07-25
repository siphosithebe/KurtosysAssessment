package Tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class KurtosysTest extends Base {
    public void VerifyResources(){
        landingPage.verifyResourceTileisDipslayed();
        takesScreenshots.takesSnapShot(driver,"KurtosysLandingPage");
    }
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
