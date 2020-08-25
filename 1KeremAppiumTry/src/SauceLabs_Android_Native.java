import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class SauceLabs_Android_Native {

    AndroidDriver androidDriver;

    @Test
    public void testApp() throws MalformedURLException {

        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("deviceName","Samsung Galaxy S7 Edge GoogleAPI Emulator");
        myCapabilites.setCapability("platformName","Android");
        myCapabilites.setCapability("platformVersion","8.1");
        myCapabilites.setCapability("appiumVersion","1.13.0");
        myCapabilites.setCapability("app", "sauce-storage:selendroid-test-app.apk");
        myCapabilites.setCapability("appWaitActivity",999999999);
        myCapabilites.setCapability("fullReset","false");

        androidDriver = new AndroidDriver(new URL("http://ksezen59:e09fb206-bb1d-460e-b7ff-622a7d5ae8fa@ondemand.eu-central-1.saucelabs.com:80/wd/hub"), myCapabilites);

        androidDriver.findElementsByClassName("android.widget.Button");

        List<WebElement> buttons = androidDriver.findElementsByClassName("android.widget.Button");

        System.out.println("Buttons avaliable on screen"+buttons.size());


        for (WebElement button:buttons)
        {

            System.out.println(button.getText());

            if (button.getText().equals("Displays a Toast")){

                button.click();
            }
        }

//        for (int i=0;i<buttons.size();i++){
//
////            System.out.println(buttons.get(i).getText());
////
////            System.out.println(buttons.get(i).getAttribute("text"));
//
//            if(buttons.get(i).getText().equals("Display text view"))
//            {
//
//                buttons.get(i).click();
//
//            }


    }


        /*MobileElement el2 = (MobileElement) androidDriver.findElementByAccessibilityId("my_text_fieldCD");
        el2.click();

        MobileElement el3 = (MobileElement) androidDriver.findElementByClassName("io.selendroid.testapp/.HomeScreenActivity");

        el3.click();

        System.out.println(androidDriver.findElementByAccessibilityId("my_text_fieldCD").getAttribute("text"));?*/




    @AfterTest

    public void afterTest(){

        androidDriver.quit();
    }

}




