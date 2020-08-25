import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.io.IOException;
import java.net.URL;
import java.util.List;


public class Dialer {


    AndroidDriver androidDriver;


    @Test
    public void testAppium() throws IOException, InterruptedException {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus S API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("appPackage", "com.android.dialer");
        myCapabilites.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
        myCapabilites.setCapability("fullReset", "false");

        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);

        androidDriver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Contacts']")).click();

        Thread.sleep(2000);

        List<WebElement> contacts = androidDriver.findElementsById("com.android.dialer:id/cliv_name_textview");

        for (WebElement searchedContact:
             contacts) {

            if (searchedContact.getText().equals("Oguzhan Cengiz")){

                searchedContact.click();
                Thread.sleep(2000);
                androidDriver.findElementById("com.android.contacts:id/icon").click();
                break;
            }

        }

    }

    @AfterTest

    public void afterTest () {

        androidDriver.quit();
    }


}
