package Listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {


    @Test(priority = 1)
    public void loginWithEmail(){

        System.out.println("Inside test login with email");

    }


    @Test(priority = 2)
    public void loginViaFacebook(){


        System.out.println("Inside test login with facebook");
//        Assert.assertEquals("myTest","mytest");
    }
}


