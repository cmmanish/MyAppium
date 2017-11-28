import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.logging.Logger;

import Screens.WelcomeScreen;
import io.appium.java_client.AppiumDriver;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by manish on 10/30/17.
 */

public class TestJunit {


    final private static Logger log = Logger.getLogger(String.valueOf(TestJunit.class));

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCreateAccount() throws Exception {
        log.info("TestJunit");
    }
}
