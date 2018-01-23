import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import Screens.WelcomeScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by skloaner on 10/25/17.
 */

public class TestCreateAccount {

    final private static Logger log = Logger.getLogger(String.valueOf(WelcomeScreen.class));
    private AndroidDriver driver;

    @Before
    public void setUp() throws Exception {

        String APP_PACKAGE = "com.GoFundMe.GoFundMe.stage.debug";
        String APP_ACTIVITY = "com.GoFundMe.GoFundMe.ia_ui.main.MainActivity";
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "APK");
        File app = new File(appDir, "mobile-stage-debug.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage", APP_PACKAGE);
        capabilities.setCapability("appActivity", APP_ACTIVITY);
        try {
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            log.info("App Launched");

        } catch (WebDriverException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        } catch (Exception e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }
    }

    @After
    public void tearDown() throws Exception {
        if (driver != null) driver.quit();
    }

    @Test
    public void testCreateAccount() throws Exception {

        log.info("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< End");

        WelcomeScreen welcomeScreen = new WelcomeScreen(driver);

//        assertTrue(welcomeScreen.isWelcomeScreenPresent());
        assertTrue("Tap On Create Account Failed  ", welcomeScreen.tapCreateAccountButton());
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> End");
    }
}