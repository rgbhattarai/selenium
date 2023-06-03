package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/");
		
		// BY ID attribute
		WebElement id = driver.findElement(By.id("automation-test-store"));
		if (id.isDisplayed()){
			System.out.println("locater 1");
		}
		
		// BY class
		WebElement Class = driver.findElement(By.className("navbar-brand"));
		if (Class.isDisplayed()){
			System.out.println("locater 2");
		}
		// BY name
//		WebElement name = driver.findElement(By.name("author"));
//		Thread.sleep(2000);
//		if (name.isDisplayed()){
//			System.out.println("locater 3");
//		}
		
		// BY tag-name
		WebElement tag = driver.findElement(By.tagName("body"));
		if (tag.isDisplayed()){
			System.out.println("locater 4");
		}
		
		
		// BY link-txt
		WebElement linktxt = driver.findElement(By.linkText("Cypress with Cucumber BDD - Beginner to Expert in 9 Hours!"));
		if (linktxt.isDisplayed()){
			System.out.println("locater 5");
		}
		// BY partial link-txt
		
		WebElement partiallinktxt = driver.findElement(By.partialLinkText("Cypress with Cucumber BDD "));
		if ( partiallinktxt.isDisplayed()){
			System.out.println("locater 6");
		}
		
		// BY CSS
		WebElement CSSselector = driver.findElement(By.cssSelector("#automation-test-store"));
		if ( CSSselector.isDisplayed()){
			System.out.println("locater 7");
		}
		
		// x-path
		WebElement xpath = driver.findElement(By.xpath("//*[@id=\"udemy-promo-thumbnail\"]/p[4]/a"));
		if ( xpath.isDisplayed()){
			System.out.println("locater 8");
		}
		
		
		
		driver.close();
		
	
		
		
		
	
		
	
		
	}

}
