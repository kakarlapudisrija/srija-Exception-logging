package exception;
import org.apache.logging.log4j.LogManager;
public class Si {
	private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(Cost.class);
	public static double simple_Interest(double amount,double rate,double time)
	{
		LOGGER.info((amount*time*rate)/100);
		LOGGER.error("An Error Occurred");
		LOGGER.warn("Code is Wrong");
		LOGGER.fatal("Case Aborted");
		return (amount*time*rate)/100;
	}
}
