import com.google.gson.Gson;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.json.JSONObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SwipeHistory_iOS {

    @Test
    public void testMyApp() throws MalformedURLException, InterruptedException {

         IOSDriver iosDriver;

        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "iOS");
        myCapabilites.setCapability("platformVersion", "13.2");
       myCapabilites.setCapability("deviceName", "iPhone 11 Pro Max");
        //myCapabilites.setCapability("udid","5A9DF591-E781-4652-9F76-B2F45A34A553");
        myCapabilites.setCapability("automationName", "XCUITest");
        myCapabilites.setCapability("app", "//Applications/UXPNative_simulator.app");
        myCapabilites.setCapability("fullReset", false);
        myCapabilites.setCapability("useNewWDA",true);

        System.out.println(myCapabilites.toString());

        Gson gson =  new Gson();
        String json = gson.toJson(myCapabilites);
        System.out.println(json);

        iosDriver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);

        Thread.sleep(5000);

        //List<WebElement> linkTexts = androidDriver.findElementsByClassName("android.view.View");

        WebElement clickableElement = iosDriver.findElementByClassName("android.view.View");

        clickableElement.click();

        Thread.sleep(3000);

        TouchAction touchAction = new TouchAction(iosDriver);

        int width = iosDriver.manage().window().getSize().getWidth();
        int height = iosDriver.manage().window().getSize().getHeight();

        System.out.println("Width is "+width+"and the height is "+height);


        int xStart= width/2;
        int xEnd= width/2;
        int yStart = height/2;
        int yEnd = height/10;

        touchAction.press(PointOption.point(xStart,yStart)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))).moveTo(PointOption.point(xEnd,yEnd)).release().perform();
        touchAction.press(PointOption.point(xStart,yStart)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))).moveTo(PointOption.point(xEnd,yEnd)).release().perform();

        Thread.sleep(1500);

        yEnd=height/10*9;

        touchAction.press(PointOption.point(xStart,yStart)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))).moveTo(PointOption.point(xEnd,yEnd)).release().perform();

        Thread.sleep(2000);
        WebElement backButton = iosDriver.findElementByClassName("android.widget.ImageView");

        backButton.click();

    }

}


