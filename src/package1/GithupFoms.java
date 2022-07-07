package package1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class GithupFoms {

	/**
	 * @param args
	 * @throws AWTException 
	 * @throws InterruptedException 
	 * @throws s 
	 */
	public static void main(String[] args) throws AWTException, InterruptedException  {
		// TODO Auto-generated method stub

		// forms updated
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAI PAVEEN\\Desktop\\Testing\\Java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://dineshvelhal.github.io/testautomation-playground/forms.html");

		WebElement experience=	driver.findElement(By.xpath("//*[@id='exp']"));
		experience.sendKeys("5");

		WebElement java=driver.findElement(By.xpath("//*[@id='check_java']"));
		java.click();

		WebElement selenium=driver.findElement(By.xpath("//*[@id='rad_selenium']"));
		selenium.click();

		WebElement primarySkill=driver.findElement(By.xpath("//*[@id='select_tool']"));
		//primarySkill.click();

		Select select= new Select(primarySkill);
		select.selectByIndex(2);

		WebElement language= driver.findElement(By.xpath("//*[@id='select_lang']"));
		Select multiSelectBox=new Select(language);
		multiSelectBox.selectByIndex(0);
		multiSelectBox.selectByIndex(2);

		WebElement notes=driver.findElement(By.xpath("//*[@id='notes']"));
		notes.sendKeys("I like java");

		WebElement commonSense=driver.findElement(By.xpath("//*[@id='common_sense']"));
		String text=commonSense.getAttribute("placeholder");
		System.out.println(text);

		boolean sense = commonSense.isEnabled();
		System.out.println(sense);
		System.out.println("Read only textBox");

		WebElement speaks=driver.findElement(By.xpath("//*[@class='custom-control-label']"));
		speaks.click();

		Actions action= new Actions(driver);
        // Thread.sleep(2000);
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='upload_cv']")));
		WebElement uploadFile= driver.findElement(By.xpath("//*[@id='upload_cv']"));
		//uploadFile.click();
		action.click(uploadFile).perform();
		Thread.sleep(100);
		String file= "C:\\Users\\SAI PAVEEN\\Desktop\\Testing\\Java\\Program\\ArrayList.txt";
		StringSelection selection= new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//		
//		WebDriverWait wait1 =new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait1.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id='upload_files']")));
//		WebElement multifile= driver.findElement(By.xpath("//*[@id='upload_files']"));
//		//uploadFile.click();
//		action.click(multifile).perform();
//		
//		String file1= "C:\\Users\\SAI PAVEEN\\Desktop\\Testing\\Java\\Program\\File_Read.txt"
//		+"C:\\Users\\SAI PAVEEN\\Desktop\\Testing\\Java\\Program\\File_Write.txt";
//		StringSelection selection1= new StringSelection(file1);
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection1,null);
//		//Robot robot1= new Robot();
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
//	WebElement city=driver.findElement(By.xpath("//*[@id='validationCustom03']"));
//	city.sendKeys("Chennai");
//	
//	WebElement state=driver.findElement(By.xpath("//*[@id='validationCustom04']"));
//	state.sendKeys("Tamilnadu");
//	
//	WebElement pincode=driver.findElement(By.xpath("//*[@id='validationCustom05']"));
//	pincode.sendKeys("600073");
//	
//	WebElement checkBox=driver.findElement(By.xpath("//*[@id='invalidCheck']"));
//	checkBox.click();
//	
//	WebElement submit=driver.findElement(By.xpath("//*[text()='Submit Form']"));
//	submit.click();

	

	}

}
