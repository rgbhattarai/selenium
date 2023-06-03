package projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucelab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.saucedemo.com/");
		WebElement user=driver.findElement(By.cssSelector("#user-name"));
		user.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.cssSelector("#password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#login-button")).click();
		List <WebElement> p =  driver.findElements(By.cssSelector("div[class=inventory_item]"));
		if(p.size()==6) {
			System.out.println("test case pass");
		}
			
		driver.quit();
	}
	

}
