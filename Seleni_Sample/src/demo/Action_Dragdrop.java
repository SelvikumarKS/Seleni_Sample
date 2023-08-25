package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Dragdrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Actions act=new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		act.contextClick(drag);
		Thread.sleep(4000);
		act.clickAndHold(drag).moveToElement(drop).release(drag).build().perform();
		act.dragAndDrop(drag,drop).perform();
		Thread.sleep(4000);
	
		
	
		
		


	}

}
