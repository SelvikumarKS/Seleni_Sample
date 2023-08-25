package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_Dmeo {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		
		// simple Alert
		driver.findElement(By.id("s_alert1")).click();
		Alert simple = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(simple.getText());
		simple.accept();

		// confirm Alert

		driver.findElement(By.id("c_alert2")).click();
		Alert confirm = driver.switchTo().alert();
		Thread.sleep(2000);
		confirm.dismiss();

		// prompt Alert

		driver.findElement(By.xpath("//button[@id='p_alert3']")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Hello Java");
		Thread.sleep(3000);
		prompt.accept();

	}

}
