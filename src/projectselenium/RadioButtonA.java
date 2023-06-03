package projectselenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonA {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		WebElement Box = driver.findElement(By.cssSelector("#radio-buttons"));
		List <WebElement> Rad =Box.findElements(By.cssSelector("#radio-buttons > input[type=radio]"));
	for (int i=0;i<Rad.size();i++) {
		 Rad.get(i).click();
		 Thread.sleep(2000);
		if (i<Rad.size()-1&& ! Rad.get(i+1).isSelected()) {
		System.out.println("Next Radio Button Not selected");
		}
		}
		
		
		driver.quit();
		

		
		 
	}

}
