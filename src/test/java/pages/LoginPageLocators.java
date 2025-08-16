package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageLocators 
{
	
	WebDriver driver;
	public LoginPageLocators(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username= By.xpath("//input[@id='user-name']");
	public WebElement userName()
	{
		
		return driver.findElement(username);
	}
	By password= By.xpath("//input[@id='password']");
	public WebElement password()
	{
		
		return driver.findElement(password);
	}
	
	By loginButton= By.xpath("//input[@id='login-button']"); 
    
	public WebElement loginButton()
    {
    	return driver.findElement(loginButton);
    }
}
