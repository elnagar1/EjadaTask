package Steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {
    public static WebDriver webDriver;
    public static AppiumDriver<MobileElement> courierDriver;
    public static AppiumDriver<MobileElement> userDriver;


    @After
    public void closeBrowser(Scenario scenario) {

        if (scenario.isFailed()) {

            if (webDriver != null) {
                final byte[] screenshot = ((TakesScreenshot) webDriver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png"); //stick it in the report
                System.out.println("Scenario failed: WebDriver take screen");
                webDriver.close();
            }
            if (courierDriver != null) {
                final byte[] screenshot = ((TakesScreenshot) courierDriver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png"); //stick it in the report
                System.out.println("Scenario failed: CourierDriver take screen");
                courierDriver.quit();
            }
            if (userDriver != null) {
                final byte[] screenshot = ((TakesScreenshot) userDriver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png"); //stick it in the report
                System.out.println("Scenario failed: UserDriver take screen");
                userDriver.quit();
            }

        } else {

            if (webDriver != null) {
                webDriver.close();
            }
            if (userDriver != null) {
                userDriver.quit();
            }
            if (courierDriver != null) {
                courierDriver.quit();
            }

        }


    }
}
