package window_testing;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/browser-windows");
		String parentWindowId = driver.getWindowHandle();

		System.out.println("ParentWindowId:" + parentWindowId);
		driver.findElement(By.id("tabButton")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowId : windowHandles) {
			System.out.println("window-Id:" + windowId);

			if (!windowId.equals(parentWindowId)) {
				driver.switchTo().window(parentWindowId);
			}
		}
		String HeaderTitleSecondWindow = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("HeaderTitle" + HeaderTitleSecondWindow);
		driver.close();//closing second window
		
		driver.switchTo().window(parentWindowId);
		driver.findElement(By.id("windowButton")).isDisplayed();

	}
}
