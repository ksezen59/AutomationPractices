import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.io.IOException;
import java.net.URL;


public class KeyEvents {


    AndroidDriver androidDriver;


    @Test
    public void testAppium() throws IOException, InterruptedException {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus S API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("appPackage", "com.google.android.deskclock");
        myCapabilites.setCapability("appActivity", "com.android.deskclock.DeskClock");
        myCapabilites.setCapability("fullReset", "false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);

       androidDriver.findElementById("com.google.android.deskclock:id/fab").click();
       Thread.sleep(2500);
//       androidDriver.pressKey(new KeyEvent(AndroidKey.BACK));

//        androidDriver.findElementById("com.google.android.deskclock:id/search_button").click();
//
//        androidDriver.getKeyboard().sendKeys("Istan");
        androidDriver.pressKey(new KeyEvent(AndroidKey.SETTINGS));



    }

    @AfterTest

    public void afterTest () {

        androidDriver.quit();
    }


}
