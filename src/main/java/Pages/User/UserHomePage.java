package Pages.User;

import Utilities.Base.AndroidPageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class UserHomePage extends AndroidPageBase {
    public String orderNumber;

    public UserHomePage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "tv_search_main")
    public AndroidElement tv_search_main;
}
