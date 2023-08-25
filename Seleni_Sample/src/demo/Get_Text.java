package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_Text {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://omayo.blogspot.com/");
		String text = driver.findElement(By.id("pah")).getText();
		System.out.println(text);

	}

}
