package projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownA {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement dropmenutwo= driver.findElement(By.cssSelector("#dropdowm-menu-2"));
		Select dropmenu2 = new Select (dropmenutwo);
		//dropmenu2.selectByIndex(3) ;
		//dropmenu2.selectByValue("eclipse");
		List<WebElement> dp2=dropmenu2.getOptions();
		Thread.sleep(2000);
		for (int i=0;i<dp2.size();i++) {
			System.out.println(dp2.get(i).getText());
		}
		//driver.quit();
			}
}
