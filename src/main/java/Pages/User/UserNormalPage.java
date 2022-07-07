package Pages.User;

import Utilities.Base.AndroidPageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UserNormalPage  extends AndroidPageBase {
    public String orderNumber;

    public UserNormalPage(AndroidDriver driver) {
        super(driver);
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.FrameLayout/android.widget.ImageView\n")
    public AndroidElement choose;

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
}
