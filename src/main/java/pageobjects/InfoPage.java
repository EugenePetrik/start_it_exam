package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class InfoPage extends BasePage {

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Skip\"]")
    @AndroidFindBy(accessibility = "Navigate up")
    private MobileElement closeAdsButton;

    public AppMainPage closeAdIfDisplayed() {
        if (closeAdsButton.isDisplayed()) closeAdsButton.click();

        return new AppMainPage(driver);
    }

    public InfoPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public BasePage initializePage() {
        return null;
    }

}
