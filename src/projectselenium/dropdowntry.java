package projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowntry {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Test case 2 to verify no. of items");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.cssSelector("#user-name"));
		user.sendKeys("standard_user");
		
		WebElement password=driver.findElement(By.cssSelector("#password"));
		password.sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
		System.out.println("Login succedssful");
		WebElement filter=driver.findElement(By.cssSelector("select[class=product_sort_container]"));
		Select dropfilter = new Select (filter);
		List <WebElement> dropmenu = dropfilter.getOptions();
		for (int i=0;i<dropmenu.size();i++) {
			System.out.println(dropmenu.get(i).getText());
		}
			dropmenu.get(0).click();
			String Rev = " ";
			List<WebElement> e1 = driver.findElements(By.cssSelector("div[class=inventory_item_name]"));
			for (int j = 0; j < e1.size(); j++) {
				String list = (e1.get(j).getText());
				Rev = Rev + list;

			}
			System.out.println(Rev);
			
			dropmenu.get(1).click();
			Thread.sleep(6000);
			String Rev1 = " ";
			List<WebElement> e2 = driver.findElements(By.cssSelector("div[class=inventory_item_name]"));
			for (int k = 0; k < e2.size(); k++) {

				String list1 = (e2.get(k).getText());
				Rev1 =  Rev1+list1;

			}
			System.out.println(Rev1);
			Thread.sleep(6000);
		dropmenu.get(2).click();
		Thread.sleep(6000);
//			
//	}

}}
