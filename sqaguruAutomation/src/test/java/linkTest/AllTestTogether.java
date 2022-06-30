package linkTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllTestTogether {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/links");
		// driver.findElement(By.id("simpleLink")).click();
		// driver.findElement(By.id("dynamicLink")).click();
		driver.findElement(By.id("created")).click();
		driver.findElement(By.id("created")).isDisplayed();

		driver.findElement(By.id("no-content")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

		driver.findElement(By.id("moved")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

		driver.findElement(By.id("bad-request")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

		driver.findElement(By.id("unauthorized")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

		driver.findElement(By.id("forbidden")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

		driver.findElement(By.id("invalid-url")).click();
		driver.findElement(By.id("linkResponse")).isDisplayed();

	}

}
