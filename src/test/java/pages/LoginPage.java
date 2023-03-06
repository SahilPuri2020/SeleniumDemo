package pages;

import org.example.base.BaseTest;
import org.example.utils.ActionsWrappers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[contains(text(),'Email or mobile')]")
    WebElement SignInText;

    @FindBy(xpath = "//input[@type='email']")
    WebElement emailIdTextBox;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement continueButton;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passTextBox;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    WebElement signInButton;

    public void enterLoginId() {
        ActionsWrappers.sendKeys(emailIdTextBox , prop.getProperty("emailID"));
    }

    public void enterPassword() {
        ActionsWrappers.sendKeys(passTextBox , prop.getProperty("password"));
    }

    public void enterContinue(){
        ActionsWrappers.Click(continueButton);
    }

    public PostSigInInHomePage enterSignIn(){
        ActionsWrappers.Click(signInButton);
        return new PostSigInInHomePage(driver);
    }

    public boolean isLoginTextFieldPresent() {
        return emailIdTextBox.isDisplayed();
    }

    public boolean isPassTextFieldPresent() {
        return passTextBox.isDisplayed();
    }
}
