package day05;

import utilities.LoggerLoad;

public class Logger {
	public void testInfo()
	{
		int c,a=10, b=20;
		c=a+b;
		System.out.println("Value of c :"+ c);
		LoggerLoad.info("Info  - Addition of integers");
	}
	

	public void testError()
	{
		try
			{
			int i=1/0;
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
		finally
			{
			LoggerLoad.error("Error - You can not divide a number by zero");
			}
	
	}
	

	public void testWarn()
	{
		LoggerLoad.warn("Warning - Testing");
	}
	
	public static void main(String[] args) {
		
		Logger obj = new Logger();
		
		obj.testError();
		obj.testInfo();
		obj.testWarn();
		
	}
}


