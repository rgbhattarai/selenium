package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownB {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement Drop = driver.findElement(By.cssSelector("#dropdowm-menu-2"));
		 Select D = new Select (Drop);
		// System.out.println(D.getOptions());
		 D.selectByVisibleText("Maven");

	}

}
