import enums.Platform;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobjects.*;

public class LoginTest extends BaseTest {

    @Test(description = "Log In with correct credentials")
    public void loginWithCorrectCredentials() throws Exception {

        LoginPage loginUserPage = new LoginPage(driver);

        if (BasePage.platform.equals(Platform.ANDROID)) {
            loginUserPage.closeDismissPopUp();
        }

        loginUserPage
                .fillUserEmail("maventests+patient+1@gmail.com")
                .fillUserPassword("Password11")
                .clickTheButtonLogIn()
                .clickIAgreeButtonIfDisplayed()
                .closeAdIfDisplayed();

        Assert.assertTrue(new AppMainPage(driver)
                .isPageTitleDisplayed("Patient1 Patient"));
    }

    @DataProvider
    public Object[][] credentials() {
        return new Object[][] {
                { "some.email@example.com", "" },
                { "maventests+patient+1@gmail.com", "PasswordQWERTY" },
                { "", "Password11"},
                { "", "" }
        };
    }

    @Test(description = "Log In with incorrect credentials", dataProvider = "credentials")
    public void loginWithIncorrectCredentials(String email, String password) throws Exception {

        LoginPage loginUserPage = new LoginPage(driver);

        if (BasePage.platform.equals(Platform.ANDROID)) {
            loginUserPage.closeDismissPopUp();
        }

        loginUserPage
                .fillUserEmail(email)
                .fillUserPassword(password)
                .clickTheButtonLogIn();

        Assert.assertTrue(loginUserPage
                .isLoginFailedPopUpDisplayed());
        Assert.assertTrue(loginUserPage
                .isLoginIsFailedTextDisplayed("Log In failed"));
        Assert.assertTrue(loginUserPage
                .isEmailAndOrPasswordIncorrectTextDisplayed("Email and/or password incorrect!"));

        loginUserPage
                .closeloginFailedPopUp();
    }
}
