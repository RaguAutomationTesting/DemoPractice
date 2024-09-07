package org.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	
	
	public static void laucnhBrowser(String browserName) {

		if (browserName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		}

		else if (browserName.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} 
		
		else if (browserName.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

	}
	
	
	public static void launchUrl(String url)
	{
		
		driver.get(url);
		
		
	}
	
	
	public static void maximize()
	{
		driver.manage().window().maximize();
		
		
	}
	
	
	public static void implicitlyWait() {
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void click(WebElement element) {
		
		if (element.isEnabled() & element.isDisplayed()) {
			
			element.click();
			
		}
		
		

	}
	
	public static void enterTxt(WebElement element, String value) {
		
		element.sendKeys(value);
		
		

	}
	
	

}
