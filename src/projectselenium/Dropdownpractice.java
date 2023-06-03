package projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdownpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		List <WebElement> S = driver.findElements(By.cssSelector("input[name=\"vehicle\"]"));
		for (int i=0;i<S.size();i++) {
			Thread.sleep(4000);
			S.get(i).click();
			Thread.sleep(4000);
			if((i<S.size()-1) && !(S.get(i+1).isSelected())) {
				System.out.println("already selected");
			}
			else {
				System.out.println("Done");
			}
		}
		
		
		driver.quit();
	}

}
