package ide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Week1Day1 {

	public static void main(String[] args) {
		//Launch Driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Initialize Driver
		ChromeDriver driver=new ChromeDriver();
		//Get URL
		driver.get("http://leaftaps.com");
		//Type Username and password
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		//Logon and Logoff
		driver.findElementByClassName("decorativeSubmit").click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByClassName("decorativeSubmit").click();
	}

}
