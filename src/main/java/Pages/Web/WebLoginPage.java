package Pages.Web;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import Utilities.Base.WebPageBase;

import java.util.concurrent.TimeUnit;

public class WebLoginPage extends WebPageBase {

    public WebDriver webDriver;

    public WebLoginPage(WebDriver driver) {
        super(driver);
        this.webDriver = driver;
    }

    @FindBy(id = "email")
   public WebElement emailTxtBox;

    @FindBy(id = "password")
    public WebElement passwordTxtBox;

    @FindBy(id = "btn_login kt_login_signin_submit")
    public  WebElement loginBtn;

    @FindBy(id = "kt_aside_menu")
    public WebElement kt_aside_menu;

    @FindBy(linkText = "Orders")
    public  WebElement Orders;

    @FindBy(linkText = "Orders List")
    public WebElement OrdersList;

    @FindBy(id = "mat-expansion-panel-header-0")
    public WebElement searchPanel;

    @FindBy(id = "order_number")
    public WebElement order_number;

    @FindBy(id = "select_OrderStatus")
    public WebElement chooseDelivered;

    @FindBy(xpath = "//*[@id=\"mat-option-18\"]/span")
    public WebElement delivered;

    @FindBy(id = "btn_search")
    public WebElement btn_search;

    @FindBy(xpath = "m//*[@id=\"cdk-drop-list-0\"]/tbody/tr/td[9]/button/span/mat-icon")
    public WebElement orderDetails;


}
