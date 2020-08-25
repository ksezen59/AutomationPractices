import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearningParameters {


@Parameters("email")
    @Test
    public void login(String asdsa){

        System.out.println("Inside Login");
        System.out.println(asdsa);
    }
}
