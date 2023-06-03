package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Database ------ API ----------- UI(html , css , javascript)
		// html hypertext markup language
		// css
		// javascript
		// element - html elements
		// html will attribute and value
		// on user actions
		// element are created , updated , retrieve and deleted
		// based on user action
		// html element's attribute are created , updated , retrive , deleted

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();

		// WebElement firstname = driver.findElement(By.name("first_name"));

		// sendKeys ()

//		firstname.sendKeys("Rushie");
//		Thread.sleep(2000);

		// clear()
//		firstname.clear();
//		Thread.sleep(2000);
		// click()
//		driver.findElement(By.name("first_name")).sendKeys("Rushie");
//		driver.findElement(By.name("last_name")).sendKeys("Ghimire");
//		driver.findElement(By.name("email")).sendKeys("rr@gmail.com");
//		driver.findElement(By.name("message")).sendKeys("happy");
//		Thread.sleep(1000);
//		driver.findElement(By.id("form_buttons")).click();

		// is Displayed()
//		boolean Webeleavailable= driver.findElement(By.cssSelector("h2[name=contactme]")).isDisplayed();
//		System.out.println("Webelement available");

		// second set of methods
//		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
//		boolean E1=driver.findElement(By.cssSelector("input[value=pumpkin]")).isEnabled();
//		boolean E2=driver.findElement(By.cssSelector("input[value=cabbage]")).isEnabled();
//		System.out.println(E1);
//		System.out.println(E2);
//		driver.close();

		//submit
		driver.findElement(By.name("first_name")).sendKeys("Rushie");
		driver.findElement(By.name("last_name")).sendKeys("Ghimire");
		driver.findElement(By.name("email")).sendKeys("rr@gmail.com");
		driver.findElement(By.name("message")).sendKeys("happy");
		Thread.sleep(1000);
		driver.findElement(By.id("form_buttons")).submit();
		
	}

}
