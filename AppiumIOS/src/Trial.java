import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Test;
import org.openqa.selenium.remote.CommandInfo;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.openqa.selenium.remote.http.HttpClient;
import org.openqa.selenium.remote.internal.ApacheHttpClient;
import org.openqa.selenium.remote.internal.HttpClientFactory;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;


public class Trial{

    IOSDriver iosDriver;

    @Test
    public void testAppium() throws MalformedURLException {

        DesiredCapabilities myCapabilites = new DesiredCapabilities();

        myCapabilites.setCapability("platformName", "iOS");
        myCapabilites.setCapability("platformVersion", "12,4");
        myCapabilites.setCapability("deviceName", "KeremSimulator");
        myCapabilites.setCapability("automationName", "XCUITest");
        myCapabilites.setCapability("webDriverAgentUrl","http://0.0.0.0:4723/wd/hub/");
        myCapabilites.setCapability("app", "//Users/DigitalOffice/Desktop/DigitalBanking.app");
        myCapabilites.setCapability("appWaitActivity", 999999999);
        myCapabilites.setCapability("fullReset", "false");


        iosDriver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub/"), myCapabilites);

    }}