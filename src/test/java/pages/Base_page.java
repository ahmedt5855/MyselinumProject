package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_page {
 WebDriver base_page_driver;
Base_page(WebDriver driver)
{
	base_page_driver=driver;
}
public void scroll_down(WebDriver driver)
{
	JavascriptExecutor java=(JavascriptExecutor)base_page_driver;
	java.executeScript("scroll(0,250");
}
public void wait_elements(WebDriver driver,int time,By element_name)
{
	WebDriverWait wait=new WebDriverWait(driver, time);
	//wait.until(ExpectedConditions.invisibilityOfElementLocated(element_name));

}

}
