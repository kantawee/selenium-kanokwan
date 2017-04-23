package webDriverPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class USPSquicktoolExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// step 1: Open Web browser
		WebDriver browser = new FirefoxDriver();
		
		// step 2: Enter https://www.usps.com/ and click on enter button
		browser.get("https://www.usps.com/");
		//maximize the window
		browser.manage().window().maximize();
		Thread.sleep(3000);
		
		// step 3: click on quick tools
		browser.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
		
		// Step 4: click on find USPS locations
		browser.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a/span")).click();
	
		// step 5: enter zipcode as 20879 and click on search button
		browser.findElement(By.name("address")).sendKeys("20879");
		// wait for 5 seconds for search button to enable
		// Thread.sleep (5000);
		Thread.sleep(5000);
		
		//click on Search
		browser.findElement(By.id("bSearch")).click();
		
		// close browser :driver.close(); and driver.quick();
		browser.close();
		
		
		
		
	}

}
