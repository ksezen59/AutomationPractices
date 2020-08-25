import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class TestUISelector{

    AndroidDriver androidDriver;

    @Test
    public void testAppium() throws MalformedURLException {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "emulator-5554");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("app", "//Users/DigitalOffice/Downloads/selendroid-test-app-0.17.0.apk");
        myCapabilites.setCapability("fullReset", "false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);



        androidDriver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"io.selendroid.testapp:id/showToastButton\")").click();


        List<WebElement> listElements =
                androidDriver.findElementsByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\")");

        System.out.println("Total buttons present : " + listElements.size());

        for (WebElement linkText: listElements
        ) {

            if (linkText.getText().equals("Display Popup Window"))

            {

                linkText.click();
            }

        }


        androidDriver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.Button\").index(0)").click();

        int sizeOfCheckElements = androidDriver.findElementsByAndroidUIAutomator("UiSelector().checkable(false)").size();

        System.out.println(sizeOfCheckElements);




    }

    @AfterTest

    public void afterTest(){

        androidDriver.quit();
    }


}