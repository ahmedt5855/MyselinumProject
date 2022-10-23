package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class forget_password extends Base_page {

	public forget_password(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public By forget_pass=By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]");
	public By Reset_password=By.xpath("//h6[@class=\"oxd-text oxd-text--h6 orangehrm-forgot-password-title\"]");
	public void click_on_forget_pass()
	{
		base_page_driver.findElement(forget_pass).click();

	}
	public String expected_result_forget()
	{
		return base_page_driver.findElement(Reset_password).getText();
	}

}
