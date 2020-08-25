import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;


public class ZoomPinch{


    AndroidDriver androidDriver;


    @Test
    public void testAppium() throws MalformedURLException  {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus S API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("appPackage", "com.google.android.apps.photos");
        myCapabilites.setCapability("appActivity","com.google.android.apps.photos.home.HomeActivity");
        myCapabilites.setCapability("fullReset", "false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);

        TouchAction touchAction = new TouchAction(androidDriver);


    }


    @AfterTest

    public void afterTest(){

        androidDriver.quit();
    }


}