import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;



import java.net.MalformedURLException;
import java.net.URL;


public class Tapping{

AndroidDriver androidDriver;

    @Test
    public void testAppium() throws MalformedURLException {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus S API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("app", "//Users/DigitalOffice/Downloads/selendroid-test-app-0.17.0.apk");
        myCapabilites.setCapability("fullReset", "false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);
        WebElement button = androidDriver.findElementById("io.selendroid.testapp:id/showToastButton");
        TouchAction action = new TouchAction(androidDriver);

        Point location = button.getLocation();
        Dimension size = button.getSize();
        int x = location.getX() + (size.getWidth() / 2);
        int y = location.getY() + (size.getHeight() / 2);

        action.press(PointOption.point(x,y)).perform();


        float xButton = button.getLocation().getX();
        float yButton = button.getLocation().getY();

        System.out.println("X="+xButton+"and Y="+yButton);



    }


    @AfterTest

    public void afterTest(){

        androidDriver.quit();
    }


}