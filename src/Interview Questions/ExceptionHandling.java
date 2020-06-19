package test;

import java.io.IOException;
import java.util.logging.Logger;

public class ExceptionHandling {
	
	
	public static class myService{
		public static double getPoints(String id) {
			double customerId = Integer.valueOf(id);
			return customerId;
		}
		public static void save(String customerId,double newPoints) {
			//Save the object
		}
	}

	public boolean redeemPoint(String customerId, String amount) throws IOException
	{ 
		try {
			Logger log 
            = Logger.getLogger( 
                ExceptionHandling.class.getName()); 
			Double toRedeem = Double.valueOf(amount); 
			double currentPoints = myService.getPoints(customerId); 
			double newPoints = currentPoints - toRedeem; 
			myService.save(customerId,newPoints); 
			log.info("Points redeemed for customer {}"+customerId); 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			return true;
		}
	}


}
