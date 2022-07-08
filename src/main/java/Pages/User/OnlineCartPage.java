package Pages.User;

import Utilities.Base.AndroidPageBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OnlineCartPage extends AndroidPageBase {


    public OnlineCartPage(AndroidDriver driver) {
        super(driver);
    }


    @AndroidFindBy(id = "tvCountryCodeNumber")
    public AndroidElement openCountryCodeDialog;

    @AndroidFindBy(id = "cl_select_egypt")
    public AndroidElement countryCodeEG;

    @AndroidFindBy(id = "btn_continue")
    public AndroidElement btnContinue;

    @AndroidFindBy(id = "etCurrentNumber")
    public AndroidElement phoneNumberTx;

    @AndroidFindBy(id = "etNewPassword")
    public AndroidElement passwordTx;

    @AndroidFindBy(id = "btnLogin")
    public AndroidElement confirmBt;

    @AndroidFindBy(id= "tv_search_main")
    public AndroidElement successMsg;

    @AndroidFindBy(id = "cartImg")
    public AndroidElement basketBt;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View/android.view.View[3]")
    public AndroidElement clearAllBt;

    @AndroidFindBy(id = "btnCancelDelete")
    public AndroidElement cancelDeleteBt;

    @AndroidFindBy(id = "btnConfirmDelete")
    public AndroidElement confirmDeleteBt;

    @AndroidFindBy(xpath = "//*[@text='Add other item']")
    public AndroidElement addOtherItemBt;

    @AndroidFindBy(xpath = "//*[@text='Checkout']")
    public AndroidElement checkoutBt;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View/android.view.View[1]/android.view.View[4]")
    public AndroidElement deleteCardBt;

   // @AndroidFindBy(xpath = "//*[@text='Checkout']")
    //public AndroidElement checkoutScreen;

    @AndroidFindBy(id = "count")
    public AndroidElement checkoutScreen;

    @AndroidFindBy(xpath = "//*[@text='Products']")
    public AndroidElement cart;

    @AndroidFindBy(id = "tvNotAvailble")
    public AndroidElement notAvailableItem;

    @AndroidFindBy (xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView[1]")
    public AndroidElement deleteItemBt;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]")
    public AndroidElement emptyScreen;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[2]/android.view.View[3]/android.view.View")
    public AndroidElement orderNowBt;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]")
    public AndroidElement dismissBasket;

    @AndroidFindBy(id = "cl_select_ksa")
    public AndroidElement countryCodeKSA;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.TextView[1]")
    public AndroidElement unavailableItemNote;

    @AndroidFindBy(id = "back")
    public AndroidElement backToCartBt;

    @AndroidFindBy(id = "continueAnyWay")
    public AndroidElement continueAnywayBt;

    @AndroidFindBy(id = "cancel")
    public AndroidElement cancelCheckout;

    @AndroidFindBy(id = "image_view_close")
    public AndroidElement backFromCart;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup")
    public AndroidElement deleteItemPopup;

    @AndroidFindBy(id = "textView")
    public AndroidElement zeroPrice;

    @AndroidFindBy(xpath =
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.View/android.view.View/android.widget.ScrollView/android.view.View/android.view.View")
    public AndroidElement closeStore;

    @AndroidFindBy(id = "onlineCartsBadge")
    public AndroidElement cartCounter;

    public void openCountryCodeDialog() { openCountryCodeDialog.click(); }

    public void selectCountryCodeEG() { countryCodeEG.click(); }

    public void addPhoneNumber(String phoneNumber) { phoneNumberTx.sendKeys(phoneNumber); }

    public void clickContinue() {
        btnContinue.click();
    }

    public void addPassword(String password) { passwordTx.sendKeys(password); }

    public void clickConfirm () { confirmBt.click(); }

    public void clickClearAllBt() {clearAllBt.click();}

    public void clickCancelDeleteBt() {cancelDeleteBt.click();}

    public void clickConfirmDeleteBt() {confirmDeleteBt.click();}

    public void clickBasketBt () {basketBt.click();}

    public void clickAddOtherItemBt () {addOtherItemBt.click();}

    public void clickCheckBt () {checkoutBt.click();}

    public void clickDeleteCardBt () {deleteCardBt.click();}

    public void clickCart () {cart.click();}

    public void clickDeleteItemBt () {deleteItemBt.click();}

    public void clickOrderNowBt () {orderNowBt.click();}

    public void clickDismissBasket () {dismissBasket.click();}

    public void selectCountryCodeKSA() {
        countryCodeKSA.click();
    }

    public void clickBackToCartBt() {
        backToCartBt.click();
    }

    public void clickContinueAnywayBt() {
        continueAnywayBt.click();
    }

    public void clickCancelCheckout() { cancelCheckout.click(); }

    public void clickBackFromCart() {backFromCart.click();}



}
