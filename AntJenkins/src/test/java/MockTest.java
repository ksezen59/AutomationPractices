package test.java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class MockTest {


        @Test
    public void loginTest(){

        WebDriver wd = new ChromeDriver();
        wd.get("https://www.w3schools.com");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        System.out.println("Login test");



    }

}
