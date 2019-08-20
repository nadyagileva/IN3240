package testautomation.assignmentIN3240;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWebElement {
	WebDriver driver;

	//@FindBy(linkText = "Login")
	//WebElement loginBtn;

	
	//Static initElement method of PageFactory class for initializing WebElement
	public LoginWebElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Login
	public void loginValidUser() {
		driver.get("https://itera-qa.azurewebsites.net");	
		
		
		WebElement login = driver.findElement(By.linkText("Login"));
		login.click();
		
		
		WebElement username = driver.findElement(By.id("Username"));
		WebElement userpassword = driver.findElement(By.id("Password"));
		WebElement submit = driver.findElement(By.name("login"));
		
		username.click();
		username.sendKeys("Test900");
		
		userpassword.click();
		userpassword.sendKeys("Example");
		
		submit.click();
		
		/**
	     * fill in the code to complete the method
	    */
		
		
		
	}
}
