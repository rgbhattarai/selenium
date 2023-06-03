package projectselenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class filesp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties  p = new Properties ();
		FileInputStream input = new FileInputStream ("C:\\Users\\bhatt\\eclipse-workspace\\projectselenium\\src\\test.properties");
		p.load(input);
		String browser = p.getProperty("browser");
		System.out.println(browser);
		
//		if( browser.equals("chrome")) {
//			ChromeDriver driver = new ChromeDriver ();
//			driver.get(p.getProperty("baseurl"));
//		}
//		else {
//			EdgeDriver driver = new EdgeDriver ();
//			driver.get(p.getProperty("baseurl"));
//		}
		
		FileOutputStream output = new FileOutputStream ("C:\\Users\\bhatt\\eclipse-workspace\\projectselenium\\src\\test.properties");
		p.setProperty("Country","Nepal");
		p.store(output, "seting country");
	}

}
