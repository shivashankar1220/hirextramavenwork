package data;

public class Generic_Methods {
	package com.hxtra.hirextra_login;

	import java.awt.AWTException;
	import java.awt.Dimension;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.sql.Driver;
	import java.time.Duration;
	import java.util.Calendar;
	import java.util.Random;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class Login_Page_Tc {

		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HX-31\\Downloads\\chromedriver-win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://hxqa.hirextra.com/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
			  // Find the element you want to highlight
			WebElement ele1= driver.findElement(By.name("email"));
			ele1.click();
			ele1.clear();
	        WebElement elementToHighlight = driver.findElement(By.name("email")); // Replace with your desired element selector
	        
	        // Highlight the element
	        highlightElement(driver, elementToHighlight);
	        
	        // Rest of your automation script
	        
	        // Close the browser
	        driver.quit();
	    }
	    
	    // Function to highlight the element7 
	    public static void highlightElement(WebDriver driver, WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        String originalStyle = element.getAttribute("style");
	        js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background-color: yellow;');", element);
	        
	        // Wait for a short moment (you can adjust this)
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        // Remove the highlight
	        js.executeScript("arguments[0].setAttribute('style', '" + originalStyle + "');", element);
	    }
	}

			
			ele1.sendKeys("employer4.hirextra@gmail.com");
			WebElement ele2= driver.findElement(By.name("password"));
			ele2.click();
			ele2.clear();
		ele2.sendKeys("Test@123456");
			driver.findElement(By.name("remember-me")).click();
			driver.findElement(By.id("He_sign_in_submit")).click();
			driver.findElement(By.xpath("//div[text()='Jobs']")).click();
	driver.findElement(By.xpath("(//i[@class='fa-regular fa-pen-to-square square-cl'])[3]")).click();
			driver.findElement(By.className("meeting-icon")).click();
			driver.findElement(By.xpath("//span[text()='Ravinder Rao Kavuru ']")).click();
			WebElement ele3= driver.findElement(By.xpath("//input[@placeholder='Meeting Title']"));
			ele3.click();
			ele3.sendKeys("technical interview for angular developer");
			WebElement ele4= driver.findElement(By.xpath("//input[@placeholder='enter position']"));
			ele4.click();
			ele4.sendKeys("Angular Developer");
			WebElement ele5=  driver.findElement(By.xpath("//option[text()='select Mode of Interview']"));
			ele5.click();
			Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
			//ele5.sendKeys(Keys.ENTER);
			WebElement ele6=driver.findElement(By.xpath("//select[@formcontrolname='provider']"));
			ele6.click();
			Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
			r1.keyRelease(KeyEvent.VK_DOWN);
			r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyRelease(KeyEvent.VK_DOWN);
			ele6.sendKeys(Keys.ENTER);
			WebElement ele7=driver.findElement(By.name("fromdp"));
			ele7.click();
			ele7.sendKeys("2023-10-20");
			WebElement ele8=driver.findElement(By.xpath("//input[@type='time']"));
			ele8.click();
			ele8.sendKeys("20");
			Thread.sleep(2000);
			ele8.sendKeys("12");
			WebElement ele9=driver.findElement(By.xpath("(//input[@type='time'])[2]"));
			ele9.click();
			ele9.sendKeys("23");
			Thread.sleep(2000);
			ele9.sendKeys("13");
			Thread.sleep(3000);
		Robot r3=new Robot();
			r3.keyPress(KeyEvent.VK_TAB);
			r3.keyRelease(KeyEvent.VK_TAB);
			r1.keyPress(KeyEvent.VK_SUBTRACT);
			r1.keyRelease(KeyEvent.VK_SUBTRACT);
			WebElement des=driver.findElement(By.xpath("//textarea[@formcontrolname='description']"));
			des.click();
			des.sendKeys(" Your main duties will include creating modules and components and coupling them together into a functional app.");
			driver.findElement(By.xpath("//button[text()=' Save ']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Schedules']")).click();
			Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Upcoming ']")).click();
	
			//driver.findElement(By.xpath("//button[@type='button'])[3]")).click();
			
			//Calendar ca=Calendar.getInstance();
			
			//driver.findElements(null)
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[text()='Jobs']")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("add")).click();
			driver.findElement(By.xpath("//h6[text()='Fill Manually']")).click();
			WebElement title=driver.findElement(By.xpath("//input[@placeholder='Enter the job Title']"));
			title.click();
		title.sendKeys("SAP ABAP Developer");
		title.sendKeys(Keys.ENTER);
			Random re=new Random();
			int x=re.nextInt(452315);
			WebElement code=driver.findElement(By.xpath("//input[@placeholder='Enter Job Code']"));
			code.click();
			code.sendKeys("12345");
			code.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			WebElement indu=driver.findElement(By.xpath("//select[@formcontrolname='industry']"));
			indu.click();
			Thread.sleep(3000);
			Robot r5=new Robot();
			r5.keyPress(KeyEvent.VK_DOWN);
			r5.keyRelease(KeyEvent.VK_DOWN);
			r5.keyPress(KeyEvent.VK_DOWN);
			r5.keyRelease(KeyEvent.VK_DOWN);
		r5.keyPress(KeyEvent.VK_ENTER);
		r5.keyRelease(KeyEvent.VK_ENTER);


}
