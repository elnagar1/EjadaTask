package Pages.User;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import Utilities.Base.AndroidPageBase;

import java.util.concurrent.TimeUnit;

public class UserLoginPage extends AndroidPageBase {
    AndroidDriver driver;
    public String orderNumber;

    public UserLoginPage(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @AndroidFindBy(id = "rv_skip_forward")
    public
    AndroidElement skipButton;

    @AndroidFindBy(id = "tvChangeConfig")
    public
    AndroidElement btnChooseDev;

    @AndroidFindBy(id = "rbDev")
    public
    AndroidElement chooseDev;

    @AndroidFindBy(id = "btnConfirm")
    public
    AndroidElement confirmDev;

    @AndroidFindBy(id = "tvCountryCodeNumber")
    public AndroidElement countryCodeTxtBox;

    @AndroidFindBy(id = "etCurrentNumber")
    public AndroidElement numberTxtBox;

    @AndroidFindBy(id = "cl_select_egypt")
    public  AndroidElement egypt;

    @AndroidFindBy(id = "btn_continue")
    public AndroidElement numberContinue;

    @AndroidFindBy(id = "etNewPassword")
    public AndroidElement passwordTxtBox;

    @AndroidFindBy(id = "btnLogin")
    public AndroidElement loginBtn;

    @AndroidFindBy(id = "tv_search_main")
    public AndroidElement tv_search_main;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView\n")
    public  AndroidElement choose;

    @AndroidFindBy(id = "rbAnything")
    public AndroidElement rbAnything;

    @AndroidFindBy(id = "button_done")
    public AndroidElement button_done;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.AutoCompleteTextView")
    public AndroidElement search;

    @AndroidFindBy(id = "rv_notify")
    public AndroidElement rv_notify;

    @AndroidFindBy(id = "btn_confirm_cost")
    public AndroidElement btn_confirm_cost;

    @AndroidFindBy(id = "et_add_item_order_anything")
    public AndroidElement et_add_item_order_anything;

    @AndroidFindBy(id = "cl_proceed_checkout")
    public AndroidElement cl_proceed_checkout;

    @AndroidFindBy(id = "tvLessThan100")
    public AndroidElement tvLessThan100;

    @AndroidFindBy(id = "confirm")
    public AndroidElement confirm;

    @AndroidFindBy(id = "tv_cash")
    public AndroidElement tv_cash;

    @AndroidFindBy(id = "btn")
    public AndroidElement btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup[2]/android.widget.TextView[2]")
    public AndroidElement orderNumberButton;


    public void UserLogin(String number, String password) throws InterruptedException {

        //Skid
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        skipButton.click();

        //Login
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        btnChooseDev.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        chooseDev.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        confirmDev.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        countryCodeTxtBox.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        egypt.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        numberTxtBox.sendKeys("01150300594");

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        numberContinue.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        passwordTxtBox.sendKeys("123456");

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        loginBtn.click();


        //Click to search
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        tv_search_main.click();


        //Click to choose anything
        Thread.sleep(5000);
        choose.click();

        Thread.sleep(5000);
        rbAnything.click();
        button_done.click();

        //Set location

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        search.sendKeys("كشرى هند المعادي");

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        rv_notify.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        btn_confirm_cost.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        et_add_item_order_anything.click();

        //problem is here
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        et_add_item_order_anything.sendKeys("bread ");

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.navigate().back();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        cl_proceed_checkout.click();


        //range order price
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        tvLessThan100.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        confirm.click();


        //CheckOut screen
        //Select cash payment type
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        tv_cash.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        btn.click();

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        orderNumber =orderNumberButton.getText();

        System.out.println(orderNumber);

    }


}