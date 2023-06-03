package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prcaticeselenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(2) > input")).sendKeys("Rushie");
		driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(1) > div:nth-child(3) > input")).sendKeys("Ghimire");
		driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(2) > div > textarea")).sendKeys("matilda ave");
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("rr@gmail.com");
		driver.findElement(By.cssSelector("input[type=tel]")).sendKeys("605-651-1608");
		driver.findElement(By.cssSelector("input[value=FeMale]")).click();
		driver.findElement(By.cssSelector("#checkbox1")).click();
		//driver.findElement(By.cssSelector("#msdd > div")).click();
		//driver.findElement(By.cssSelector("#basicBootstrapForm > div:nth-child(7) > div > multi-select > div:nth-child(2) > ul > li:nth-child(1) > a")).click();
		WebElement S=driver.findElement(By.cssSelector("#Skills"));
		S.click();
		S.sendKeys("Android");
		S.click();
		driver.findElement(By.cssSelector("span[role=combobox]")).isDisplayed();
		driver.findElement(By.id("select2-country-container"));
		//S1.click();
		Thread.sleep(2000);
		//S1.sendKeys("Australia");
		driver.findElement(By.cssSelector("#yearbox")).sendKeys("1916");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("select[placeholder=Month]")).sendKeys("January");
		driver.findElement(By.cssSelector("select[placeholder=Day]")).sendKeys("1");
		driver.findElement(By.id("firstpassword")).sendKeys("saddle");
		driver.findElement(By.id("secondpassword")).sendKeys("saddle");
		driver.findElement(By.id("submitbtn")).click();
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
