package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConfirmRegisterPage extends BasePage {

    @AndroidFindBy(id = "com.medicom.maven.debug:id/account_created_icon")
    private MobileElement accountCreatedIcon;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/account_created_title")
    private MobileElement accountCreatedTitle;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/account_created_message")
    private MobileElement accountCreatedMessage;

    public boolean isAccountCreatedIconDisplayed() {
        return accountCreatedIcon.isDisplayed();
    }

    public boolean isAccountCreatedTitleDisplayed(String title) {
        return accountCreatedTitle.getText().equals(title);
    }

    public boolean isAccountCreatedMessageDisplayed(String message) {
        String getMessage = accountCreatedMessage.getText();
        return getMessage.contains(message);
    }

    public ConfirmRegisterPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public BasePage initializePage() {
        return null;
    }

}
