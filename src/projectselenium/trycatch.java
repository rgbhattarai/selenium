package projectselenium;

import org.openqa.selenium.chrome.ChromeDriver;


public class trycatch {
	public static void main(String[] args) {
		
	ChromeDriver driver = new ChromeDriver();
	try {
	     driver.get("www.google.com/");
	}
	catch(Exception e){
	     System.out.println(e.getMessage());
	}

}
}
