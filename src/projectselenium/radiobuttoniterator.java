package projectselenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttoniterator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver ();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement boxcolor = driver.findElement(By.cssSelector("#radio-buttons"));
		List <WebElement> Rb = boxcolor.findElements(By.cssSelector("input[type='radio'"));
		
//		Iterator <WebElement> ii = Rb.iterator();				
// 		   while(ii.hasNext()) {
//			//click on the radio button
//			WebElement RadioButton= ii.next();
//				 RadioButton.click();
//				 Thread.sleep(3000);
//				// check if the next radio button is not already selected
//				if (ii.hasNext() && !ii.next().isSelected()) {
//						System.out.println("Next radio button is not selected.");
			
//		}
//				}
// 	driver.quit();
//	} 
// }
    
	  	// iterate through every radio button in the group
   
	  	for (int i = 0; i < Rb.size(); i++) {
          // click on the radio button
         Rb.get(i).click();
          Thread.sleep(2000);
          
          // check if the next radio button is not already selected
          if (i < Rb.size() - 1 && !Rb.get(i+1).isSelected()) {
              System.out.println("Next radio button is not selected.");
          }
     }
    driver.quit();
	  	
	}
}
