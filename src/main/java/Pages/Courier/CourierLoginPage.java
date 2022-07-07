package Pages.Courier;

import Utilities.Base.AndroidPageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class CourierLoginPage extends AndroidPageBase {
    public AndroidDriver driver;


    public CourierLoginPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @AndroidFindBy(id = "tvCountryCodeNumber")
    public  AndroidElement tvCountryCodeNumber;

    @AndroidFindBy(id = "cl_select_egypt")
    public AndroidElement cl_select_egypt;

    @AndroidFindBy(id = "etCurrentNumber")
    public AndroidElement etCurrentNumber;

    @AndroidFindBy(id = "btn_continue")
    public AndroidElement btn_continue;

    @AndroidFindBy(id = "layout_change_app_lang")
    public  AndroidElement changeLang;


    @AndroidFindBy(id = "etNewPassword")
    public AndroidElement etNewPassword;

    @AndroidFindBy(id = "btnLogin")
    public AndroidElement btnLogin;

    @AndroidFindBy(id = "order_payment_type_container")
    public AndroidElement order;

    @AndroidFindBy(id = "btnAccept")
    public  AndroidElement btnAccept;

    @AndroidFindBy(id = "tvUpdateOrderStatus")
    public  AndroidElement tvUpdateOrderStatus;

    @AndroidFindBy(id = "btnDone")
    public  AndroidElement btnDone;

    @AndroidFindBy(id = "etPrice")
    public  AndroidElement etPrice;

    @AndroidFindBy(id = "ibUpload")
    public  AndroidElement ibUpload;

    @AndroidFindBy(xpath ="//*[@text='استخدام الكاميرا']")
    public  AndroidElement userCamera;

    @AndroidFindBy(id = "btnSend")
    public AndroidElement btnSend;


}