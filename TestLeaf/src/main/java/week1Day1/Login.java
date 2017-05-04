package week1Day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) {
		
		//Launch Broswer
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		//ClassName obj = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com");
		
		//Maximize
	//	driver.manage().window().maximize();
		
		//Enter the UserName
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		// Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click Login
		driver.findElementByClassName("decorativeSubmit").click();
		
		
		
		
		
	}

}














