
package demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) throws Exception 
		{
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://corporate.spicejet.com/default.aspx");
		    Actions act=new Actions(driver);
		    Thread.sleep(2000);
			act.moveToElement(driver.findElement(By.xpath("//a[@id='ctl00_HyperLinkLogin']"))).build().perform();
			Thread.sleep(2000);
			act.doubleClick(driver.findElement(By.linkText("Travel Agent Login"))).build().perform();
			Thread.sleep(2000);
		
			act.contextClick(driver.findElement(By.linkText("Media Center")));
			
			
			
				
	}

}
