package pageobjects;

import enums.Platform;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

public class RegisterPage extends BasePage {

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@value=\"First Name\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/first_name_field")
    private MobileElement firstNameField;

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Last Name\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/last_name_field")
    private MobileElement lastNameField;

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Email\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/email_field")
    private MobileElement emailField;

    @iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value=\"Password\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/password_field")
    private MobileElement passwordField;

    @iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value=\"Confirm Password\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/confirm_password_field")
    private MobileElement confirmPasswordField;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Diagnosis\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/diagnosis_field")
    private MobileElement diagnosisField;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Hemophilia A\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"Hemophilia A\"]")
    private MobileElement diagnosisHemophiliaAField;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Hemophilia B\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"Hemophilia B\"]")
    private MobileElement diagnosisHemophiliaBField;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"None\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"None\"]")
    private MobileElement diagnosisNoneField;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Country\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/country_field")
    private MobileElement countryField;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"United States\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"United States\"]")
    private MobileElement coutryUSAField;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"United Kingdom\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"United Kingdom\"]")
    private MobileElement coutryUKField;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"France\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"France\"]")
    private MobileElement coutryFranceField;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Ukraine\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"Ukraine\"]")
    private MobileElement coutryUkraineField;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    private MobileElement buttonBack;

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Mobile Number\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/phone_number_value")
    private MobileElement phoneNumberField;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONTINUE\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Continue\"]")
    private MobileElement continueButton;

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Alternative email\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/textInputLayoutAlternativeEmail")
    private MobileElement alternativeEmailField;

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Alternative phone number\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/textInputLayoutAlternativePhoneNumber")
    private MobileElement alternativePhoneNumberField;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Gender\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/textInputLayoutGender")
    private MobileElement genderField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"None\"]")
    private MobileElement genderNoneField;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@value=\"Male\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"Male\"]")
    private MobileElement genderMaleField;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@value=\"Female\"]")
    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"Female\"]")
    private MobileElement genderFemaleField;

    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Address\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/textInputLayoutAddress")
    private MobileElement addressField;

    @iOSFindBy(xpath = "//XCUIElementTypeTextField[@value=\"City\"]")
    @AndroidFindBy(id = "com.medicom.maven.debug:id/textInputLayoutCity")
    private MobileElement cityField;

    @iOSFindBy(xpath = "//XCUIElementTypeButton[@value=\"SIGN UP\"]")
    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Sign Up\"]")
    private MobileElement signUp;

    public RegisterPage fillFirstName(String name) {
        firstNameField.setValue(name);
        return this;
    }

    public RegisterPage fillLastName(String name) {
        lastNameField.setValue(name);
        return this;
    }

    public RegisterPage fillUserEmail() {
        emailField.setValue(createUserNameForRegister());
        return this;
    }

    public RegisterPage fillPassword(String password) {
        passwordField.setValue(password);
        return this;
    }

    public RegisterPage fillConfirmPassword(String confirmPassword) {
        confirmPasswordField.setValue(confirmPassword);
        return this;
    }

    public RegisterPage selectDiagnosis(String diagnosis) {
        diagnosisField.click();

        switch(diagnosis) {
            case "Hemophilia A" : {
                diagnosisHemophiliaAField.click();
                break;
            }
            case "Hemophilia B" : {
                diagnosisHemophiliaBField.click();
                break;
            }
            case "None" : {
                diagnosisNoneField.click();
                break;
            }
        }
        return this;
    }

    public RegisterPage selectCountry(String country) {
        countryField.click();

        switch(country) {
            case "United States" : {
                coutryUSAField.click();
                break;
            }
            case "United Kingdom" : {
                coutryUKField.click();
                break;
            }
            case "France" : {
                coutryFranceField.click();
                break;
            }
            case "Ukraine" : {
                coutryUkraineField.click();
                break;
            }
        }

        if (BasePage.platform.equals(Platform.IOS)) buttonBack.click();

        return this;
    }

    public RegisterPage fillPhoneNumber(String phoneNumber) {
        phoneNumberField.setValue(phoneNumber);

        if (BasePage.platform.equals(Platform.IOS)) hideKeyboard();

        return this;
    }

    public RegisterPage clickButtonContinue() {
        continueButton.click();
        return this;
    }

    public RegisterPage fillAlternativeEmail() {
        alternativeEmailField.setValue(createUserNameForRegister());
        return this;
    }

    public RegisterPage fillAlternativePhoneNumber(String phoneNumber) {
        alternativePhoneNumberField.setValue(phoneNumber);
        return this;
    }

    public RegisterPage selectGender(String gender) {
        genderField.click();

        switch(gender) {
            case "None" : {
                genderNoneField.click();
                break;
            }
            case "Male" : {
                genderMaleField.click();
                break;
            }
            case "Female" : {
                genderFemaleField.click();
                break;
            }
        }
        return this;
    }

    public RegisterPage fillAddress(String address) {
        addressField.setValue(address);
        return this;
    }

    public RegisterPage fillCity(String city) {
        cityField.setValue(city);
        return this;
    }

    public ConfirmRegisterPage clickSignUpUser() {
        signUp.click();
        return new ConfirmRegisterPage(driver);
    }

    public RegisterPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @Override
    public BasePage initializePage() {
        return null;
    }

}
