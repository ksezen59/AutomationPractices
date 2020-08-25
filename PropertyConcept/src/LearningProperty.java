import org.testng.annotations.Test;

import java.io.*;
import java.util.Properties;

public class LearningProperty {

    Properties properties;
    FileInputStream fs;
    @Test
    public void testProperty() throws IOException {

        fs = new FileInputStream(System.getProperty("user.dir")+"//config.properties");
        properties = new Properties();
        properties.load(fs);
        System.out.println(properties.getProperty("name"));

    }
}
