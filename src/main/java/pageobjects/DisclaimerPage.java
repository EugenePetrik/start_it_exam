package pageobjects;

import api.HttpModule;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.io.IOException;

public class DisclaimerPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout//android.widget.Button[@text=\"I AGREE\"]")
    private MobileElement iAgreeButton;

    public InfoPage clickIAgreeButtonIfDisplayed() throws IOException {
        if (HttpModule.methodPostLogin().equals("true")) {
            waitForElement(iAgreeButton);

            iAgreeButton.click();
        }
        return new InfoPage(driver);
    }

    public DisclaimerPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public BasePage initializePage() {
        return null;
    }

}
