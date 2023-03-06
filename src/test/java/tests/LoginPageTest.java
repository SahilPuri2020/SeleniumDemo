package tests;

import org.example.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PreSignInHomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    PreSignInHomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void setup(){
        initialization();
        homePage = new PreSignInHomePage(driver);
        loginPage = homePage.hoverAccounts();

    }

    @Test (priority = 1)
    public void signIn() {
        Assert.assertTrue(loginPage.isLoginTextFieldPresent());
        loginPage.enterLoginId();
        loginPage.enterContinue();

        Assert.assertTrue(loginPage.isPassTextFieldPresent());
        loginPage.enterPassword();
        loginPage.enterSignIn();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
