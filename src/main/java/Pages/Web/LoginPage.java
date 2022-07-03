package Pages.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import Utilities.Base.WebPageBase;

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


    public void clickLogin(String email, String password) {
        webDriver.navigate().to("https://dashboard-dev.shgardi.app/auth/login");
        setTextElementText(emailTxtBox, email);
        setTextElementText(passwordTxtBox, password);
        clickButton(loginBtn);
    }


    public void LunchWeb(String orderNumber) throws InterruptedException {
        webDriver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        //Creating object of an Actions class
        Actions action = new Actions(webDriver);
        //Performing the mouse hover action on the target element.
        action.moveToElement(webDriver. findElement(By.id("kt_aside_menu"))).perform();

        webDriver.findElement(By.linkText("Orders")).click();
        webDriver.findElement(By.linkText("Orders List")).click();
        webDriver.findElement(By.id("mat-expansion-panel-header-0")).click();
        webDriver.findElement(By.id("order_number")).sendKeys(orderNumber);
        webDriver.findElement(By.id("btn_search")).click();
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(3000);
        action.moveToElement(webDriver.findElement(By.xpath("//*[@id=\"cdk-drop-list-0\"]/tbody/tr/td[9]/button/span/mat-icon"))).perform();
        webDriver.findElement(By.xpath("//*[@id=\"cdk-drop-list-0\"]/tbody/tr/td[9]/button/span/mat-icon")).click();

    }

}
