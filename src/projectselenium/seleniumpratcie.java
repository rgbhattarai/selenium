package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumpratcie {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.cssSelector("input[autocomplete='off']"));
		WebElement button= driver.findElement(By.cssSelector("button[type='button']"));
		
		search.sendKeys("java");
		button.click();
		Thread.sleep(3000);
		
		
		String CurrentURL = driver.getCurrentUrl();
		Thread.sleep(3000);
		
		if (CurrentURL.contains("js/default.asp") ) {
			
			System.out.println("test case passes");
		}
		else {
			System.out.println("Test case faile");
		}
		
		driver.close();
	}

}
