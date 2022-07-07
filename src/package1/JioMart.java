package package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JioMart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAI PAVEEN\\Desktop\\Testing\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.jiomart.com/");
		
	WebElement groceries=driver.findElement(By.xpath("//*[@id='nav_link_2']"));
	groceries.click();
	
	Thread.sleep(2000);
     WebElement fruitsAndVeggies=driver.findElement(By.xpath("//*[text()='Fruits & Vegetables']"));
	fruitsAndVeggies.click();
	
	 WebElement freshveggies=driver.findElement(By.xpath("//*[text()='Fresh Vegetables']"));
 freshveggies.click();

 String[] items= {"Orange", "Muskmelon","Pineapple"};
 
 int j=0;
 List<WebElement> product=driver.findElements(By.xpath("//*[@class='cart_btn']"));
 
 for(int i=0; i<product.size(); i++)
 {
	 String[] name=product.get(i).getText().split(" ");
	 String vName=name[0];
	 
	 List newList=Arrays.asList(name);
	 
	  if(newList.contains(name))
	  {
		  j++;
		  
		  driver.findElements(By.xpath("//*[text()='Add to Cart']")).get(i).click();
		  
		  if(j==3)
		  break;
	  }
	
	 
	 
 }
	}
}

	 
	 
 
	 
	