import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class TestDataFile {

    @DataProvider(name = "myDataProvider")
    public static Object[][] testData(Method m) {

            Object[][] obj = null;

        if (m.getName().equals("registerUser")) {
            obj = new Object[3][4];
            obj[0][0] = "Kerem";
            obj[0][1] = "Sezen";
            obj[0][2] = "ksezen59@gmail.com";
            obj[0][3] = "123";

            obj[1][0] = "Rishil";
            obj[1][1] = "Patel";
            obj[1][2] = "rishilpatel@gmail.com";
            obj[1][3] = "456";

            obj[2][0] = "Ali";
            obj[2][1] = "Aslan";
            obj[2][2] = "aliaslan@gmail.com";
            obj[2][3] = "789";
        }

        if (m.getName().equals("loginUser")) {
            obj = new Object[3][2];


            obj[0][0] = "ksezen59@gmail.com";
            obj[0][1] = "123";


            obj[1][0] = "rishilpatel@gmail.com";
            obj[1][1] = "456";


            obj[2][0] = "aliaslan@gmail.com";
            obj[2][1] = "789";

        }

//    @DataProvider(name = "myLoginProvider")
//    public static  Object[][] loginTestData(){
//
//        Object[][] obj = new Object[3][2];
//
//        obj[0][0] = "ksezen59@gmail.com";
//        obj[0][1] = "123";
//
//
//        obj[1][0] = "rishilpatel@gmail.com";
//        obj[1][1] = "456";
//
//
//        obj[2][0] = "aliaslan@gmail.com";
//        obj[2][1] = "789";
//        return obj;

        return obj; }
}
