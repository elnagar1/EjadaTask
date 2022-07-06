package Pages.Courier;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import Utilities.Base.AndroidPageBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class CourierLoginPage extends AndroidPageBase {
    AndroidDriver driver;


    public CourierLoginPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @AndroidFindBy(id = "tvCountryCodeNumber")
    AndroidElement tvCountryCodeNumber;

    @AndroidFindBy(id = "cl_select_egypt")
    AndroidElement cl_select_egypt;

    @AndroidFindBy(id = "etCurrentNumber")
    AndroidElement etCurrentNumber;

    @AndroidFindBy(id = "btn_continue")
    AndroidElement btn_continue;

    @AndroidFindBy(id = "etNewPassword")
    AndroidElement etNewPassword;

    @AndroidFindBy(id = "btnLogin")
    AndroidElement btnLogin;

    @AndroidFindBy(id = "order_payment_type_container")
    AndroidElement order;

    @AndroidFindBy(id = "btnAccept")
    AndroidElement btnAccept;

    @AndroidFindBy(id = "tvUpdateOrderStatus")
    AndroidElement tvUpdateOrderStatus;

    @AndroidFindBy(id = "btnDone")
    AndroidElement btnDone;

    @AndroidFindBy(id = "etPrice")
    AndroidElement etPrice;

    @AndroidFindBy(id = "ibUpload")
    AndroidElement ibUpload;

    @AndroidFindBy(id = "view_gallery")
    AndroidElement view_gallery;

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Screenshot_20220629-104441_Shgardi Captain.jpg, 457 kB, 29 Jun\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")
    AndroidElement photo;

    @AndroidFindBy(id = "btnSend")
    AndroidElement btnSend;




    public void CourierLogin() throws InterruptedException, MalformedURLException {


        // Login
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver. findElement(By.id("tvCountryCodeNumber")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("cl_select_egypt")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("etCurrentNumber")).sendKeys("01012661525");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("btn_continue")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("etNewPassword")).sendKeys("a12345678");
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        //Accept order
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("order_payment_type_container")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("btnAccept")).click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("tvUpdateOrderStatus")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("btnDone")).click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("tvUpdateOrderStatus")).click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("etPrice")).sendKeys("50");

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("ibUpload")).click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@text='استخدام الكاميرا']")).click();
        driver.pressKey(new KeyEvent(AndroidKey.CAMERA));

      //  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout[3]/android.view.ViewGroup/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='موافق']")));
        driver.findElement(By.xpath("//*[@text='موافق']")).click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("btnSend")).click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("tvUpdateOrderStatus")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("btnDone")).click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("tvUpdateOrderStatus")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("btnDone")).click();




    }


}