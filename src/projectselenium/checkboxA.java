package projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxA {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		List <WebElement> Checkbox = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
        
         for (int i=0;i<Checkbox.size();i++) {
           if( Checkbox.get(i).isSelected()) {
        	System.out.println("Already selected");
         }
           else {
        	   Checkbox.get(i).click();
        	   Thread.sleep(3000);
        	   System.out.println("successfully clicked");
           }
	}
         

}
}
