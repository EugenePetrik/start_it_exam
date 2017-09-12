package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "android:id/button2")
    private MobileElement dismissPopUp;

    @iOSFindBy(accessibility = "Create an account")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/sign_up")
    private MobileElement signUpButton;

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Email\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/username")
    private MobileElement usernameFiled;

    @iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value=\"Password\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/password")
    private MobileElement userPasswordField;

    @iOSFindBy(accessibility = "LOG IN")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/login")
    private MobileElement logInButton;

    @iOSFindBy(xpath = "//XCUIElementTypeAlert[@name=\"Log In failed\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/action_bar_root")
    private MobileElement loginFailedPopUp;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Log In failed\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/alertTitle")
    private MobileElement loginIsFailedText;

    @iOSFindBy(accessibility = "Email and/or password incorrect!")
    @AndroidFindBy(id = "android:id/message")
    private MobileElement emailAndOrPasswordIncorrectText;

    @iOSFindBy(accessibility = "OK")
    @AndroidFindBy(className = "android.widget.Button")
    private MobileElement buttonOkInloginFailedPopUp;

    public LoginPage closeDismissPopUp() {
        if (dismissPopUp.isDisplayed()) dismissPopUp.click();

        return this;
    }

    public LoginPage fillUserEmail(String userEmail) {
        if (usernameFiled.getText().isEmpty()) {
            usernameFiled.clear();
        }
        usernameFiled.setValue(userEmail);
        return this;
    }

    public LoginPage fillUserPassword(String userPassword) {
        if (userPasswordField.getText().isEmpty()) {
            userPasswordField.clear();
        }
        userPasswordField.setValue(userPassword);
        return this;
    }

    public DisclaimerPage clickTheButtonLogIn() {
        logInButton.click();
        return new DisclaimerPage(driver);
    }

    public RegisterPage clickToSignUpButton() {
        signUpButton.click();
        return new RegisterPage(driver);
    }

    public boolean isLoginFailedPopUpDisplayed() {
        return loginFailedPopUp.isDisplayed();
    }

    public boolean isLoginIsFailedTextDisplayed(String logInFailed) {
        return loginIsFailedText.getText().equals(logInFailed);
    }

    public boolean isEmailAndOrPasswordIncorrectTextDisplayed(String emailAndOrPasswordIncorrect) {
        return emailAndOrPasswordIncorrectText.getText().equals(emailAndOrPasswordIncorrect);
    }

    public LoginPage closeloginFailedPopUp() {
        buttonOkInloginFailedPopUp.click();
        return this;
    }

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public BasePage initializePage() {
        return null;
    }

}
