package Pages.User;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import Utilities.Base.PageBase;

public class UserLoginPage extends PageBase {
    AppiumDriver<MobileElement> driver;
    public String orderNumber;

    public UserLoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    @AndroidFindBy(id = "rv_skip_forward")
    public MobileElement skipButton;

    @AndroidFindBy(id = "layout_change_app_lang")
    public MobileElement changeLang;

    @AndroidFindBy(id = "tvChangeConfig")
    public MobileElement btnChooseDev;

    @AndroidFindBy(id = "rbDev")
    public MobileElement chooseDev;

    @AndroidFindBy(id = "btnConfirm")
    public MobileElement confirmDev;

    @AndroidFindBy(id = "tvCountryCodeNumber")
    public MobileElement countryCodeTxtBox;

    @AndroidFindBy(id = "etCurrentNumber")
    public MobileElement numberTxtBox;

    @AndroidFindBy(id = "cl_select_egypt")
    public  MobileElement egypt;

    @AndroidFindBy(id = "btn_continue")
    public MobileElement numberContinue;

    @AndroidFindBy(id = "etNewPassword")
    public MobileElement passwordTxtBox;

    @AndroidFindBy(id = "btnLogin")
    public MobileElement loginBtn;

    @AndroidFindBy(id = "tv_search_main")
    public MobileElement tv_search_main;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView\n")
    public  MobileElement choose;

    @AndroidFindBy(id = "rbAnything")
    public MobileElement rbAnything;

    @AndroidFindBy(id = "button_done")
    public MobileElement button_done;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.AutoCompleteTextView")
    public MobileElement search;

    @AndroidFindBy(id = "rv_notify")
    public MobileElement rv_notify;

    @AndroidFindBy(id = "btn_confirm_cost")
    public MobileElement btn_confirm_cost;

    @AndroidFindBy(id = "et_add_item_order_anything")
    public MobileElement et_add_item_order_anything;

    @AndroidFindBy(id = "cl_proceed_checkout")
    public MobileElement cl_proceed_checkout;

    @AndroidFindBy(id = "tvLessThan100")
    public MobileElement tvLessThan100;

    @AndroidFindBy(id = "confirm")
    public MobileElement confirm;

}