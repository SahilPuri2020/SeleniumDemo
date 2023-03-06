package org.example.utils;

import org.example.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ActionsWrappers extends BaseTest {

    static WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
    public static void Click(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }


    public static void sendKeys(WebElement element, String str) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(str);
    }
}

