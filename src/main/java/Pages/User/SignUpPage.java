package Pages.User;

import Utilities.Base.AndroidPageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebDriver;
import io.appium.java_client.android.AndroidElement;

public class SignUpPage extends AndroidPageBase {

    public SignUpPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "tvCountryCodeNumber")
    public AndroidElement openCountryCodeDialog;
    @AndroidFindBy(id = "cl_select_egypt")
    public AndroidElement countryCodeEG;
    @AndroidFindBy(id = "etCurrentNumber")
    public AndroidElement phoneNumberTx;
    @AndroidFindBy(id = "btn_continue")
    public AndroidElement btnContinue;
    @AndroidFindBy(id = "et_confirm_code")
    public AndroidElement verificationCodeBt;
    @AndroidFindBy(id = "btn_confirm_code")
    public AndroidElement verificationCodeConfirmBt;
    @AndroidFindBy(id = "tvResendVeri")
    public AndroidElement resendBt;
    @AndroidFindBy(id = "image_close_screen")
    public AndroidElement backCompleteProfileBt;
    @AndroidFindBy(id = "iv_profile_picture")
    public AndroidElement profilePicture;
    @AndroidFindBy(id = "et_full_name")
    public AndroidElement fullNameTx;
    @AndroidFindBy(id = "et_email")
    public AndroidElement emailTx;
    @AndroidFindBy(id = "tvGenderType")
    public AndroidElement genderDialog;
    @AndroidFindBy(id = "cl_select_male")
    public AndroidElement maleGender;
    @AndroidFindBy(id = "cl_select_female")
    public AndroidElement femaleGender;
    @AndroidFindBy(id = "ic_close_dialog")
    public AndroidElement cancelGenderDialog;
    @AndroidFindBy(id = "btn_confirm_changes")
    public AndroidElement saveBt;
    @AndroidFindBy(xpath = "//*[@text='Camera']")
    public AndroidElement cameraBt;
    @AndroidFindBy(xpath = "//*[@text='Gallery']")
    public AndroidElement GalleryBt;
    @AndroidFindBy(id = "touch_outside")
    public AndroidElement outSideBt;
    @AndroidFindBy(id= "textview_send_verivication_code")
    public AndroidElement incorrectVerificationCode;



    public void addPhoneNumber(String phoneNumber) {
        phoneNumberTx.sendKeys(phoneNumber);
    }

    public void addVerificationCode(String verificationCode) {
        verificationCodeBt.sendKeys(verificationCode);
    }

    public void openCountryCodeDialog() {
        openCountryCodeDialog.click();
    }

    public void selectCountryCodeEG() {
        countryCodeEG.click();
    }
    public void clickContinue() {
        btnContinue.click();
    }

    public void clickVerificationCodeConfirmBt() {
        verificationCodeConfirmBt.click();
    }
    public void clickResendBt() {
        resendBt.click();
    }

    public void clickBackCompleteProfileBt() {
        backCompleteProfileBt.click();
    }

    public void clickProfilePicture() {
        profilePicture.click();
    }

    public void addFullName(String fullName) {
        fullNameTx.sendKeys(fullName);
    }

    public void addEmailTx(String email) { emailTx.sendKeys(email); }


    public void clickGenderDialog() {
        genderDialog.click();
    }

    public void clickMaleGender() {
        maleGender.click();
    }
    public void clickFemaleGender() {
        femaleGender.click();
    }

    public void clickCancelGenderDialog() {
        cancelGenderDialog.click();
    }

    public void clickSaveBt() {
        saveBt.click();
    }

    public void clickCameraBt() {
        cameraBt.click();
    }

    public void clickGalleryBt() {
        GalleryBt.click();
    }

    public void clickOutSideBt() {
        outSideBt.click();
    }





}
