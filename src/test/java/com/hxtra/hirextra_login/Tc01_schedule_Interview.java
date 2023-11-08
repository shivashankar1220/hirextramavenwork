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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import main.Baseclass;
@Listeners(main.Listenerclass.class)

public class Tc01_schedule_Interview extends Baseclass
{

	@Test
	public void tc1() throws Exception
	{
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
				ele5.sendKeys(Keys.ENTER);
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
//			Robot r3=new Robot();
//				r3.keyPress(KeyEvent.VK_TAB);
//				r3.keyRelease(KeyEvent.VK_TAB);
//				r1.keyPress(KeyEvent.VK_SUBTRACT);
//				r1.keyRelease(KeyEvent.VK_SUBTRACT);
				WebElement des=driver.findElement(By.xpath("//textarea[@formcontrolname='description']"));
				des.click();
				des.sendKeys(" Your main duties will include creating modules and components and coupling them together into a functional app.");
				driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	}
	
}
