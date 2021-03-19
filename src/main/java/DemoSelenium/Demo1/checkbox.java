package DemoSelenium.Demo1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter url");
		String url=sc.nextLine();
		System.out.println("url enterd : "+url);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl().equals(url));
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("url opend ");
		driver.quit();
		
		//driver.get("http://demo.guru99.com/test/radio.html");

	}

}
