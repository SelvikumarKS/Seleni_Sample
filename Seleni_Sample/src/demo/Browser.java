package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.errorprone.annotations.Keep;

 
public class Browser {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	
		//driver.get("https://www.google.com/");
		//driver.findElement(By.id("input")).sendKeys("Arjun"+Keys.ENTER);
		
		//driver.findElement(By.name("q")).sendKeys("Vijay" +Keys.ENTER);
		driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);
		driver.navigate().to("https://www.meesho.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	/*	WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("ammathasweet");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("ammatha1234");
		WebElement sign=driver.findElement(By.name("login"));
		sign.click();*/
		
		
		
		
		
		

	}

	
}
