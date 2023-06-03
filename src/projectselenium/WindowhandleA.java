package projectselenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandleA {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		String ParentTab = driver.getWindowHandle();//D5D5E0C2DDEF4A1F93A629EA53F914BF
		System.out.println(ParentTab);
		driver.findElement(By.id("contact-us")).click();
		Set<String> ChildTab = driver.getWindowHandles();
		System.out.println(ChildTab);
		//driver.switchTo().window(ChildTab);
//		driver.findElement(By.cssSelector("Input[value=SUBMIT]")).submit();
//		Set<String> ChildTabs = driver.getWindowHandles();
//		System.out.println(ChildTabs);
		Iterator <String> ii = ChildTab.iterator();
		String ParentT = ii.next();
		String ChildT = ii.next();
		driver.switchTo().window(ChildT);
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("Rushie");
		driver.switchTo().window(ParentT);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}