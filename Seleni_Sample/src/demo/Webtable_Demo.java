package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable_Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Seleni_Sample\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers/bse/groupa");
		WebElement table=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]"));
		System.out.println(table.getText());
	    List<WebElement>companyname=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	    for(int i=0;i<companyname.size();i++) {
	    System.out.println(companyname.get(i).getText());
	    }
	    }
}
	  