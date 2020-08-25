import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;


public class Swipe{

    AndroidDriver androidDriver;


    @Test
    public void testAppium() throws MalformedURLException  {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus S API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("appPackage", "com.android.settings");
        myCapabilites.setCapability("appActivity","com.android.settings.Settings");
        myCapabilites.setCapability("fullReset", "false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);

        String str="Battery";

        androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+"\").instance(0))").click();



//        WebElement radioGroup = androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
//                + ".resourceId(\"android:id/list\")).scrollIntoView("
//                + "new UiSelector().text(\"Battery\"));");

//        for (WebElement text:
//             textViews) {
//
//            System.out.println(text.getText());
//
//            if(text.getText().equals("Storage")) {
//                Point location = text.getLocation();
//                Dimension size = text.getSize();
//                int x = location.getX() + (size.getWidth() / 2);
//                int y = location.getY() + (size.getHeight() / 2);
//
//                action.
//            }
//        }





//        List<WebElement> listElements = androidDriver.findElementsByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\")");
//        WebElement radioGroup = androidDriver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()" + ".resourceId(\"android:id/list\")).scrollIntoView("+ "new UiSelector().text(\"Battery\"));");



    }


    @AfterTest

    public void afterTest(){

        androidDriver.quit();
    }


}