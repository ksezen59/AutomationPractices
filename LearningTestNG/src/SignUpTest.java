import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SignUpTest {

    @Test
    public void signUpViaEmail(){

        System.out.println("Sign up via email.");

//        Assert.assertEquals("kerem","Kerem");
//        Assert.assertTrue(4>5);

    }

    @Test
    public void signUpViaFacebook(){

        System.out.println("Sign up via facebook.");

        throw new SkipException("Facebook sign up is not supported yet.");

    }
    @Test
    public void signUpViaTwitter(){

        System.out.println("Sign up via twitter.");

    }

}
