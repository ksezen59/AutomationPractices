import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;


public class Screenshot {


    AndroidDriver androidDriver;


    @Test
    public void testAppium() throws IOException {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus S API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("appPackage", "com.google.android.deskclock");
        myCapabilites.setCapability("appActivity", "com.android.deskclock.DeskClock");
        myCapabilites.setCapability("fullReset", "false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);

        String staticFileName = "Kerem";

        File file = androidDriver.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(file,new File("/Users/digitaloffice/Desktop/TestScreenshots/" + staticFileName + LocalDateTime.now()+".png"));




    }

        @AfterTest

        public void afterTest () {

            androidDriver.quit();
        }


    }
