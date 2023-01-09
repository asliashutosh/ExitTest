package utilities;

import java.io.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class Screenshots 
{
	public static void takeScreenshot(WebDriver driver,String fileName)
	{
		String screenshotFileName=System.getProperty("user.dir")+"\\ScreenShotsFolder\\"+fileName+".jpg";
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(srcFile,new File(screenshotFileName));
		}
		catch(IOException f)
		{
			f.printStackTrace();
		}
	}
} 