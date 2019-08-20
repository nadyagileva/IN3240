package testautomation.assignmentIN3240;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CustomerWebElement {
	WebDriver driver;
	
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement createNewBtn; 
	
	
	//Static initElement method of PageFactory class for initializing WebElement
	public CustomerWebElement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
		
	public void create() {
		/**
	     * fill in the code to complete the method
	    */
		
		//driver.get("https://itera-qa.azurewebsites.net/Customer/Create"); //Mulig vi ikke kan bruke denne -> fiks hvis det er nødvendig 
		
		//WebElement createNew = driver.findElement(By.linkText("CREATE NEW")); 
		createNewBtn.click();
		
		WebElement name = driver.findElement(By.id("Name"));
		name.click();
		name.sendKeys("Test400");
		
		WebElement companyName = driver.findElement(By.id("Company"));
		companyName.click();
		companyName.sendKeys("IFI");
		
		WebElement addressName = driver.findElement(By.id("Address"));
		addressName.click();
		addressName.sendKeys("Vestgrensen 32");
		
		WebElement cityName = driver.findElement(By.id("City"));
		cityName.click();
		cityName.sendKeys("Oslo");
		
		WebElement phone = driver.findElement(By.id("Phone"));
		phone.click();
		phone.sendKeys("99999999");
		
		WebElement email = driver.findElement(By.id("Email"));
		email.click();
		email.sendKeys("Test400");
		
		WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
		submit.click();
		
	
	}
	
	public void findCustomer() {
		/**
	     * fill in the code to complete the method
	    */
		
		WebElement searchBar = driver.findElement(By.id("searching"));
		searchBar.clear();
		searchBar.click();
		searchBar.sendKeys("Test400");
		
		WebElement submitSearch = driver.findElement(By.xpath("//input[@value='Search']"));
		submitSearch.click();
	}
	
	public void update() {
		/**
	     * fill in the code to complete the method
	    */
		
		findCustomer();
		
		WebElement detailsBtn = driver.findElement(By.linkText("DETAILS"));
		detailsBtn.click();
		
		
		WebElement editBtn = driver.findElement(By.linkText("EDIT"));
		editBtn.click();
		
		WebElement phone = driver.findElement(By.id("Phone"));
		phone.clear();
		phone.click();
		phone.sendKeys("55555555");
		
		WebElement submit = driver.findElement(By.xpath("//input[@value='Save']"));
		submit.click();
	}
	
	public void delete() {
		/**
	     * fill in the code to complete the method
	    */
		
		findCustomer();
		
		WebElement deleteBtn = driver.findElement(By.linkText("DELETE"));
		deleteBtn.click();
		
		WebElement deleteBtnConfirm = driver.findElement(By.xpath("//input[@value='Delete']"));
		deleteBtnConfirm.click();
		
		WebElement logOut = driver.findElement(By.linkText("Log out"));
		logOut.click();
		
	}
}
