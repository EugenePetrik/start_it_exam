package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

    @AndroidFindBy(id = "android:id/button2")
    private MobileElement closePopup;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/sign_up")
    private MobileElement signUpButton;

    public LoginPage closePopUp() {
        closePopup.click();
        return this;
    }

    public RegisterPage clickToSignUpButton() {
        signUpButton.click();
        return new RegisterPage(driver);
    }

    public LoginPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public BasePage initializePage() {
        return null;
    }

}
