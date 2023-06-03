package projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectedanddisbale {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement boxveg = driver.findElement(By.cssSelector("#radio-buttons-selected-disabled"));
		List<WebElement> SD = boxveg.findElements(By.cssSelector("input[type='radio'"));

		for (int i = 0; i < SD.size(); i++) {
			// System.out.println(SD.get(i).getAttribute("value"));
			if (SD.get(i).isEnabled()){
				System.out.println("Test case1 pass"+" "+SD.get(i).getAttribute("value"));
			}
			if (!SD.get(i).isEnabled()) {
			System.out.println(SD.get(i).getAttribute("value") + " " + "is disable"+"Test case2 pass");
		}
			if (SD.get(i).isSelected()) {
				System.out.println("Test case3 pass" + " " + SD.get(i).getAttribute("value"));
			}
			
		
		}
		driver.quit();
	}
}
// //////// SECOND WAY OF DOING

//		if (driver.findElement(By.cssSelector("input[value = 'lettuce']")).isEnabled()) {
//			System.out.println("Testcase pass -one");
//		}
//
//		if (!driver.findElement(By.cssSelector("input[value = 'cabbage']")).isEnabled()) {
//			System.out.println("Testcase pass - two");
//		}
//		if (driver.findElement(By.cssSelector("input[value = 'pumpkin']")).isSelected()) {
//			System.out.println("Testcase pass - three");
//		}
//		driver.quit();
//	}
//}
