import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SauceLabs_iOS_Safari {

    IOSDriver iosDriver;


    @Test
    public void automate() throws MalformedURLException {

        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("browserName","Safari");
        myCapabilites.setCapability("deviceName","iPhone X Simulator");
        myCapabilites.setCapability("platformName","iOS");
        myCapabilites.setCapability("platformVersion","11.3");
        myCapabilites.setCapability("appiumVersion","1.9.1");

        iosDriver = new IOSDriver(new URL("http://ksezen59:e09fb206-bb1d-460e-b7ff-622a7d5ae8fa@ondemand.eu-central-1.saucelabs.com:80/wd/hub"), myCapabilites);





                if(myCapabilites.getCapability("platformName").equals("iOS"))
                {
                    iosDriver.findElementById("");
                    iosDriver.get("https://google.com");
                }

    }
}
