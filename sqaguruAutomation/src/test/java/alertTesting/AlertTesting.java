package alertTesting;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTesting {
	@Test
	public static void AlertTesting() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().accept();

		String afterclick = driver.findElement(By.id("confirmResult")).getText();
		System.out.println("afterclickOk:" + afterclick);

		driver.findElement(By.id("confirmButton")).click();

		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("confirmButton")).click();

		String afterclick1 = driver.switchTo().alert().getText();

		System.out.println("afterclickcancel:" + afterclick1);

	}

}
