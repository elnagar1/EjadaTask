package Pages.Web;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import Utilities.Base.WebPageBase;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage extends WebPageBase {

    public WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        super(driver);

        this.webDriver = driver;
    }

    @FindBy(id = "email")
    WebElement emailTxtBox;

    @FindBy(id = "password")
    WebElement passwordTxtBox;

    @FindBy(id = "btn_login kt_login_signin_submit")
    WebElement loginBtn;

    @FindBy(id = "kt_aside_menu")
    WebElement kt_aside_menu;

    @FindBy(linkText = "Orders")
    WebElement Orders;

    @FindBy(linkText = "Orders List")
    WebElement OrdersList;

    @FindBy(id = "mat-expansion-panel-header-0")
    WebElement searchPanel;

    @FindBy(id = "order_number")
    WebElement order_number;

    @FindBy(id = "select_OrderStatus")
    WebElement chooseDelivered;

    @FindBy(xpath = "//*[@id=\"mat-option-18\"]/span")
    WebElement delivered;

    @FindBy(id = "btn_search")
    WebElement btn_search;

    @FindBy(xpath = "m//*[@id=\"cdk-drop-list-0\"]/tbody/tr/td[9]/button/span/mat-icon")
    WebElement orderDetails;



    public void clickLogin(String email, String password) {
        webDriver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");
        setTextElementText(emailTxtBox, email);
        setTextElementText(passwordTxtBox, password);
        clickButton(loginBtn);
    }


    public void LunchWeb(String orderNumber) throws InterruptedException {

        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        Actions action = new Actions(webDriver);
        action.moveToElement(kt_aside_menu).perform();

        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        Orders.click();
        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        OrdersList.click();
        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        searchPanel.click();
        order_number.sendKeys(orderNumber);
        chooseDelivered.click();
        delivered.click();
        btn_search.click();
        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");

        action.moveToElement(orderDetails).perform();
        orderDetails.click();

    }

}
