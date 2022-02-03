package proDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemostrateLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver", "C:\\\\BrowserDrivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("sky");
		driver.findElement(By.name("inputPassword" )).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jhon");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("skykadam80@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("xyz0@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("xyz0@gmail.com");


	}

	
}
