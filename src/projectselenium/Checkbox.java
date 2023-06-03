package projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		List <WebElement> checkbox = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		for(int i = 0 ; i < checkbox.size() ; i++) {
			if(checkbox.get(i).isSelected()) {
				System.out.println("Already selected");
			}
			else {
				checkbox.get(i).click();
			}
			
		}
		
//		for(int i = 0 ; i < cb.size() ; i++) {
//			System.out.println(cb.get(i).isSelected());
//			
//		}
	}

}
