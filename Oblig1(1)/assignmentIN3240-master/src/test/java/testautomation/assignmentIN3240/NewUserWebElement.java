package testautomation.assignmentIN3240;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserWebElement {
	WebDriver driver;

	//@FindBy(linkText = "Sign Up")
	//WebElement signUpBtn;
	
	//Static initElement method of PageFactory class for initializing WebElement
	public NewUserWebElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSignUpBtn() {
		
		driver.get("https://itera-qa.azurewebsites.net/");
		
		/**
	     * fill in the code to complete the method
	    */
		WebElement signUpNewUser = driver.findElement(By.linkText("Sign Up"));
		signUpNewUser.click();
		
		WebElement nameSignUp = driver.findElement(By.id("FirstName"));
		nameSignUp.click();
		nameSignUp.sendKeys("Test-gruppe");
		
		WebElement surnameSignUp = driver.findElement(By.id("Surname"));
		surnameSignUp.click();
		surnameSignUp.sendKeys("Gruppe");
		
		WebElement emailSignUp = driver.findElement(By.id("E_post"));
		emailSignUp.click();
		emailSignUp.sendKeys("Example@Example.com");
		
		
		WebElement mobileSignUp = driver.findElement(By.id("Mobile"));
		mobileSignUp.click();
		mobileSignUp.sendKeys("99999999");
		
		
		WebElement usernameSignUp = driver.findElement(By.id("Username"));
		usernameSignUp.click();
		usernameSignUp.sendKeys("Test900");
		
		WebElement passwordSignUp = driver.findElement(By.id("Password"));
		passwordSignUp.click();
		passwordSignUp.sendKeys("Example");
		
		WebElement confirmPasswordSignUp = driver.findElement(By.id("ConfirmPassword"));
		confirmPasswordSignUp.click();
		confirmPasswordSignUp.sendKeys("Example");
		
		
		WebElement signUp = driver.findElement(By.id("submit"));
		signUp.click();
	}
}
