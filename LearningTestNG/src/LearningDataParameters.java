import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataParameters {

    @Test(dataProviderClass = TestDataFile.class,dataProvider = "myDataProvider")
    public void registerUser(String firstName, String lastName, String email, String password){

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(password);

    }

    @Test(dataProviderClass = TestDataFile.class,dataProvider = "myDataProvider")
    public void loginUser( String email, String password){

        System.out.println(email);
        System.out.println(password);

    }

}
