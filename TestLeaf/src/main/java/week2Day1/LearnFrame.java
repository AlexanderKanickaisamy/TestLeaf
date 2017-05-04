package week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		

		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement frm = driver.findElementByClassName("demo-frame");
		
		driver.switchTo().frame(frm);
		
		driver.findElementByXPath("//*[@id='selectable']/li[1]").click();
		
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Download").click();
		
		
		
	}

}


















