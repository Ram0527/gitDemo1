package DemoSelenium.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class guru99Bank {

	static String url="http://www.demo.guru99.com/V4/";
	static String userID="mngr314567";
	static String pass="epYjerE";
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.edgedriver().setup();
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		System.out.println("opening url");
		//driver.get("http://www.demo.guru99.com/V4/");
		driver.get(url);
		System.out.println("url successfully opened");
		driver.manage().deleteAllCookies();
		System.out.println("cookies deleted");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(userID);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		System.out.println("login sucuessfully");
		System.out.println(driver.getTitle());
		
		//driver.quit();


	}

}
