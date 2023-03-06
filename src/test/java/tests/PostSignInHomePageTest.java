package tests;

import org.example.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PreSignInHomePage;
import pages.PostSigInInHomePage;
import pages.LoginPage;

public class PostSignInHomePageTest extends BaseTest {
    PreSignInHomePage homePage;
    LoginPage loginPage;
    PostSigInInHomePage loggedInHomePage;
    @BeforeMethod
    public void setup(){
        initialization();
        homePage = new PreSignInHomePage(driver);
        loginPage = homePage.hoverAccounts();
        loginPage.enterLoginId();
        loginPage.enterContinue();
        loginPage.enterPassword();
        loggedInHomePage = loginPage.enterSignIn();
    }
    @Test (priority = 2)
    public void checkAmazonTitle() {
        Assert.assertTrue(loggedInHomePage.isLogoPresent());
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
