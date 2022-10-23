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
public class login_testcase2 extends Basetest{
	Login_page lp;
	forget_password fp;
	Welcome_page wp;
	@Test
	 public void Check_forget_password() throws InterruptedException
	 {
	 By Reset_password=By.xpath("//h6[@class=\"oxd-text oxd-text--h6 orangehrm-forgot-password-title\"]");

		fp=new forget_password(base_test_driver);
		fp.click_on_forget_pass();
		wait_elements(base_test_driver, 20, Reset_password);
		Assert.assertEquals(fp.expected_result_forget(),"Reset Password");

	 }
  
}
