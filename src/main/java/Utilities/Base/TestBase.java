package Utilities.Base;

import Steps.Hooks;
import Utilities.Helper;
import Utilities.LoadProperties;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class TestBase {   // App1 capabilities

    public static String downloadPath = System.getProperty("user.dir") + "\\Downloads";
    // Sauce Labs Configuration
    public static final String USERNAME = LoadProperties.sauceLabsData.getProperty("username");
    public static final String ACCESS_KEY = LoadProperties.sauceLabsData.getProperty("accesskey");
    public static final String sauceURL = "http://" + USERNAME + ":" + ACCESS_KEY + LoadProperties.sauceLabsData.getProperty("seleniumURL");


    public static WebDriver getNewWebDriver(String browser) {
            WebDriver driver =null;
            if (browser.equalsIgnoreCase("chrome")) {

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                System.out.println("Chrome Browser is Started" + driver.hashCode());

            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                System.out.println("Chrome Browser is Started" + driver.hashCode());

            } else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                System.out.println("Chrome Browser is Started" + driver.hashCode());
            }

            // headless browser testing
            else if (browser.equalsIgnoreCase("chrome-headless")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headless");
                options.addArguments("--window-size=1920,1080");
                driver = new ChromeDriver(options);
            }
        Hooks.webDriver=driver;
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            return driver;
    }

    public static AppiumDriver<MobileElement> getNewCourierDriver() throws IOException, ParseException {
        DesiredCapabilities caps2 = Helper.setCaps("src/main/resources/DataFiles/CourierCaps.json");
        AppiumDriver<MobileElement>  courierDriver=new AndroidDriver<> (new URL("http://localhost:4723/wd/hub"), caps2);
        Hooks.courierDriver=courierDriver;
        return  courierDriver;
    }

    public static AppiumDriver<MobileElement> getNewUserDriver() throws IOException, ParseException {
        DesiredCapabilities caps = Helper.setCaps("src/main/resources/DataFiles/UserCaps.json");
        AppiumDriver<MobileElement>  userDriver=new AndroidDriver<> (new URL("http://localhost:4723/wd/hub"), caps);
        Hooks.userDriver=userDriver;
        return userDriver;
    }


    public AppiumDriver<MobileElement> getParallelDriver(String CapURL,String port) throws IOException, ParseException {
        DesiredCapabilities caps = Helper.setCaps(CapURL);
        AppiumDriver<MobileElement>  userDriver=new AndroidDriver<> (new URL("http://localhost:"+port+"/wd/hub"), caps);
        Hooks.userDriver=userDriver;
        return userDriver;
    }
    public ThreadLocal<RemoteWebDriver> RemoteSetUp(String browser) throws MalformedURLException {
        ThreadLocal<RemoteWebDriver> remoteDriver = new ThreadLocal<>();
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", browser);

        // Selenium Grid Local
        //driver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),caps));

        // Run on SauceLabs on Cloud
        remoteDriver.set(new RemoteWebDriver(new URL(sauceURL), caps));
        return remoteDriver;

    }



    public static FirefoxOptions firefoxOption() {
        FirefoxOptions option = new FirefoxOptions();
        option.addPreference("browser.download.folderList", 2);
        option.addPreference("browser.download.dir", downloadPath);
        option.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
        option.addPreference("browser.download.manager.showWhenStarting", false);
        option.addPreference("pdfjs.disabled", true);
        return option;
    }

    public static ChromeOptions chromeOption() {
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default.content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadPath);
        options.setExperimentalOption("prefs", chromePrefs);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return options;
    }

}
