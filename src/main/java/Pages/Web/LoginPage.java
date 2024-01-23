package Pages.Web;

import Steps.BaseSteps;
import Utilities.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends PageBase {
    static LoginPage instance;

    @FindBy(xpath = "//*[@id ='user-name']")
    public WebElement userNameTxb;
    @FindBy(xpath = "//*[@id ='password']")
    WebElement passwordTxb;

    @FindBy(xpath = "//*[@id ='login-button']")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@class='error-button']//..")
    WebElement errorMessage;

    //*[@class='error-button']//..

    public LoginPage(WebDriver driver) {
        super(driver);

    }
    public static LoginPage getInstance(WebDriver driver) {

            instance = new LoginPage(driver);

        return instance;
    }
    public static LoginPage get() {
        if (instance == null) {
            instance = new LoginPage(BaseSteps.driver);
        }
        return instance;
    }

    public LoginPage addCredential(String usNa, String Pass){
        setText(userNameTxb,usNa);
        setText(passwordTxb,Pass);

        return this;
    }
    public void clickLogin(){

        click(loginBtn);

    }


    public void checkErrorMessage() {
   hardAssert.assertTrue(isDisplayed(errorMessage));
    }
}
