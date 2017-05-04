
package week2Day1;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class Mergeleadnormal {

	public static void main(String[] args) throws InterruptedException {

		// Launch Broswer
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// ClassName obj = new ClassName();
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("http://leaftaps.com");

		// Maximize
		// driver.manage().window().maximize();

		// Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login
		driver.findElementByClassName("decorativeSubmit").click();

		// Click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();

		// Click Create Lead
		driver.findElementByLinkText("Create Lead").click();

		// Click Merge Leads
		driver.findElementByLinkText("Merge Leads").click();

		// Click button From Lead
		driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();

		Thread.sleep(5000);
		// Switch to New Window
		Set<String> allHandles = driver.getWindowHandles();
		System.out.println(allHandles.size());
		for (String eachHandle : allHandles) {
			System.out.println(eachHandle);
			driver.switchTo().window(eachHandle);
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("Switched to new window");

		// Enter Lead ID
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10114");

		// Click Find Leads
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();

		// Click First Resulting Lead
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();

		// Switch to Parent Window
		allHandles = driver.getWindowHandles();
		System.out.println(allHandles.size());
		for (String eachHandle : allHandles) {
			System.out.println(eachHandle);
			driver.switchTo().window(eachHandle);
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("Switched to parent window");
		Thread.sleep(5000);

		// Click button To Lead
		driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		Thread.sleep(5000);
		// Switch to New Window
		allHandles = driver.getWindowHandles();
		System.out.println(allHandles.size());
		for (String eachHandle : allHandles) {
			System.out.println(eachHandle);
			driver.switchTo().window(eachHandle);
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("Switched to new window");

		// Enter Lead ID
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10120");

		// Click Find Leads
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();

		// Click First Resulting Lead
		Thread.sleep(5000);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();

		// Switch to Parent Window
		allHandles = driver.getWindowHandles();
		System.out.println(allHandles.size());
		for (String eachHandle : allHandles) {
			System.out.println(eachHandle);
			driver.switchTo().window(eachHandle);
		}
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println("Switched to parent window");
		Thread.sleep(5000);
		// Click Merge
		driver.findElementByLinkText("Merge").click();

		// Accept Alert
		driver.switchTo().alert().accept();

		// Find Leads
		driver.findElementByLinkText("Find Leads").click();
		// Enter From Lead ID
		driver.findElementByXPath("//label[contains(text(),'Lead ID:')]/following::input").sendKeys("10114");
		// Click Find Leads
		driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		// Verify Error Message
		Thread.sleep(5000);
		driver.findElementByXPath("//div[contains(text(),'No records to display')]");

	}

}