import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.ConfirmRegisterPage;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;

import javax.print.DocFlavor;

public class RegisterTest extends BaseTest {

    @Test(description = "Register user with correct params")
    public void registerAsUserWithCorrectParams() throws Exception {
        new LoginPage(driver)
                .closeDismissPopUp()
                .clickToSignUpButton()
                .fillFirstName("First name")
                .fillLastName("Last name")
                .fillUserEmail("")              // auto generate user email
                .fillPassword("qwerty@13")
                .fillConfirmPassword("qwerty@13")
                .selectDiagnosis("None")
                .selectCountry("Ukraine")
                .fillPhoneNumber("0981234567")
                .clickButtonContinue()
                .fillAlternativeEmail()
                .fillAlternativePhoneNumber("0984561237")
                .selectGender("Male")
                .fillAddress("Avenue Street 15/A")
                .fillCity("New York City")
                .clickSignUpUser();

        ConfirmRegisterPage confirmPage = new ConfirmRegisterPage(driver);
        Assert.assertTrue(confirmPage
                .isAccountCreatedIconDisplayed());
        Assert.assertTrue(confirmPage
                .isAccountCreatedTitleDisplayed("Check your mailbox."));
        Assert.assertTrue(confirmPage
                .isAccountCreatedMessageDisplayed("Please, check your inbox for further instructions."));
        Assert.assertTrue(confirmPage
                .isEmailIsNotReceivedButtonDisplayed());
    }

    @DataProvider
    public Object[][] registerCredentials() {
        return new Object[][] {
                { "", "Last name", "email@example.com", "qwerty@13", "qwerty@13", "None", "Ukraine", "0981234567", "This field is required"}
        };
    }

    @Test(description = "Register user with incorrect params", dataProvider = "registerCredentials")
    public void registerAsUserWithIncorrectParams(String firstName, String lastName, String email, String pass, String passConfirm, String diagnos, String country, String phone, String errorMessage) throws Exception {
        new LoginPage(driver)
                .closeDismissPopUp()
                .clickToSignUpButton()
                .fillFirstName(firstName)
                .fillLastName(lastName)
                .fillUserEmail(email)
                .fillPassword(pass)
                .fillConfirmPassword(passConfirm)
                .selectDiagnosis(diagnos)
                .selectCountry(country)
                .fillPhoneNumber(phone)
                .clickButtonContinue();

        RegisterPage registerPage = new RegisterPage(driver);
        Assert.assertTrue(registerPage.isErrorTextDisplaed(errorMessage));
    }

}
