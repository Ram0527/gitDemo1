package DemoSelenium.Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class firstProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		driver.get("https://mvnrepository.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
