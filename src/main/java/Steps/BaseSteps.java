package Steps;

import Utilities.Helper;
import Utilities.LoadProperties;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

public class BaseSteps {
    public static WebDriver driver = null;
    public static String downloadPath = System.getProperty("user.dir") + "\\Downloads";
    // Sauce Labs Configuration
    public static final String USERNAME = LoadProperties.sauceLabsData.getProperty("username");
    public static final String ACCESS_KEY = LoadProperties.sauceLabsData.getProperty("accesskey");
    public static final String driverType = LoadProperties.userData.getProperty("driverType");
    public static final String iosCapsUrl = LoadProperties.userData.getProperty("iosCapsUrl");
    public static final String androidCapsUrl = LoadProperties.userData.getProperty("androidCapsUrl");
    public static final String sauceURL = "http://" + USERNAME + ":" + ACCESS_KEY + LoadProperties.sauceLabsData.getProperty("seleniumURL");

    @Before
    public WebDriver getNewDriver() throws IOException, ParseException {

        if (driverType.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("Chrome Browser is Started" + driver.hashCode());
            driver.manage().window().maximize();

        } else if (driverType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.out.println("Chrome Browser is Started" + driver.hashCode());
            driver.manage().window().maximize();

        } else if (driverType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println("Chrome Browser is Started" + driver.hashCode());
            driver.manage().window().maximize();
        }

        // headless browser testing
        else if (driverType.equalsIgnoreCase("chrome-headless")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1080");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        } else if (driverType.equalsIgnoreCase("Android")) {
            DesiredCapabilities caps = Helper.setCaps(androidCapsUrl);
            driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), caps);

        } else if (driverType.equalsIgnoreCase("Ios")) {
            DesiredCapabilities caps = Helper.setCaps(iosCapsUrl);
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);


        }

        return driver;
    }

    public WebDriver getNewDriver(String driverType) throws IOException, ParseException {

        if (driverType.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("Chrome Browser is Started" + driver.hashCode());
            driver.manage().window().maximize();

        } else if (driverType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.out.println("Chrome Browser is Started" + driver.hashCode());
            driver.manage().window().maximize();

        } else if (driverType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            System.out.println("Chrome Browser is Started" + driver.hashCode());
            driver.manage().window().maximize();
        }

        // headless browser testing
        else if (driverType.equalsIgnoreCase("chrome-headless")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--window-size=1920,1080");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        } else if (driverType.equalsIgnoreCase("Android")) {
            DesiredCapabilities caps = Helper.setCaps(androidCapsUrl);
            driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"), caps);

        } else if (driverType.equalsIgnoreCase("Ios")) {
            DesiredCapabilities caps = Helper.setCaps(iosCapsUrl);
            driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);


        }

        return driver;
    }


   /* @After
    public void closeBrowser(Scenario scenario) {

        if (scenario.isFailed()) {

            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
            System.out.println("Scenario failed: WebDriver take screen");
            driver.close();


        } else {
            driver.close();
        }


    }
*/

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
