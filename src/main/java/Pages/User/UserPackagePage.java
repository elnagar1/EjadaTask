package Pages.User;

import Utilities.Base.AndroidPageBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class UserPackagePage extends AndroidPageBase {
public AndroidDriver driver ;
    public UserPackagePage(AndroidDriver driver) {
        super(driver);
        this.driver=driver;
    }

    @AndroidFindBy(xpath = "//*[@text='Send Package']")
    public AndroidElement Package;

    @AndroidFindBy(id = "btnChangePickupLocation_normal")
    public AndroidElement btnChangePickupLocation;

    @AndroidFindBy(xpath = "//*[@text='Current location']")
    public AndroidElement currentLocation;

    @AndroidFindBy(id = "btnEnterDropoffLocation_normal")
    public AndroidElement btnEnterDropoffLocation;

    @AndroidFindBy(xpath = "//*[@text='Choose on Map']")
    public AndroidElement chooseMap;

    @AndroidFindBy(xpath = "//*[@text='Done']")
    public AndroidElement Done;

    @AndroidFindBy(id = "etWriteOrder")
    public AndroidElement writeOrder;

    @AndroidFindBy(xpath = "//*[@text='Next']")
    public AndroidElement Next;

  public void scrollToPackage() throws InterruptedException {
      Thread.sleep(5000);
    new TouchAction(driver).press(PointOption.point(600,548)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(428))).moveTo(PointOption.point(168, 520)).release().perform();
     }


    public void scrollInMap() throws InterruptedException {
        Thread.sleep(300);
        new TouchAction(driver).press(PointOption.point(345,1332)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(538))).moveTo(PointOption.point(609, 1361)).release().perform();
    }
    public void scrollScreen() {
        new TouchAction(driver).press(PointOption.point(820, 1779)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(298))).moveTo(PointOption.point(975, 737)).release().perform();
    }
}
