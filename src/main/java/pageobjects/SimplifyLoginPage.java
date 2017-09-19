package pageobjects;

import enums.Platform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SimplifyLoginPage extends BasePage {

    @iOSFindBy(accessibility = "Skip")
    private MobileElement skipSimplifyLogin;

    public AppMainPage clickSkipSimplifyLogin() {
        if (BasePage.platform.equals(Platform.IOS)) {
            if (skipSimplifyLogin.isDisplayed()) skipSimplifyLogin.click();
        }
        return new AppMainPage(driver);
    }

    public SimplifyLoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public BasePage initializePage() {
        return null;
    }
}
