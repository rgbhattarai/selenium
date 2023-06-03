package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// validate the title
		// validate the url
		// use all 8 locator to find elements and provide isdisplayed

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		// validation url
		String url = driver.getCurrentUrl();
		if (url.equals("https://parabank.parasoft.com/parabank/index.htm")) {
			System.out.println("URL validation  passed");
		} else {
			System.out.println("Url validation failed");
		}

		// validation title
		String Title = driver.getTitle();
		if (Title.equals("PARABANK")) {
			System.out.println("Title validation passed");
		} else {
			System.out.println("Title validation passed");

		}
		
		// locators
		WebElement ID=driver.findElement(By.id("headerPanel"));
		if (ID.isDisplayed()) {
		System.out.println("Id locater found");
		}
		WebElement tagname=driver.findElement(By.tagName("h2"));
		if (tagname.isDisplayed()) {
		System.out.println("Tag locator found");
		}
		WebElement name=driver.findElement(By.name("username"));
		if (name.isDisplayed()) {
		System.out.println("name locator found");
		}
		
		WebElement claslocate=driver.findElement(By.className("leftmenu"));
		if (claslocate.isDisplayed()) {
		System.out.println("class locator found");
		}
		WebElement linktxt=driver.findElement(By.linkText("Admin Page"));
		if (linktxt.isDisplayed()) {
		System.out.println("linktxt locator found");
		}
		WebElement partialtxt=driver.findElement(By.partialLinkText("Admin"));
		if (partialtxt.isDisplayed()) {
		System.out.println("partiallinktxt locator found");
		}
		WebElement css1=driver.findElement(By.cssSelector("#rightPanel > span"));
		if (css1.isDisplayed()) {
		System.out.println("css locator found");
		}
		WebElement xpath=driver.findElement(By.xpath("//*[@id=\"headerPanel\"]"));
		if (xpath.isDisplayed()) {
		System.out.println("xpath locator found");
		}

	}

}
