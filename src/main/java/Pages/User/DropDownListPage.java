package Pages.User;

import Utilities.Base.AndroidPageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.Select;

public class DropDownListPage extends AndroidPageBase {
    @AndroidFindBy(id = "mat-input-0")
    public AndroidElement userEmail;
    @AndroidFindBy(id = "mat-input-1")
    public AndroidElement password;
    @AndroidFindBy(id = "kt_login_signin_submit")
    public AndroidElement signIn;
    @AndroidFindBy(className = "kt-menu__link-icon flaticon2-list-2 ng-star-inserted")
    public AndroidElement nPay;
    @AndroidFindBy(className = "kt-menu__link-text ng-star-inserted")
    public AndroidElement ncb;
    @AndroidFindBy(className = "mat-expansion-panel-header-title")
    public AndroidElement advancedSearch;
    @AndroidFindBy(className = "mat-select-placeholder ng-tns-c27-9 ng-star-inserted")
    public AndroidElement select;

    public DropDownListPage(AndroidDriver driver) {
        super(driver);
    }


    public void selectOptionByIndex() {
        Select selectOption = new Select(select);
        selectOption.selectByIndex(1);
    }

    public void selectOptionByValue() {
        Select selectOption = new Select(select);
        selectOption.selectByValue("1");
    }

    public void selectOptionByVisibleText() {
        Select selectOption = new Select(select);
        selectOption.selectByVisibleText("More Than");
    }


}
