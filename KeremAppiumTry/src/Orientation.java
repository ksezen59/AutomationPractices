import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Orientation{


    AndroidDriver androidDriver;
    ScreenOrientation orientation;


    @Test
    public void testAppium() throws MalformedURLException, InterruptedException {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus S API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("appPackage", "com.google.android.apps.messaging");
        myCapabilites.setCapability("appActivity","com.google.android.apps.messaging.ui.ConversationListActivity");
        myCapabilites.setCapability("fullReset", "false");
         androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);
        androidDriver.manage().timeouts().implicitlyWait(4999, TimeUnit.MILLISECONDS);


        Thread.sleep(10000);

        orientation = ScreenOrientation.LANDSCAPE;
        androidDriver.execute(DriverCommand.SET_SCREEN_ORIENTATION, ImmutableMap.of("orientation",orientation.value().toUpperCase()));

        Thread.sleep(2000);

        orientation = ScreenOrientation.PORTRAIT;
        androidDriver.execute(DriverCommand.SET_SCREEN_ORIENTATION, ImmutableMap.of("orientation",orientation.value().toUpperCase()));



    }


    @AfterTest

    public void afterTest(){

        androidDriver.quit();
    }


}
