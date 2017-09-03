package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "android:id/button2")
    private MobileElement dismissPopUp;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/sign_up")
    private MobileElement signUpButton;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/username")
    private MobileElement usernameFiled;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/password")
    private MobileElement userPasswordField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/login")
    private MobileElement logInButton;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/action_bar_root")
    private MobileElement loginFailedPopUp;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/alertTitle")
    private MobileElement loginIsFailedText;

    @AndroidFindBy(id = "android:id/message")
    private MobileElement emailAndOrPasswordIncorrectText;

    @AndroidFindBy(className = "android.widget.Button")
    private MobileElement buttonOkInloginFailedPopUp;

    public LoginPage closeDismissPopUp() {
        dismissPopUp.click();
        return this;
    }

    public LoginPage fillUserEmail(String userEmail) {
        usernameFiled.setValue(userEmail);
        return this;
    }

    public LoginPage fillUserPassword(String userPassword) {
        userPasswordField.setValue(userPassword);
        return this;
    }

    public InfoPage clickTheButtonLogIn() {
        logInButton.click();
        return new InfoPage(driver);
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
