package exception;
import junit.framework.*;
public class SiTest extends TestCase {
	public void testSimple_Interest() {
		Assert.assertEquals(1200.0,Simple_interest.simple_Interest(10000.0, 3.0, 4.0),0);
	}
}
