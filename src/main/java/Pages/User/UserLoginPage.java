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
    AndroidElement skipButton;

    @AndroidFindBy(id = "tvChangeConfig")
    AndroidElement btnChooseDev;

    @AndroidFindBy(id = "rbDev")
    AndroidElement chooseDev;

    @AndroidFindBy(id = "btnConfirm")
    AndroidElement confirmDev;

    @AndroidFindBy(id = "tvCountryCodeNumber")
    AndroidElement countryCodeTxtBox;

    @AndroidFindBy(id = "etCurrentNumber")
    AndroidElement numberTxtBox;

    @AndroidFindBy(id = "cl_select_egypt")
    AndroidElement egypt;

    @AndroidFindBy(id = "btn_continue")
    AndroidElement numberContinue;

    @AndroidFindBy(id = "etNewPassword")
    AndroidElement passwordTxtBox;

    @AndroidFindBy(id = "btnLogin")
    AndroidElement loginBtn;




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
        driver.findElement(By.id("tv_search_main")).click();
        Thread.sleep(5000);

        //Click to choose anything
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView\n")).click();

        Thread.sleep(5000);
        driver.findElement(By.id("rbAnything")).click();

        driver.findElement(By.id("button_done")).click();

        //Set location

        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.AutoCompleteTextView"))
                .sendKeys("كشرى هند المعادي");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("rv_notify")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("btn_confirm_cost")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("et_add_item_order_anything")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        //problem is here

        driver.findElement(By.id("et_add_item_order_anything")).sendKeys("bread ");

        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("cl_proceed_checkout")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        //range order price
        driver.findElement(By.id("tvLessThan100")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("confirm")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        //CheckOut screen
        //Select cash payment type
        driver.findElement(By.id("tv_cash")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.findElement(By.id("btn")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        orderNumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup[2]/android.widget.TextView[2]")).getText();
        //orderNumber = driver.findElement(By.id("661c8cf9-ecc9-41c1-91a0-c9853a72bd95")).getText();

        System.out.println(orderNumber);

    }


}