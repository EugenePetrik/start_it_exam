import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.ConfirmRegisterPage;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;

public class RegisterTest extends BaseTest {

    @Test(description = "Register as user with correct params")
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
                .fillalternativeEmail()
                .fillAlternativePhoneNumber("0984561237")
                .selectGender("Male")
                .fillAddress("Avenue Street 15/A")
                .fillCity("New York City")
                .clickSignUpUser();

        ConfirmRegisterPage confirmPage = new ConfirmRegisterPage(driver);
        Assert.assertTrue(confirmPage.isAccountCreatedIconDisplayed());
        Assert.assertTrue(confirmPage.isAccountCreatedTitleDisplayed("Check your mailbox."));
        Assert.assertTrue(confirmPage.isAccountCreatedMessageDisplayed("Please, check your inbox for further instructions."));
    }

}
