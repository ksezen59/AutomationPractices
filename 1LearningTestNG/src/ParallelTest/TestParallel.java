package ParallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestParallel {

    @Test
    public void test_1() throws InterruptedException {

        WebDriver webDriver = new SafariDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        webDriver.get("https://www.w3schools.org");

        webDriver.findElement(By.xpath("//*[@id=\"navbtn_examples\"]")).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("//*[@id=\"nav_examples\"]/div/div[2]/a[8]")).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("//*[@id=\"main\"]/a[1]")).click();

    }
}
