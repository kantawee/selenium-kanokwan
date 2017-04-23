package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PhpTravelsHomework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
	//open webdirver through firefox	
	WebDriver driver = new FirefoxDriver ();
	// open PHP Travels Website
	driver.get("http://www.phptravels.net/");
	// click on my account
	driver.findElement(By.linkText("My Account")).click();
	// click on sign up
	driver.findElement(By.linkText("Sign Up")).click();
	// Enter First name, Last name, Mobile number, 
	// EnterEmail, Password and Confirm password
	driver.findElement(By.name("firstname")).sendKeys("Kanokwan");
	driver.findElement(By.name("lastname")).sendKeys("Ta");
	driver.findElement(By.name("phone")).sendKeys("7030000000");
	driver.findElement(By.name("email")).sendKeys("w.w@www.com");
	driver.findElement(By.name("password")).sendKeys("123456789");
	driver.findElement(By.name("confirmpassword")).sendKeys("123456789");
	//click on sign up button
	driver.findElement(By.xpath(".//*[@id='headersignupform']/div[9]/button")).click();
	// click on username
	Thread.sleep(5000);
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
	// click on sign out button
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
	
		
		

	}

}
