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
    public AndroidElement skipButton;

    @AndroidFindBy(id = "layout_change_app_lang")
    public AndroidElement changeLang;

    @AndroidFindBy(id = "tvChangeConfig")
    public AndroidElement btnChooseDev;

    @AndroidFindBy(id = "rbDev")
    public AndroidElement chooseDev;

    @AndroidFindBy(id = "btnConfirm")
    public AndroidElement confirmDev;

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

}