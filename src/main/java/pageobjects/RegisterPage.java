package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterPage extends BasePage {

    @AndroidFindBy(id = "com.medicom.maven.debug:id/first_name_field")
    private MobileElement firstNameField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/last_name_field")
    private MobileElement lastNameField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/email_field")
    private MobileElement emailField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/password_field")
    private MobileElement passwordField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/confirm_password_field")
    private MobileElement confirmPasswordField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/diagnosis_field")
    private MobileElement diagnosisField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"Hemophilia A\"]")
    private MobileElement diagnosisHemophiliaAField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"Hemophilia B\"]")
    private MobileElement diagnosisHemophiliaBField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"None\"]")
    private MobileElement diagnosisNoneField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/country_field")
    private MobileElement countryField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"United States\"]")
    private MobileElement coutryUSAField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"United Kingdom\"]")
    private MobileElement coutryUKField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"France\"]")
    private MobileElement coutryFranceField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"Ukraine\"]")
    private MobileElement coutryUkraineField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/phone_number_value")
    private MobileElement phoneNumberField;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Continue\"]")
    private MobileElement continueButton;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/textInputLayoutAlternativeEmail")
    private MobileElement alternativeEmailField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/textInputLayoutAlternativePhoneNumber")
    private MobileElement alternativePhoneNumberField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/textInputLayoutGender")
    private MobileElement genderField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"None\"]")
    private MobileElement genderNoneField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"Male\"]")
    private MobileElement genderMaleField;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout//android.widget.CheckedTextView[@text=\"Female\"]")
    private MobileElement genderFemaleField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/textInputLayoutAddress")
    private MobileElement addressField;

    @AndroidFindBy(id = "com.medicom.maven.debug:id/textInputLayoutCity")
    private MobileElement cityField;

    @AndroidFindBy(xpath = "//android.widget.Button[@text=\"Sign Up\"]")
    private MobileElement signUp;

    private DateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
    private Date date = new Date();
    private final String USERNAME = sdf.format(date) + "@example.com";

    public RegisterPage fillFirstName(String name) {
        firstNameField.setValue(name);
        return this;
    }

    public RegisterPage fillLastName(String name) {
        lastNameField.setValue(name);
        return this;
    }

    public RegisterPage fillUserEmail(String userEmail) {
        if (userEmail.isEmpty()) {
            emailField.setValue(USERNAME);
        } else {
            emailField.setValue(userEmail);
        }
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
        return this;
    }

    public RegisterPage fillPhoneNumber(String phoneNumber) {
        phoneNumberField.setValue(phoneNumber);
        return this;
    }

    public RegisterPage clickButtonContinue() {
        continueButton.click();
        return this;
    }

    public RegisterPage fillalternativeEmail() {
        alternativeEmailField.setValue(USERNAME);
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
