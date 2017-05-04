package ide;

import org.openqa.selenium.chrome.ChromeDriver;

public class Leaftapscontact {

	public static void main(String[] args) {
		// //Launch Driver
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Initialize Driver
		ChromeDriver driver = new ChromeDriver();
		// Get URL
		driver.get("http://leaftaps.com");
		// Type Username and password
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		// Logon and Logoff
		driver.findElementByClassName("decorativeSubmit").click();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Contact").click();
		driver.findElementById("firstNameField").sendKeys("Antony");
		driver.findElementById("lastNameField").sendKeys("Alexander");
		driver.findElementByName("submitButton").click();
	}

}
