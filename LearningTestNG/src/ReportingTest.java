import org.testng.Assert;
import org.testng.annotations.Test;

public class ReportingTest {

    @Test
    public void login(){

        System.out.println("Login");
    }

    @Test
    public void logout(){

        System.out.println("Logout");
        Assert.assertEquals("Kerem","kerem");

    }
}
