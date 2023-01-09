package utilities;

import java.io.*;
import java.util.Properties;

public class ReadingPropertiesFile 
{
	public static FileInputStream fis = null;
	public static Properties prop = new Properties();
	public static Properties key = new Properties();
	public static File file = null;

	static {

		try {
			File file = new File("./Resources/config.properties");
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static {

		try {
			File file = new File("./Resources/TestData.properties");
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
}
