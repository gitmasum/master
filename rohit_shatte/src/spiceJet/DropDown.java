package spiceJet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Masum Ahmmed\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(200);
		
		//click 5 times using while and for loop 
		
		/*int a=1;
		while(a<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			a++;
		}*/
	       
	      //for loop	
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	      for (int b=1; b<5; b++)
	      {
	    	  Thread.sleep(200);
	    	  driver.findElement(By.id("hrefIncAdt")).click(); 
	      }
	     
	      driver.findElement(By.id("btnclosepaxoption")).click();
	      System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	     
	      
	    //daynamic dropdown-
	      driver.findElement(By.id("//daynamic dropdown-")).click();
	      
	      
	}
}      


            



	      
	      
	      
	      