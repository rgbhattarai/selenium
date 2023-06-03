package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidOHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//		WebElement username =driver.findElement(By.cssSelector("input[name=username]"));
//		WebElement password =driver.findElement(By.cssSelector("input[type=password]"));
//		WebElement loginbutton =driver.findElement(By.cssSelector("button[type=submit]"));
		
		// invalid credential
//		username.sendKeys("adin");
//		password.sendKeys("adin");
//		loginbutton.click();
		
		//driver.close();
		Thread.sleep(2000);
//		WebElement errormsg = driver.findElement(By.cssSelector("div[class='oxd-alert-action']"));
//		boolean err = errormsg.isDisplayed();
//		
//		if (err) {
//			System.out.println("Test case pass");
//			}
//		else {
//			System.out.println("Test case failed");
//		}
//		
		// forgot password
		
		// Test Case 3
//		
//		WebElement loginbrand = driver.findElement(By.cssSelector("div[class=orangehrm-login-branding]"));
//		
//		boolean brandname = loginbrand.isDisplayed();
//		if (brandname) {
//			System.out.println("Test case passed");
//		}
//		else {
//			System.out.println("Test case Failed");
//		}
//		

		//Test Cae 4 
		//Forgot password- part 1
		
		WebElement forgotpassword = driver.findElement(By.cssSelector("div[class='orangehrm-login-forgot']"));
		forgotpassword.click();
		Thread.sleep(2000);
//		WebElement resetpassword= driver.findElement(By.cssSelector("form[class='oxd-form']"));
//		boolean reset = resetpassword.isDisplayed();
//		if (reset) {
//			System.out.println("test case passes");
//		}
//		else {
//			System.out.println("Test case fail");
//		}
		
		//Test Cae 4 
		//Forgot password- part 2
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(2000);
		if(currentUrl.contains("requestPasswordResetCode")) {
			System.out.println("Testcase passes");
		}
		else {
			System.out.println("Testcase fail");
		}
		driver.close();
	}

}
