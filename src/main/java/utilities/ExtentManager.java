package utilities;

import java.io.*;

import com.relevantcodes.extentreports.*;

public class ExtentManager 
{
	private static ExtentReports extent;
	public static ExtentReports getInstance(String fileName)
	{
		if(extent==null)
		{
			extent=new ExtentReports(fileName,true,DisplayOrder.NEWEST_FIRST);
			
			extent.loadConfig(new File(System.getProperty("user.dir")+"//reportConfig.xml"));
			
			extent.addSystemInfo("selenium version","4.4.0").addSystemInfo("AutomationTesting","running");
		}
		return extent;
	}
}
