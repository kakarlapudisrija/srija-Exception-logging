package exception;
import org.apache.logging.log4j.LogManager;
public class Cost {
	private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(Cost.class);
	public static double estimation(String material,double area,String automate)
	 {
		 double totalcost=0.0;
		 if(material=="standard")
		 {
			 totalcost=area*1200;
			 LOGGER.info(totalcost);
			 LOGGER.error("An Error Occurred");
			 LOGGER.warn("Code is Wrong");
			 LOGGER.fatal("Case Aborted");
		 }
		 else if(material=="above standard")
		 {
			 totalcost=area*1500;
			 LOGGER.info(totalcost);
			 LOGGER.error("An Error Occurred");
			 LOGGER.warn("Code is Wrong");
			 LOGGER.fatal("Case Aborted");
		 }
		 else if(material=="high standard" && automate=="no")
		 {
			totalcost=area*1800; 
			LOGGER.info(totalcost);
			 LOGGER.error("An Error Occurred");
			 LOGGER.warn("Code is Wrong");
			 LOGGER.fatal("Case Aborted");
		 }
		 else if(material=="high standard" && automate=="yes")
		 {
			 totalcost=area*2500;
			 LOGGER.info(totalcost);
			 LOGGER.error("An Error Occurred");
			 LOGGER.warn("Code is Wrong");
			 LOGGER.fatal("Case Aborted");
		 }
		 return totalcost;
	 }
}
