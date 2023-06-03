package projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

		// Drop Down
		// SELECT THE ELEMENT BASED ON TEXT
//		WebElement dropmenu = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select dropmenuone = new Select(dropmenu);
//		dropmenuone.selectByVisibleText("SQL");
//		Thread.sleep(2000);
//		driver.quit();
//	}
//}

		// Select class only applies to drop down with select as tagNAme
		// We need to pass select element to constructor
		// byValue , byIndex , byText

		// SELECT ELEMENT BASED ON INDEX
//		WebElement dropmenu = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select dropmenuone= new Select (dropmenu);
//		dropmenuone.selectByIndex(2);
//		Thread.sleep(2000);
//		driver.quit();
//	}
//	}
		// SELECT ELEMENT BASED ON VALUE
//		WebElement dropmenu = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
//		Select dropmenuone = new Select(dropmenu);
//		dropmenuone.selectByValue("java");
//		Thread.sleep(2000);
//		driver.quit();
//	}
//}

		// Select ELEMENT BASED  USE GETOPTION
		WebElement dropmenu = driver.findElement(By.cssSelector("#dropdowm-menu-1"));
		Select dropmenuone = new Select(dropmenu);
		//dropmenuone.selectByValue("java");
		Thread.sleep(2000);
		//System.out.println(dropmenuone.getOptions());
		List <WebElement> dp = dropmenuone.getOptions();
		for (int i=0;i<dp.size();i++) {
			System.out.println(dp.get(i).getText());
		}
		driver.quit();
	}
}