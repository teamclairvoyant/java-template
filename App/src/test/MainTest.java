import com.clairvoyant.projectName.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class MainTest {
    //Test Code Goes Here

    @Test
    public void testMethod() throws IOException {
        Main m = new Main();

        m.sampleMethod();
        System.out.println("This is Test Method");
    }

    public void setUp() {
    }

    @Before
    public void beforeMethod() {
    }

    @After
    public void afterMethod() {
    }
}
