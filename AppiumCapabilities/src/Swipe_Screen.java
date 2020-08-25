import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class Swipe_Screen{


    AndroidDriver androidDriver;


    @Test
    public void testAppium() throws MalformedURLException  {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus S API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("appPackage", "com.google.android.deskclock");
        myCapabilites.setCapability("appActivity","com.android.deskclock.DeskClock");
        myCapabilites.setCapability("fullReset", "false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);

        TouchAction touchAction = new TouchAction(androidDriver);

        int width = androidDriver.manage().window().getSize().getWidth();
        int height = androidDriver.manage().window().getSize().getHeight();

        System.out.println("Width is "+width+"and the height is "+height);


        int xStart= width*4/5;
        int xEnd= width/5;
        int yStart = height/2;
        int yEnd = height/2;

        touchAction.press(PointOption.point(xStart,yStart)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))).moveTo(PointOption.point(xEnd,yEnd)).release().perform();

         xStart= width/5;
         xEnd= width*4/5;
         yStart = height/2;
         yEnd = height/2;

        touchAction.press(PointOption.point(xStart,yStart)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))).moveTo(PointOption.point(xEnd,yEnd)).release().perform();
        touchAction.press(PointOption.point(xStart,yStart)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))).moveTo(PointOption.point(xEnd,yEnd)).release().perform();

        xStart= width/5;
        xEnd= width/5;
        yStart = height*4/5;
        yEnd = height*2/5;

        touchAction.press(PointOption.point(xStart,yStart)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))).moveTo(PointOption.point(xEnd,yEnd)).release().perform();



    }


    @AfterTest

    public void afterTest(){

        androidDriver.quit();
    }


}