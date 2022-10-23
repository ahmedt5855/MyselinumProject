package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Login_page;
import pages.Welcome_page;
import pages.forget_password;
public class Login_testcase extends Basetest{
	Login_page lp;
	forget_password fp;
	Welcome_page wp;
	
	@Test(dataProvider="test_data")
  public void Login_testcase1(String username,String password) throws InterruptedException {
	lp=new Login_page(base_test_driver);
	wp=new Welcome_page(base_test_driver);
	By Employee_information=By.xpath("//h5[@class=\"oxd-text oxd-text--h5 oxd-table-filter-title\"]");
	lp.insert_username(username);
	lp.insert_password(password);
	lp.click_on_login();
	//Thread.sleep(5000);
	wait_elements(base_test_driver,20,Employee_information);
	//base_test_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Assert.assertEquals(wp.expected_result_employee(),"Employee Information");

  }
}
