package test.java.src.test.java.com.org.learningmaven;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test
    public  void loginTest(){

        System.out.println("Logging into account");

        WebDriver driver = new SafariDriver();
        driver.get("https://www.mynet.com");

    }
}
