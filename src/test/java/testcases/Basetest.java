package testcases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.Read_excel_invalid;
import utilities.read_excel_data;

public class Basetest {
	WebDriver base_test_driver;
	public void wait_elements(WebDriver driver,int time,By element_name)
	{
		WebDriverWait wait=new WebDriverWait(driver, time);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(element_name));
	}
	 @BeforeMethod
	 @Parameters({"browser"})
	   public void open_browser(String browser) throws InterruptedException 
	   {

	 	  if(browser.equals("chrome")) {
	 		  WebDriverManager.chromedriver().setup();
	 		 base_test_driver = new ChromeDriver();
	 		base_test_driver.get("https://opensource-demo.orangehrmlive.com/");
	 	  Thread.sleep(2000);
	   
	 	  }
	 	  if(browser.equals("firefox"))
	 	  {
	 		  WebDriverManager.firefoxdriver().setup();
	 		 base_test_driver = new FirefoxDriver();
	 		base_test_driver.get("https://opensource-demo.orangehrmlive.com/");
	 		  Thread.sleep(2000);
	 	  }
	   }

	 @AfterMethod
	 public void close_browser()
	 {
		 base_test_driver.quit();
	 }
	 @DataProvider
	 public String[][] test_data() throws InvalidFormatException, IOException
	 {
	 	read_excel_data obj = new read_excel_data();
	 	return obj.read_excel_sheet();
	 	}
	 @DataProvider
	  public Object[][] test_invalid() throws InvalidFormatException, IOException {
		  Read_excel_invalid obj = new Read_excel_invalid();
			return obj.read_excel_sheet_invalid();
	 }
}
