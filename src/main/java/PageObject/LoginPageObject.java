package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {

	WebDriver driver;
	
	By username=By.xpath("//input[@id='username']");
	
    By password=By.xpath("//input[@name='pw']");
    
    By loginButton=By.xpath("//input[@id='Login']");

    By signUp=By.xpath("//a[@id='signup_link']");
    
    public LoginPageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
    	
    	this.driver=driver2;
	}

	public WebElement enterUsername(){
    	return driver.findElement(username);
    }

    public WebElement enterPassword(){
    	return driver.findElement(password);
    }

    public WebElement ClickOnLoginButton(){
    	return driver.findElement(loginButton);
    }

    public WebElement Clickontryforfree(){
    	
		return driver.findElement(signUp);

    }
}