package demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Takescreenshrot_Demo {
	public static void main(String args[]) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.meesho.com/");
    Thread.sleep(2000);
    driver.manage().window().maximize();
    File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    Files.copy(f,new File("C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Takescreenshot\\meeshoo.png"));
	}   
}

