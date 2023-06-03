package projectselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsA {

	public static void main(String[] args) {

		// getText()
		// getTagName()
		// getCssValue()
		// getArritbute()
		// getSize()
		// getLocation()

		// Program 1 getText()
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//		WebElement Txt= driver.findElement(By.tagName("h2"));
//		String T1= Txt.getText();
//		System.out.println(T1);

		// Program 2 getTagname()
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//		WebElement T2 = driver.findElement(By.name("contactme"));
//		System.out.println(T2.getTagName());

		// Program 3 getSize()
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com/");
//		WebElement A= driver.findElement(By.id("nav-logo-sprites"));
//		Dimension D = A.getSize();
//		System.out.println(D);
//		System.out.println(D.height);
//		System.out.println(D.width);

		// program 4 getlocation()
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com/");
//		WebElement B= driver.findElement(By.id("nav-logo-sprites"));
//	       Point L= B.getLocation();
//	       System.out.println(L);
//	       System.out.println(L.x);
//	       System.out.println(L.y);

		// On user action

		// we create element
		// we can retrive element
		// we can update element
		// we can delete element

		// on user action

		// we can retrive attribut
		// we can add attribute
		// we can update attribute value
		// we can delete value

		// program 4 getAttribute()

//		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.com/");
//		WebElement C= driver.findElement(By.cssSelector("#nav-logo-sprites"));
//		String C1=C.getAttribute("aria-label");
//		System.out.println(C1);

		// getCssValue
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
//		WebElement T = driver.findElement(By.tagName("h2"));
//		String Color = T.getCssValue("color");
//		System.out.println(Color);

		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement C= driver.findElement(By.id("nav-logo-sprites"));
		String Color1=C.getCssValue("font-size");
		System.out.println(Color1);
		driver.quit();
	}

}
