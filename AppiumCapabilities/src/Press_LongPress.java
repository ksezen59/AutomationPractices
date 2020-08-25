import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Press_LongPress{

    AndroidDriver androidDriver;


    @Test
    public void testAppium() throws MalformedURLException  {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus 5 API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("appPackage", "com.android.dialer");
        myCapabilites.setCapability("appActivity","com.android.dialer.DialtactsActivity");
        myCapabilites.setCapability("fullReset", "false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);
        TouchAction action = new TouchAction(androidDriver);

        WebElement button = androidDriver.findElementById("com.android.dialer:id/voice_search_button");

        Point location = button.getLocation();
        Dimension size = button.getSize();
        int x = location.getX() + (size.getWidth() / 2);
        int y = location.getY() + (size.getHeight() / 2);

        action.press(PointOption.point(x,y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4))).release().perform();
//        action.release();
//
////        action.longPress(PointOption.point(x,y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3))).release();
//        action.perform();

    }


    @AfterTest

    public void afterTest(){

        androidDriver.quit();
    }


}