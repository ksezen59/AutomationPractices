import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningTestNGPriority {

//    @Test(priority = 4)
//    public void login(){
//
//        System.out.println("Login");
//    }
//
//    @Test(priority = 2)
//    public void logout(){
//
//        System.out.println("Logout");
//
//    }
//    @Test (priority = 1)
//    public void navigate(){
//
//        System.out.println("Navigate");
//
//    }

    @Test
    public void login(){

        System.out.println("Login");

        Assert.assertEquals("Kerem","kerem");
    }

    @Test
    public void logout(){

        System.out.println("Logout");

    }
    @Test(dependsOnMethods = {"login","logout"})
    public void navigate(){

        System.out.println("Navigate");

    }



}
