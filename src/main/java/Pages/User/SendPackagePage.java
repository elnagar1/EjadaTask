package Pages.User;

import Utilities.Base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import java.time.Duration;

public class SendPackagePage extends PageBase {
public AppiumDriver<MobileElement> driver ;
    public SendPackagePage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver=driver;
    }

    @AndroidFindBy(xpath = "//*[@text='Send Package']")
    public MobileElement Package;

    @AndroidFindBy(id = "btnChangePickupLocation_normal")
    public MobileElement btnChangePickupLocation;

    @AndroidFindBy(xpath = "//*[@text='Current location']")
    public MobileElement currentLocation;

    @AndroidFindBy(id = "btnEnterDropoffLocation_normal")
    public MobileElement btnEnterDropoffLocation;

    @AndroidFindBy(xpath = "//*[@text='Choose on Map']")
    public MobileElement chooseMap;

    @AndroidFindBy(xpath = "//*[@text='Done']")
    public MobileElement Done;

    @AndroidFindBy(id = "etWriteOrder")
    public MobileElement writeOrder;

    @AndroidFindBy(xpath = "//*[@text='Next']")
    public MobileElement Next;

  public void scrollToPackage() throws InterruptedException {
      Thread.sleep(5000);
    new TouchAction(driver).press(PointOption.point(600,548)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(428))).moveTo(PointOption.point(168, 520)).release().perform();
     }


    public void scrollInMap() throws InterruptedException {
        Thread.sleep(4000);
        new TouchAction(driver).press(PointOption.point(345,1332)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(538))).moveTo(PointOption.point(609, 1361)).release().perform();
    }
    public void scrollScreen() throws InterruptedException {
        Thread.sleep(2000);
        new TouchAction(driver).press(PointOption.point(820, 1779)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(298))).moveTo(PointOption.point(975, 737)).release().perform();
    }
}
