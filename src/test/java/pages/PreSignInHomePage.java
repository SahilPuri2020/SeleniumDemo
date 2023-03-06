package pages;

import org.example.base.BaseTest;
import org.example.utils.ActionsWrappers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreSignInHomePage extends BaseTest {

    @FindBy(xpath = "//*[text()='Account & Lists']")
    WebElement Accounts;

    public PreSignInHomePage(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }

    public LoginPage hoverAccounts(){
        ActionsWrappers.Click(Accounts);
        return new LoginPage(driver);
    }





}
