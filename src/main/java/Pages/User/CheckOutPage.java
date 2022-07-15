package Pages.User;

import Utilities.Base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CheckOutPage extends PageBase {
    AppiumDriver<MobileElement> driver;
    public String orderNumber;

public CheckOutPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }


    @AndroidFindBy(id = "tv_cash")
    public MobileElement tv_cash;

    @AndroidFindBy(xpath = "//*[@text='Cash']")
    public MobileElement cash;

    @AndroidFindBy(id = "btn")
    public MobileElement btn;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup[2]/android.widget.TextView[2]")
    public MobileElement orderNumberButton;

}