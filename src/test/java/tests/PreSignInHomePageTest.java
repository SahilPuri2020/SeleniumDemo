package tests;

import org.example.base.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.PreSignInHomePage;

public class PreSignInHomePageTest extends BaseTest {

    PreSignInHomePage homePage ;

    public PreSignInHomePageTest() {
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        homePage = new PreSignInHomePage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }




}
