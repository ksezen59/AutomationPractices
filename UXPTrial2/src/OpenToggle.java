import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class OpenToggle {

    @Test
    public void testMyApp() throws MalformedURLException, InterruptedException {

        AndroidDriver androidDriver;

        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus 5 API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("app", "//Users/keremsezen/Downloads/app-debug (1).apk");
        myCapabilites.setCapability("fullReset", "false");

        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);

        Thread.sleep(5000);

        TouchAction touchAction = new TouchAction(androidDriver);

        int width = androidDriver.manage().window().getSize().getWidth();
        int height = androidDriver.manage().window().getSize().getHeight();

        System.out.println("Width is "+width+"and the height is "+height);


        int xStart= width/2;
        int xEnd= width/10;
        int yStart = height/2;
        int yEnd = height/2;

//        touchAction.press(PointOption.point(xStart,yStart)).waitAction(new WaitOptions().withDuration(Duration.ofMillis(500))).moveTo(PointOption.point(xEnd,yEnd)).release().perform();
//
//        Thread.sleep(1500);
//
////       List<WebElement> bottomButtons =  androidDriver.findElementsByClassName("android.view.ViewGroup");
////                        WebElement profileButton = androidDriver.findElementByXPath("android.view.ViewGroup[@index='2']");
//
//        for (WebElement bottomButton: bottomButtons
//             ) {
////            System.out.println(bottomButton.());
//        }
////        WebElement toggleButton = androidDriver.findElementByClassName("android.widget.Switch");
//
//
 }
//
}
