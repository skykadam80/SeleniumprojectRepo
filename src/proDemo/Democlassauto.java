package proDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Democlassauto {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\BrowserDrivers\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\BrowserDrivers\\geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\BrowserDrivers\\msedgedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.getPageSource();
		
        //driver.quit();

	}

}
