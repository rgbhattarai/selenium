package projectselenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniuma {
	public static void main(String[] args) {
		
	

	//  System.setProperty("webdriver.chrome.driver","C:\\Users\bhatt\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");  
	  driver.close();

}
}