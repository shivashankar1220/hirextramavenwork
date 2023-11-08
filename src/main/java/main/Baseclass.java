package main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import data.DataDriven;
import data.PropertyFetch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
  public DataDriven de=new DataDriven();
  public static WebDriver driver;
  public PropertyFetch pr=new PropertyFetch();
  @BeforeClass
  //it will execute before execution of class
  public void openhx() throws Throwable
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HX-31\\Documents\\java\\chromedriver-win32\\chromedriver.exe");
	//  WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	  driver.get(pr.fetchdata("url"));
  }
  @BeforeMethod
//it will execute before execution of test
  public void login() throws Throwable
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	  WebElement ele2= driver.findElement(By.name("email"));
	  ele2.click();
	  ele2.clear();
	  ele2.sendKeys(pr.fetchdata("username"));
	  WebElement ele3=driver.findElement(By.name("password"));
	  ele3.click();
	  ele3.clear();
	  ele3.sendKeys(pr.fetchdata("password"));
	  driver.findElement(By.name("remember-me")).click();
	  driver.findElement(By.id("He_sign_in_submit")).click();
  }
}
