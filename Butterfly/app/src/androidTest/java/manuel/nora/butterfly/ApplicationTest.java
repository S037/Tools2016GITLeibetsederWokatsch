package manuel.nora.butterfly;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
	
	int a = 0;
	int b = 1;
	int c = a + b;
	
	String d = "I'm a FANCEY git string :-)";
    }
}