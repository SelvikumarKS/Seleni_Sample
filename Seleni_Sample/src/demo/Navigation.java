package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://adactinhotelapp.com//");
		driver.navigate().to("https://www.google.com/");
		//driver.navigate().to("https://www.meesho.com/");
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
	}	

}
