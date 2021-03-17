package DemoSelenium.Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findElements_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		List<WebElement> radio=driver.findElements(By.cssSelector("input[name='name']"));
		System.out.println("size of the elemets "+radio.size());
		for (int i=0;i<radio.size();i++) {
			System.out.println("radio buttons name available in screen :"+radio.get(i).getAttribute("value"));
		}

		driver.quit();
	}

}
