package Pages.Courier;

import Utilities.Base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CourierLoginPage extends PageBase {
    public AppiumDriver<MobileElement> driver;

    public CourierLoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    @AndroidFindBy(id = "tvCountryCodeNumber")
    @iOSXCUITFindBy(accessibility = "test")
    public  MobileElement tvCountryCodeNumber;

    @AndroidFindBy(id = "tvChangeConfig")
    @iOSXCUITFindBy(accessibility = "test")
    public MobileElement btnChooseDev;

    @AndroidFindBy(id = "rbDev")
    @iOSXCUITFindBy(accessibility = "test")
    public MobileElement chooseDev;

    @AndroidFindBy(id = "btnConfirm")
    @iOSXCUITFindBy(accessibility = "test")
    public MobileElement confirmDev;

    @AndroidFindBy(id = "cl_select_egypt")
    @iOSXCUITFindBy(accessibility = "test")
    public MobileElement cl_select_egypt;

    @AndroidFindBy(id = "etCurrentNumber")
    @iOSXCUITFindBy(accessibility = "test")
    public MobileElement etCurrentNumber;

    @AndroidFindBy(id = "btn_continue")
    @iOSXCUITFindBy(accessibility = "test")
    public MobileElement btn_continue;

    @AndroidFindBy(id = "layout_change_app_lang")
    @iOSXCUITFindBy(accessibility = "test")
    public  MobileElement changeLang;

    @AndroidFindBy(id = "etNewPassword")
    @iOSXCUITFindBy(accessibility = "test")
    public MobileElement etNewPassword;

    @AndroidFindBy(id = "btnLogin")
    @iOSXCUITFindBy(accessibility = "test")
    public MobileElement btnLogin;


}