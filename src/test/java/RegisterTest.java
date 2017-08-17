import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ConfirmRegisterPage;
import pageobjects.LoginPage;

public class RegisterTest extends BaseTest {

    @Test(description = "Register as user")
    public void registerAsUser() throws Exception {
        ConfirmRegisterPage registerUser = new LoginPage(driver)
                .closePopUp()
                .clickToSignUpButton()
                .fillFirstName("First name")
                .fillLastName("Last name")
                .fillUserEmail()
                .fillPassword("qwerty@13")
                .fillConfirmPassword("qwerty@13")
                .selectDiagnosis("None")
                .selectCountry("Ukraine")
                .fillPhoneNumber("0981234567")
                .clickButtonContinue()
                .fillalternativeEmail()
                .fillAlternativePhoneNumber("0984561237")
                .selectGender("Male")
                .fillAddress("Avenue Street 15/A")
                .fillCity("New York City")
                .clickSignUpUser();

        Assert.assertTrue(registerUser.isAccountCreatedIconDisplayed());
        Assert.assertTrue(registerUser.isAccountCreatedTitleDisplayed("Check your mailbox."));
        Assert.assertTrue(registerUser.isAccountCreatedMessageDisplayed("Please, check your inbox for further instructions."));
    }

}
