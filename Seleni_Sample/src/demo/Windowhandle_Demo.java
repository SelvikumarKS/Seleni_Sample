package demo;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowhandle_Demo {
	public static void main(String args[]) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://letcode.in/windows");
	
	driver.manage().window().maximize();
	driver.findElement(By.id("home")).click();
	String windowhandle=driver.getWindowHandle();
	System.out.println(windowhandle);
    //driver.close();
     //driver.quit();
	Set<String> whs=driver.getWindowHandles();
	System.out.println(whs);
	//List<String>list=new ArrayList<String>(whs);
	//driver.switchTo().window(list.get(0));
   // System.out.println(driver.getCurrentUrl());
	//driver.close();*/

	
	
	}

}
