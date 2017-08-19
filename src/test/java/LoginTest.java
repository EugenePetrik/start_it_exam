import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.AppMainPage;
import pageobjects.DisclaimerPage;
import pageobjects.InfoPage;
import pageobjects.LoginPage;

public class LoginTest extends BaseTest {

    @Test(description = "Login as user")
    public void loginAsUser() throws Exception {

        InfoPage loginPage = new LoginPage(driver)
                .closePopUp()
                .fillUserEmail("maventests+patient+1@gmail.com")
                .filUserPassword("Password11")
                .clickTheButtonLogIn();

        new DisclaimerPage(driver).clickIAgreeButtonIfDisplayed();

        new InfoPage(driver).closeAdIfDisplayed();

        Assert.assertTrue(new AppMainPage(driver).isPageTitleDisplayed("Patient1 Patient"));
    }

}
