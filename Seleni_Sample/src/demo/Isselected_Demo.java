package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Isselected_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://omayo.blogspot.com/");
	System.out.println(driver.findElement(By.id("checkbox1")).isSelected());
		
		//System.out.println(driver.findElement(By.id("but2")).isEnabled());
		//System.out.println(driver.findElement
				//(By.xpath("//input[@class='gsc-search-button']")).isDisplayed());
		
		
		
		//String getattribute=
				//driver.findElement
				//(By.xpath("//input[@class=\"gsc-search-button\"]")).getAttribute("value");
			
		//System.out.println(getattribute);
		
	}

}
