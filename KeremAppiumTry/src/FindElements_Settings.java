import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class FindElements_Settings{

    AndroidDriver androidDriver;

    @Test
    public void testAppium() throws MalformedURLException {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus S API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("appPackage", "com.android.settings");
        myCapabilites.setCapability("appActivity","com.android.settings.Settings");
        myCapabilites.setCapability("fullReset", "false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);


        List<WebElement> linkTexts = androidDriver.findElementsById("android:id/title");

        for (WebElement linkText: linkTexts
             ) {

            if (linkText.getText().equals("Add email account"))

            {

                linkText.click();
            }

        }

    }

    @AfterTest

    public void afterTest(){

        androidDriver.quit();
    }


}