import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by skloaner on 10/25/17.
 */

public class TestBaseClass {

    protected static AppiumDriver driver;

//    @Before
//    public void setUp() throws Exception {
//
//
//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "APK");
//        File app = new File(appDir, "TactApplication-automationTest-release.apk");
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("device", "Android");
//        capabilities.setCapability("deviceName", "Android");
//        capabilities.setCapability("app", app.getAbsolutePath());
//        capabilities.setCapability("apppackage", APP_PACKAGE);
//        capabilities.setCapability("appactivity", APP_ACTIVITY);
//        try {
//            driver = new AndroidDriver(new URL(URL), capabilities);
//            System.out.println("App Launched");
//
//        } catch (WebDriverException e) {
//            System.out.print(e.getMessage());
//            System.exit(0);
//        }
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        if (driver != null) driver.quit();
//    }
}