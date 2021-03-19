package DemoSelenium.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Select dp = new Select (driver.findElement(By.name("country")));
		dp.selectByVisibleText("ANTARCTICA");
		//System.out.println(dp.selectByVisibleText("ANTARCTICA"););
		driver.get("http://jsbin.com/osebed/2 ");
		Select mul = new Select(driver.findElement(By.id("fruits")));
		mul.selectByValue("banana");
		mul.selectByIndex(2);
		Thread.sleep(20000);
		System.out.println(mul.getAllSelectedOptions());
		mul.deselectAll();
		System.out.println(mul.getAllSelectedOptions());
		driver.quit();
		
		
		
		
		//driver.quit();
	}

}

