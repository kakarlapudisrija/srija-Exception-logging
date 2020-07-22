package exception;
import junit.framework.TestCase;
import junit.framework.Assert;
public class CiTest extends TestCase {
	public void testCompound_Interest() {
		Assert.assertEquals(1255.0881000000008,Compound_interest.compound_Interest(10000.0, 3.0, 4.0),0);
	}
}
