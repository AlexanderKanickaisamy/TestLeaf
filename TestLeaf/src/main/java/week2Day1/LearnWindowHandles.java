package week2Day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		

		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		
		Set<String> allHanldes = driver.getWindowHandles();
		System.out.println(allHanldes.size());
		for (String eachHandle : allHanldes) {
			System.out.println(eachHandle);
			driver.switchTo().window(eachHandle);
		}
		
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
//		driver.close();
		
		driver.quit(); //to close all the browse
		
		/*allHanldes = driver.getWindowHandles();
		System.out.println(allHanldes.size());
		for (String eachHandle : allHanldes) {
			System.out.println(eachHandle);
			driver.switchTo().window(eachHandle);
		}
		
		System.out.println(driver.getTitle());*/
		
	}

}


















