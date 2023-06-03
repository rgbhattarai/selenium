package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionclass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		
		// Double click
		
//		WebElement doubleclick = driver.findElement(By.cssSelector("#double-click"));
//		a.doubleClick(doubleclick).build().perform();
//		 if (doubleclick.getAttribute("class").equals("div-double-click double")){
//			 System.out.println("1st Test case pass");
//		 }
		
		// Drag and Drop option
//		WebElement draggable = driver.findElement(By.cssSelector("#draggable"));
//		WebElement dropable= driver.findElement(By.cssSelector("#droppable"));
//		a.dragAndDrop(draggable, dropable).build().perform();
//		 if (dropable.getText().contains("Dropped!")) {
//			 System.out.println("Test case passed");
//		 }
		
		// click and hold
//		WebElement cH = driver.findElement(By.cssSelector("#click-box"));
//		a.clickAndHold(cH).build().perform();
//		System.out.println(cH.getText());
//		if (cH.getText().contains("Well done! keep holding that click now.....")) {
//			System.out.println("Test case pass");
//		}
		
		// Hover over element

		
//		WebElement hoE = driver.findElement(By.cssSelector("#div-hover > div:nth-child(3) > button"));
//		a.moveToElement(hoE).build().perform();
//		Thread.sleep(5000);
		
		// Right Click
		
		WebElement RC = driver.findElement(By.cssSelector("#main-header"));
		a.contextClick(RC).build().perform();
		Thread.sleep(5000);
		driver.quit();
		
	}

}
