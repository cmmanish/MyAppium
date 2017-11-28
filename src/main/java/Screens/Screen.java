package Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;

/**
 * Created by skloaner on 10/25/17.
 */

public class Screen {

    public void waitForScreenToLoad(AppiumDriver lDriver, WebElement element, int seconds) {

        WebDriverWait wait = new WebDriverWait(lDriver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToAppear(AppiumDriver lDriver, WebElement element, int seconds) {

        WebDriverWait wait = new WebDriverWait(lDriver, seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
