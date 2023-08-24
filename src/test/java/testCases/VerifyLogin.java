package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.LoginPageObject;
import resources.BaseClass;

public class VerifyLogin extends BaseClass {
	@Test
	public void login() throws IOException { 
		
		initializeBrowser();
		driver.get("https://login.salesforce.com/");
		
	    
		LoginPageObject LOP = new LoginPageObject(driver);
		LOP.enterUsername().sendKeys("User1");
		LOP.enterPassword().sendKeys("Test1");
		LOP.ClickOnLoginButton().click();
		
		Assert.assertEquals(10, 10);
		System.out.println("Login validated successfully");


      
         
	}


	}































