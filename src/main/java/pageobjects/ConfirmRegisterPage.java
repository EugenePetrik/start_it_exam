package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ConfirmRegisterPage extends BasePage {

    @AndroidFindBy(id = "com.medicom.maven.debug:id/account_created_icon")
    private MobileElement accountCreatedIcon;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Check your mailbox.\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/account_created_title")
    private MobileElement accountCreatedTitle;

    @iOSFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeStaticText[2]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/account_created_message")
    private MobileElement accountCreatedMessage;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Click here if email is not received in a moment.\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/resend_validation_link")
    private MobileElement emailIsNotReceivedButton;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"LOG IN\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/login")
    private MobileElement logInButton;

    public boolean isAccountCreatedIconDisplayed() {
        return accountCreatedIcon.isDisplayed();
    }

    public boolean isAccountCreatedTitleDisplayed(String title) {
        return accountCreatedTitle.getText().equals(title);
    }

    public boolean isAccountCreatedMessageDisplayed(String message) {
        return accountCreatedMessage.getText().contains(message);
    }

    public boolean isEmailIsNotReceivedButtonDisplayed() {
        return emailIsNotReceivedButton.isDisplayed();
    }

    public InfoPage clickTheButtonLogIn() {
        logInButton.click();
        return new InfoPage(driver);
    }

    public ConfirmRegisterPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public BasePage initializePage() {
        return null;
    }

}
