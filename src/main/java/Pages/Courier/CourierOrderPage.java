package Pages.Courier;

import Utilities.Base.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CourierOrderPage extends PageBase {
    public AppiumDriver<MobileElement> driver;


    public CourierOrderPage(AppiumDriver<MobileElement> driver) {
        super(driver);
        this.driver = driver;
    }

    @AndroidFindBy(id = "order_payment_type_container")
    public MobileElement order;

    @AndroidFindBy(id = "btnAccept")
    public  MobileElement btnAccept;

    @AndroidFindBy(id = "tvUpdateOrderStatus")
    public  MobileElement tvUpdateOrderStatus;

    @AndroidFindBy(id = "btnDone")
    public  MobileElement btnDone;

    @AndroidFindBy(id = "etPrice")
    public  MobileElement etPrice;

    @AndroidFindBy(id = "ibUpload")
    public  MobileElement ibUpload;

    @AndroidFindBy(xpath ="//*[@text='استخدام الكاميرا']")
    public  MobileElement userCamera;

    @AndroidFindBy(id = "btnSend")
    public MobileElement btnSend;

    @AndroidFindBy(xpath = "//*[@text='Orders panel']")
    public MobileElement OrdersPanel;

    @AndroidFindBy(xpath = "//*[@text='Running Orders']")
    public MobileElement RunningPanel;

}