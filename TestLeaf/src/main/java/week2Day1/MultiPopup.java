
package week2Day1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultiPopup {

	public static void main(String[] args) throws InterruptedException {

		// Launch Broswer
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// ClassName obj = new ClassName();
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("http://popuptest.com");


		driver.findElementByLinkText("Multi-PopUp Test #2").click();
		//Get Parent Window Handle
		String parent = driver.getWindowHandle();
		/*Iterator Method
		 * Set<String> allPopups=driver.getWindowHandles();
		 * 
		 * Iterator<String> it =allPopups.iterator(); while (it.hasNext()) {
		 * 
		 * String popupHandle=it.next().toString();
		 * if(!popupHandle.contains(parent)) {
		 * driver.switchTo().window(popupHandle); driver.close(); } else {
		 * System.out.println("Parent Window Title: "+
		 * driver.switchTo().window(parent).getTitle()); } }
		 */
		Set<String> allHandles = driver.getWindowHandles();
		for (String eachHandle : allHandles) {
			//If current last handle is not parent then close the popup handle 
			if (!eachHandle.contains(parent)) {
				// System.out.println(eachHandle);
				driver.switchTo().window(eachHandle);
				driver.close();
			} else {
				//If current handle is the parent then print the title of the handle
				System.out.println("Parent Window Title: " + driver.switchTo().window(parent).getTitle());
			}

		}
	}
}