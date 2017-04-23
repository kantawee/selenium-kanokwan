package webDriverPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// step 1: Launch web browser
		// you can use "browser" in the word of "dirver"
		// need to keep it if browser has to be browser the whole thing
		// Also can launch to Chrome browser by putting ChromeDriver
		WebDriver browser = new FirefoxDriver();
		// step 2: go to google.com and click enter button
		browser.get("https://www.google.com/");
		// Step 3: enter "Herndon, VA" 
		browser.findElement(By.name("q")).sendKeys("Herndon, VA");
		// Step 4: click on search button
		browser.findElement(By.name("btnG")).click();
		
		// or we can write WebElement elemt = browser.findElement(By.name("q"));
		// element.sendKeys("Herndon, VA);
		// or WebElement element 1 = browser.findElement(By.name(btnG"));
		// element1.submit();
		
		
		
		
		
		
		
		
	}

}
