import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class TryMyApp {

    AndroidDriver androidDriver;


    @Test
    public void testAppium() throws MalformedURLException {


        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "Android");
        myCapabilites.setCapability("platformVersion", "7.0");
        myCapabilites.setCapability("deviceName", "Nexus 5 API 24");
        myCapabilites.setCapability("automationName", "UiAutomator2");
        myCapabilites.setCapability("appPackage", "com.android.dialer");
        myCapabilites.setCapability("app", "/Users/keremsezen/Desktop/app-debug(1).apk");
        myCapabilites.setCapability("fullReset", "false");


        androidDriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);
    }
}
