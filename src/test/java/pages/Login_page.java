package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page extends Base_page {

	public Login_page(WebDriver driver) {
		super(driver);
	}
public By Username=By.name("username");
public By password=By.name("password");
public By login_bttn=By.xpath("//button[@type=\"submit\"]");
public By facebook=By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]");
public By linkedin=By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]");
public By twitter=By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]");
public By youtube=By.xpath("//a[@href=\"https://www.youtube.com/c/OrangeHRMInc\"]");
public By Required_username=By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]");
public By Required_password=By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message\"]");
public By invalid_credential=By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]");

public void insert_username(String username)
{
	
	//base_page_driver.findElement(Username).clear();
	base_page_driver.findElement(Username).sendKeys(username);
}
public void insert_password(String Password)
{
	
	//base_page_driver.findElement(password).clear();
	base_page_driver.findElement(password).sendKeys(Password);
}
public void click_on_login()
{
	base_page_driver.findElement(login_bttn).click();

}
public void click_on_facebook()
{
	base_page_driver.findElement(facebook).click();
}
public void click_on_twitter()
{
	base_page_driver.findElement(twitter).click();
}
public void click_on_linkedin()
{
	base_page_driver.findElement(linkedin).click();
}
public void click_on_youtube()
{
	base_page_driver.findElement(youtube).click();
}
public String Required_username()
{
	return base_page_driver.findElement(Required_username).getText();

}
public String Required_password()
{
	return base_page_driver.findElement(Required_password).getText();
}
public String Required_valid()
{
	return base_page_driver.findElement(invalid_credential).getText();

}
}
