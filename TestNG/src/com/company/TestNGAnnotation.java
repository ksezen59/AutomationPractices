package com.company;

import org.testng.annotations.*;

public class TestNGAnnotation {

    @BeforeClass

    public void beforeClass(){

        System.out.println("Selenium Driver initialized.");
    }


    @BeforeMethod

    public void initPreqs(){

        System.out.println("Preqs are set");
    }

    @Test

    public void firstTest(){

        System.out.println("This is first test");

    }

    @Test
    public void secondTest(){

         System.out.println("This is second test");
}

@AfterMethod

    public void afterMethod(){

    System.out.println("Tests are finished. Congrats.");
}

@AfterClass

    public void destroySelenium(){

    System.out.println("Selenium was destroyed.");
}


}
