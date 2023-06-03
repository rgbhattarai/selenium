package projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table22 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(4000);
//		List <WebElement>table=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]"));
//		System.out.println(table.size());

		//List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div"));
		List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div"));
		for (int i=0;i<=rows.size();i++) {
			String rows1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[3]/div[1]/div[2]/div["+ i +"]/div[1]/div[3]")).getText();
			System.out.println(rows1);
			
			
		}
	}

}
