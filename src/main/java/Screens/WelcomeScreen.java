package Screens;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by skloaner on 10/25/17.
 */

public class WelcomeScreen extends Screen {

    final private static Logger log = Logger.getLogger(String.valueOf(WelcomeScreen.class));
    private AppiumDriver driver;

    public WelcomeScreen(AppiumDriver driver) {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    public boolean isWelcomeScreenPresent() {

        try {
            WebElement welcomeToSalesFlowLabel = driver.findElementByClassName("android.widget.TextView");
            WebElement createAccountButton = driver.findElementByName("CREATE ACCOUNT");
            WebElement logInButton = driver.findElementById("LOG IN");

            waitForElementToAppear(driver, welcomeToSalesFlowLabel, 3);
            waitForElementToAppear(driver, createAccountButton, 3);
            waitForElementToAppear(driver, logInButton, 3);
            log.info("On Welcome Screen ");
            return true;
        } catch (Exception e) {
            log.info(e.getMessage());
            return false;
        }
    }

    public boolean iSWelcomeLabelPresent() {

        try {
            WebElement welcomeToSalesFlowLabel = driver.findElementByClassName("android.widget.TextView");
            waitForElementToAppear(driver, welcomeToSalesFlowLabel, 3);
            log.info(welcomeToSalesFlowLabel.getText().toString() + "Is Present");
            return true;
        } catch (Exception e) {
            log.info(e.getMessage());
            return false;
        }
    }

    public boolean tapCreateAccountButton() {
        try {
            WebElement createAccountButton = driver.findElementById("com.tactile.tact:id/get_me_started");
            waitForElementToAppear(driver, createAccountButton, 3);
            createAccountButton.click();
            log.info(createAccountButton.getText().toString() + "Clicked");
            return true;
        } catch (Exception e) {
            log.info(e.getMessage());
            return false;
        }
    }

    public boolean tapLoginButton() {

        try {
            WebElement createAccountButton = driver.findElementById("com.tactile.tact:id/get_me_started");
            WebElement logInButton = driver.findElementById("com.tactile.tact:id/log_me_in");
            waitForElementToAppear(driver, createAccountButton, 3);
            logInButton.click();
            log.info(logInButton.getText().toString() + "Clicked");
            return true;
        } catch (Exception e) {
            log.info(e.getMessage());
            return false;
        }
    }
}