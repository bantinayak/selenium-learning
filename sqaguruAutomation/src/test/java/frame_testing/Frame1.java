package frame_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		int totalSampleHeaderText = driver.findElements(By.xpath("//*[text()='This is a sample page']")).size();
		System.out.println("totalSampleHeaderText:" + totalSampleHeaderText);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		int totalSampleHeaderText1 = driver.findElements(By.xpath("//*[text()='This is a sample page']")).size();
		System.out.println("totalSampleHeaderText1:" + totalSampleHeaderText1);

	}

}
