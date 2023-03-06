package pages;

import org.example.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostSigInInHomePage extends BaseTest {
    public PostSigInInHomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@id='nav-logo-sprites']")
    WebElement amazonLogo;

    public boolean isLogoPresent() {
        return amazonLogo.isDisplayed();
    }
}
