package Pages.Courier;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import Utilities.Base.AndroidPageBase;

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


    public void CourierLogin() throws InterruptedException, MalformedURLException {

        // Login
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        tvCountryCodeNumber.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        cl_select_egypt.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        etCurrentNumber.sendKeys("01012661525");

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        btn_continue.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        etNewPassword.sendKeys("a12345678");

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        btnLogin.click();

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
        driver.findElement(By.id("view_gallery")).click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Screenshot_20220629-104441_Shgardi Captain.jpg, 457 kB, 29 Jun\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView")).click();

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