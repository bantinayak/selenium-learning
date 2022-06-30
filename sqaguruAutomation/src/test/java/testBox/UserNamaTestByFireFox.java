package testBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserNamaTestByFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HII");
		System.setProperty("webdriver.gecko.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.id("userName")).sendKeys("amit");
		System.out.println("HLO");
	}

}
