package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercurywebTour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open Firefox web browser
		WebDriver driver = new FirefoxDriver ();
		// Launch Mercury Website
		driver.get("http://newtours.demoaut.com/");
		// Print the title of the page
		driver.getTitle();
		// Print
		System.out.println(driver.getTitle());
		// Click on REGISTER link
		driver.findElement(By.linkText("REGISTER")).click();
		// Enter first name
		driver.findElement(By.name("firstName")).sendKeys("Kanokwan");
		// Enter last name
		driver.findElement(By.name("lastName")).sendKeys("T");
		// Enter phone number
		driver.findElement(By.name("phone")).sendKeys("0001112345");
		// Enter email
		driver.findElement(By.name("userName")).sendKeys("123@123415263");
		// Enter address
		driver.findElement(By.name("address1")).sendKeys("1425 Hiunt");
		// Enter city
		driver.findElement(By.name("city")).sendKeys("Springfield");
		// Enter State
		driver.findElement(By.name("state")).sendKeys("VA");
		// Enter postal code
		driver.findElement(By.name("postalCode")).sendKeys("22150");
		// Enter Username
		driver.findElement(By.id("email")).sendKeys("kt");
		// Enter Password
		driver.findElement(By.name("password")).sendKeys("123456789");
		// Enter ConfirmPassword
		driver.findElement(By.name("confirmPassword")).sendKeys("123456789");
		// Click on Submit
		driver.findElement(By.name("register")).click();
		// Close the browser
		driver.close();
		
		
		
		
		

	}
	
	
}