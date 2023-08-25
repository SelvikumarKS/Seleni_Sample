package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement day=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
	   
		
		//WebElement day=driver.findElement(By.name("DOB_Daybbffd5e6"));
		Select s=new Select(day);
		s.selectByIndex(2);
		 //s.selectByValue("05");
		//s.selectByVisibleText("26");
		
		

	}

}
