package ide;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Test Leaf/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> allHandles = driver.getWindowHandles();
		System.out.println("Number of windows:"+allHandles.size());
		for(String eachHandle: allHandles){
			System.out.println(eachHandle);
			driver.switchTo().window(eachHandle);
		}
		System.out.println(driver.getTitle());
		driver.close();
		
		allHandles = driver.getWindowHandles();
		System.out.println("Number of windows:"+allHandles.size());
		for(String eachHandle: allHandles){
			System.out.println(eachHandle);
			driver.switchTo().window(eachHandle);
		}
		System.out.println(driver.getTitle());
		driver.close();
	}

}
