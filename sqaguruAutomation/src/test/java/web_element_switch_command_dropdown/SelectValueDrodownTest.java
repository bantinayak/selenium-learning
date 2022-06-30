package web_element_switch_command_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class SelectValueDrodownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium code\\selenium_testing\\resource\\driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"selectOne\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[.='Ms.']")).click();
		driver.findElement(By.xpath("//*[.='Ms.']")).click();
	}

}
