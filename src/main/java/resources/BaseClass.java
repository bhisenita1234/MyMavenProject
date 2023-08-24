package resources;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class BaseClass {
	
	public WebDriver driver;
	
	public void initializeBrowser() throws IOException {
		
		 
		//this is to access file
		FileInputStream fis = new FileInputStream("C:\\Users\\Pooja\\eclipse-workspace\\MyMavenProject\\src\\main\\java\\resources\\Data.Properties");
	
		//Read the file data
		Properties prop = new Properties();
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else {
			System.out.println("please select correct browser to run test cases....");
		
		
		}
		
	}

}
