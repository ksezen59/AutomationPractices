import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class TestingLog4J {

    @Test
    public void testLogs(){

        WebDriver driver = new SafariDriver();
        driver.get("https://google.com");

    }
}
