package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement Firstname = driver.findElement(By.cssSelector("input[name='first_name']"));
		WebElement Lastname = driver.findElement(By.cssSelector("input[name='last_name']"));
		WebElement email = driver.findElement(By.cssSelector("input[name='email']"));
		WebElement comment = driver.findElement(By.cssSelector("textarea[name='message']"));
		WebElement reset = driver.findElement(By.cssSelector("input[type=\"reset\"]"));
		
		Firstname.sendKeys("Rushie");
		Lastname.sendKeys("Bhattarai");
		email.sendKeys("ghimire@gmail.com");
		comment.sendKeys("abcd");
		Thread.sleep(2000);
		reset.click();
		Thread.sleep(5000);
//		WebElement contact = driver.findElement(By.cssSelector("[name='contactme']"));
//		boolean con = contact.isDisplayed();
//		if (con) {
//			System.out.println("test case passed");
//		}
//		else {
//			System.out.println("Test case failed");
//		}
//		if (Firstname.getText().contains("")) {
//			System.out.println("test case pass");
//		}
//		else {
//			System.out.println("test case failed");
//		}
		if (Firstname.getText().equals("")) {
			System.out.println("test case pass");
		}
		else {
			System.out.println("test case failed");
		}
		driver.quit();
	}

}
