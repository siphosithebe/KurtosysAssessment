package Tests;

import Pages.LandingPage;
import Utlis.BrowserFactory;
import Utlis.ReadData;
import Utlis.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://www.kurtosys.com/");
    LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    TakesScreenshots takesScreenshots = new TakesScreenshots();

    ReadData readData;

    {
        try {
            readData = new ReadData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
