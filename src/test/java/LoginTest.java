import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.AppMainPage;
import pageobjects.DisclaimerPage;
import pageobjects.LoginPage;

public class LoginTest extends BaseTest {

    @Test(description = "Login as user")
    public void loginAsUser() throws Exception {

       new LoginPage(driver)
                .closePopUp()
                .fillUserEmail("maventests+patient+1@gmail.com")
                .fillUserPassword("Password11")
                .clickTheButtonLogIn();

        new DisclaimerPage(driver)
                .clickIAgreeButtonIfDisplayed()
                .closeAdIfDisplayed();

        Assert.assertTrue(new AppMainPage(driver).isPageTitleDisplayed("Patient1 Patient"));
    }

}
