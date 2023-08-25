package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascript_Demo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.youtube.com/");
		driver.get("https://www.meesho.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");//Scroll Down
		Thread.sleep(4000); // by wait the time and this keys used for throws execution
		js.executeScript("window.scrollBy(0,-2000);");//Scroll Up
		Thread.sleep(4000);
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		js.executeScript("window.scroll(0,0);");
		

		
	}

}
