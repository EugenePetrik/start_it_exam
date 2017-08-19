package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AppMainPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    private MobileElement pageTitle;

    public boolean isPageTitleDisplayed(String title) {
        return pageTitle.getText().equals(title);
    }

    public AppMainPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public BasePage initializePage() {
        return null;
    }

}
