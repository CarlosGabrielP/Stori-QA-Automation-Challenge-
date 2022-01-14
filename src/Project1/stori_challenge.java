package Project1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stori_challenge {
	     
		 static String baseURL	;
	 
	 public static void main(String []args ) throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver","C:/Users/cgabr/SeleniumWebDriver/chromedriver.exe");
		
		 baseURL = "https://rahulshettyacademy.com/AutomationPractice/";
		 WebDriver driver = new ChromeDriver();
		 driver.get(baseURL);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='radio2'"));
		 radioButton2.click();
		 Thread.sleep(1500);
		 WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='radio3'"));
		 radioButton3.click();
		 Thread.sleep(1500);
		 WebElement radioButton1 = driver.findElement(By.cssSelector("input[value='radio1'"));
		 radioButton1.click();
		 
		 String partialText = "Me";
		 WebElement textField = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		 textField.sendKeys(partialText);
		 WebElement toSelect = driver.findElement(By.xpath("//div[contains(text(),'Mexico')]"));
		 toSelect.click();
		 WebElement Select = driver.findElement(By.xpath("//*/option[1]"));
		 Select.click();
		 Thread.sleep(2500);
		 
		 WebElement Option2 = driver.findElement(By.xpath("//*/option[3]"));
		 WebElement Option3 = driver.findElement(By.xpath("//*/option[4]"));
		 Option2.click();
		 Thread.sleep(1000);
		 Option3.click();
		 Thread.sleep(1000);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 Thread.sleep(2500, 0);
		 driver.quit();
		 
		 
		 
		 
	 }
	

}
