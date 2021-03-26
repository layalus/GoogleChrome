package GItGoogle.Git;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aagoregular {
           static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/Users/san_l/Documents/Selenium_lib/geckodriver-v0.29.0-win32/geckodriver.exe");
	     driver = new FirefoxDriver();;
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.smartmetertexas.com");
		driver.findElement(By.xpath("//span[normalize-space()='Sign Up']")).click();

	}

}
