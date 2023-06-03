package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
	boolean e = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[1]/p")).isDisplayed();
		if (e) {
			System.out.println("Test Case pass");
			
			//with WeB element
//		WebElement ele = driver.findElement(By.id("frame"));
//		driver.switchTo().frame(ele);
//		boolean er = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/div[1]/p")).isDisplayed();
//		if (er) {
//			System.out.println("Test case with element pass");
		
		}
	}

}
