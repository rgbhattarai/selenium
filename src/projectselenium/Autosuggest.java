package projectselenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://www.webdriveruniversity.com");
		driver.findElement(By.cssSelector("#autocomplete-textfield > div > div.section-title > h1")).click();
		Set <String> window = driver.getWindowHandles();
		ArrayList <String> windows = new ArrayList <String> (window);
		 String parentwindow = windows.get(0);
		 String childwindow = windows.get(1);
		 driver.switchTo().window(childwindow);
		driver.findElement(By.cssSelector("#myInput")).sendKeys("P");
//		driver.findElement(By.cssSelector("#myInput")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.cssSelector("#myInput")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.cssSelector("#myInput")).sendKeys(Keys.ARROW_DOWN);
//		driver.findElement(By.cssSelector("#myInput")).sendKeys(Keys.ENTER);
//		driver.findElement(By.cssSelector("#submit-button")).submit();
//		String url = driver.getCurrentUrl();
//		if (url.contains("Pancake")) {
//			System.out.println("test case pass");
//		}
		
		
		List <WebElement> AA = driver.findElements(By.cssSelector("#myInputautocomplete-list>div"));
		for (int i=0;i<AA.size() ;i++) {
			if (AA.get(i).getText().equals("Pizza")) {
				AA.get(i).click();
				break;
				
			}
		}
		driver.findElement(By.cssSelector("#submit-button")).submit();
		String url = driver.getCurrentUrl();
		if (url.contains("Pizza")) {
		System.out.println("test case pass");
	}
		driver.quit();	
	}

}
