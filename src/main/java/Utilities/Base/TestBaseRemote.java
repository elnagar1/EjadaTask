package Utilities.Base;

import Utilities.Helper;
import Utilities.LoadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBaseRemote {

    // Sauce Labs Configuration
    public static final String USERNAME = LoadProperties.sauceLabsData.getProperty("username");
    public static final String ACCESS_KEY = LoadProperties.sauceLabsData.getProperty("accesskey");
    public static final String sauceURL = "http://" + USERNAME + ":" + ACCESS_KEY + LoadProperties.sauceLabsData.getProperty("seleniumURL");


    public ThreadLocal<RemoteWebDriver> setUp(String browser) throws MalformedURLException {
        ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", browser);

        // Selenium Grid Local
        //driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps));

        // Run on SauceLabs on Cloud
        driver.set(new RemoteWebDriver(new URL(sauceURL), caps));
        return driver;

    }


  /*  public WebDriver getDriver() {
        return driver.get();
    }

    @AfterClass
    public void stopDriver() {
        getDriver().quit();
        driver.remove();
    }

    @AfterMethod
    public void screenshotOnFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            System.out.println("Failed!");
            System.out.println("Taking Screenshot....");
            Helper.captureScreenshot(getDriver(), result.getName());
        }
    }*/

}
