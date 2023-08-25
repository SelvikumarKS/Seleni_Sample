package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://adactinhotelapp.com//");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("Umapathi596");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Uma@1234");
		WebElement sign=driver.findElement(By.name("login"));
		sign.click();
		
		
		/*driver.get("https://www.instagram.com/");
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("saranyavanij@gmail.com");
		WebElement pass=driver.findElement(By.name("password"));
		pass.sendKeys("Password@123");
		WebElement sign=driver.findElement(By.name("commit"));
		sign.click();*/
	
	}

}
