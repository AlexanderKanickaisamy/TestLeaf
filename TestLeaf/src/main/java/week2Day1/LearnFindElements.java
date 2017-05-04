package week2Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://legacy.crystalcruises.com/Calendar.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	/*	List<WebElement> allQuote = driver.findElementsByLinkText("Get-a-Quote");

		allQuote.get(2).click();
		*/
		
		List<WebElement> allLinks = driver.findElementsByTagName("a");
		
		for (WebElement eachLink : allLinks) {
			System.out.println(eachLink.getText());
			
		}
	
		System.out.println(driver.findElementsByTagName("a").size());
		
	}

}














