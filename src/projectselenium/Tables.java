package projectselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// Tables
				// Get the total number of tables
				// Get the total numbers of rows
				// Get total number of columns
				// Iterate rows and columns and print text of element
				// Text of element
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");

		// Retrieve the total number of tables in page
		List <WebElement> table=driver.findElements(By.xpath("//*[@id=\"thumbnail-1\"]/table"));
		//List<WebElement> tabl = driver.findElements(By.xpath("//*[table]"));
		System.out.println(table.size());
		
		//total number of rows
		List <WebElement> rows=driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
		System.out.println(rows.size());
		WebElement name = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[3]"));
		WebElement name1 = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr[3]/td[3]"));
		System.out.println(name1.getText());
		System.out.println(name.getText());
		
		// total number of column
		List <WebElement> col=driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
		System.out.println(col.size());
		
		// for loop to get 3rd column  value
		int sum=0;
		for (int i =2;i<=rows.size();i++) {
			String tablevalue = driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[3]")).getText();
			System.out.println(tablevalue);
			sum = sum+ Integer.parseInt(tablevalue);
		}
		
		System.out.println(sum);
		
		// second table with assertion
		List <WebElement> table2=driver.findElements(By.xpath("//*[@id=\"t02\"]/tbody/tr/td"));
		     for (int i=2;i<=table2.size();i++) {
		    	 String nn = driver.findElement(By.xpath("//*[@id=\"t02\"]/tbody/tr["+ i +"]/td[1]")).getText();
		    	 //System.out.println(nn);
		    	 if (nn.equals("Sarah")) {
		    		 System.out.println(nn+" "+"test case pass");
		    		 break;
		    	 }
		    	 
		     }
		     
		     driver.quit();  
	}
	

}
