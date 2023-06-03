package projectselenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		WebElement boxcolor = driver.findElement(By.cssSelector("#radio-buttons"));
		List<WebElement> Rb = boxcolor.findElements(By.cssSelector("input[type='radio'"));

//		for (int i=0;i<Rb.size();i++) {
//			System.out.println(Rb.get(i));
//			System.out.println(Rb.get(i).getAttribute("value"));
//		}

		for (int i = 0; i < Rb.size(); i++) {
			if (Rb.get(i).isEnabled()) {
				System.out.println("Button is enable " + " " + Rb.get(i).getAttribute("value"));
				
			} else {
				System.out.println("Button is disable" + " " + Rb.get(i).getAttribute("value"));
				
			}
			
			if (Rb.get(i).isSelected()) {
				System.out.println("Already selected " + " " + Rb.get(i).getAttribute("value"));
				
			}

			else {
				Rb.get(i).click();
				System.out.println("is clicked" + " " + Rb.get(i).getAttribute("value"));
			}
		}
	}

}
