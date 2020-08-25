import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class Capabilities{

    AndroidDriver androidDriver;

    @Test
    public void testAppium() throws MalformedURLException {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus S API 24");
        myCapabilites.setCapability("automationName","UiAutomator2");
        myCapabilites.setCapability("app", "//Users/DigitalOffice/Downloads/selendroid-test-app-0.17.0.apk");
        myCapabilites.setCapability("appWaitActivity",999999999);
        myCapabilites.setCapability("fullReset","false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);


        androidDriver.findElementsByClassName("android.widget.Button");

        List <WebElement> buttons = androidDriver.findElementsByClassName("android.widget.Button");

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

