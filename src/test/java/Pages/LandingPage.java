package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LandingPage {
    WebDriver driver;

    @FindBy(xpath = "//span[contains(.,'Resources')]")
    WebElement Resource_xpath;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyResourceTileisDipslayed() {

        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOf(Resource_xpath));
        String Resources = Resource_xpath.getText();
        Assert.assertEquals(Resources, "RESOURCES");
    }
}