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
		 // 1. Go to the specified link 
		 driver.get(baseURL);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 // 2. Selecting Radio buttons
		 WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='radio2'"));
		 radioButton2.click();
		 Thread.sleep(1500);
		 WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='radio3'"));
		 radioButton3.click();
		 Thread.sleep(1500);
		 WebElement radioButton1 = driver.findElement(By.cssSelector("input[value='radio1'"));
		 radioButton1.click();
		 
		 // 3. Suggestion Class Example
		 String partialText = "Me";
		 WebElement textField = driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
		 textField.sendKeys(partialText);
		 Thread.sleep(1500);
		 WebElement toSelect = driver.findElement(By.xpath("//div[contains(text(),'Mexico')]"));
		 toSelect.click();
		 // 4. Dropdown example 
		 WebElement dropdown = driver.findElement(By.xpath("//*[@name=\"dropdown-class-example\"]"));
		 dropdown.click();
		 Thread.sleep(1000);
		 WebElement dropdown2 = driver.findElement(By.xpath("//*/option[3]"));
		 WebElement dropdown3 = driver.findElement(By.xpath("//*/option[4]"));
		 dropdown2.click();
		 Thread.sleep(1000);
		 dropdown3.click();
		 Thread.sleep(1000);
		 
		 // 5. Selecting checkboxes 
		 WebElement checkbox1 = driver.findElement(By.cssSelector("input[value=\"option1\"]"));
		 checkbox1.click();
		 WebElement checkbox2 = driver.findElement(By.cssSelector("input[value=\"option2\"]"));
		 checkbox2.click();
		 
		 // 6. Switch to alert example and print text alert
		 WebElement inputAlert = driver.findElement(By.xpath("//*[@id=\"name\"]"));
		 inputAlert.sendKeys("Stori Card");
		 Thread.sleep(1500);
		 WebElement buttonAlert = driver.findElement(By.cssSelector("input[id=\"alertbtn\"]"));
		 buttonAlert.click();
		 String alert_text = driver.switchTo().alert().getText();
		 System.out.println(alert_text);
		 
		 
		 driver.switchTo().alert().accept();
		 Boolean element_displayed =  driver.findElement(By.xpath("//*[@id=\"displayed-text\"]")).isDisplayed(); 
		 
		 
		 
		 if (element_displayed = true) {
			 System.out.println("The element is shown ");
			 
		 }
		 else {
			 System.out.println("The element is hidden");
			 
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 Thread.sleep(2500);
		 driver.quit();
		 
		 
		 
		 
	 }
	

}
