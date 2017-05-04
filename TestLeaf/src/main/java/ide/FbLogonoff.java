package ide;

import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogonoff {

	public static void main(String[] args) throws InterruptedException {
		// Launch Driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Initialize Driver
		ChromeDriver driver = new ChromeDriver();
		// Get URL
		driver.get("https://www.facebook.com");
		// Type Username and password
		driver.findElementById("email").sendKeys("antonyalexander65@gmail.com");
		driver.findElementById("pass").sendKeys("blue6784moon$");
		// Click Log in
		driver.findElementById("u_0_q").submit();
		Thread.sleep(3000);
		driver.findElementById("userNavigationLabel").click();
		Thread.sleep(3000);
		// Click Log off
		driver.findElementByXPath("//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[17]/a/span/span")
				.click();
	}

}