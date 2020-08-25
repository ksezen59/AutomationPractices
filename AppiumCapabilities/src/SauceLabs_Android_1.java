import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabs_Android_1 {

    AndroidDriver androidDriver;

    @Test
    public void testApp() throws MalformedURLException {

        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("browserName","Chrome");
        myCapabilites.setCapability("deviceName","Samsung Galaxy S7 Edge GoogleAPI Emulator");
        myCapabilites.setCapability("platformName","Android");
        myCapabilites.setCapability("platformVersion","8.1");
        myCapabilites.setCapability("appiumVersion","1.13.0");

        androidDriver = new AndroidDriver(new URL("http://ksezen59:e09fb206-bb1d-460e-b7ff-622a7d5ae8fa@ondemand.eu-central-1.saucelabs.com:80/wd/hub"), myCapabilites);

        androidDriver.get("https://gmail.com");

        androidDriver.quit();



    }
}
