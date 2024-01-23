package Pages.Mobile;

import Constant.GlobalConstant;
import Steps.BaseSteps;
import Utilities.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {
    static LoginPage instance;

    @FindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'Username' or . = 'Username')]")
    public WebElement userNameTxb;
    @FindBy(xpath = "//*[@class = 'android.widget.EditText' and (@text = 'Password' or . = 'Password')]")
    WebElement passwordTxb;

    @FindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = 'LOGIN' or . = 'LOGIN')]")
    WebElement loginBtn;

    @FindBy(xpath = "//*[@class = 'android.widget.TextView' and (@text = '"+ GlobalConstant.LOGIN_ERORR_MESSAGE +"')]")
    WebElement errorMessage;


    @FindBy(xpath = "//*[(@text = 'PRODUCTS')]")
    WebElement products;
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
    public void checkProductScreenIsExist() {
        hardAssert.assertTrue(isDisplayed(products));
    }
}
