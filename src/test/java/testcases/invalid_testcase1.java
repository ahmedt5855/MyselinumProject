package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Login_page;
import pages.Welcome_page;
import pages.forget_password;
public class invalid_testcase1 extends Basetest{
	Login_page lp;
	forget_password fp;
	Welcome_page wp; 
	@Test(dataProvider = "test_invalid")
	public void invalid_test_case(String username,String password) throws InterruptedException {
		lp=new Login_page(base_test_driver);
		lp.insert_username(username);
		lp.insert_password(password);
		lp.click_on_login();
		Thread.sleep(5000);
		  if(username=="")
		  {
			 wait_elements(base_test_driver, 20, lp.Required_username);
			  Assert.assertEquals(lp.Required_username(),"Required");
		  }
		  else if(password=="")
		  {
				 wait_elements(base_test_driver, 20, lp.Required_password);

			  Assert.assertEquals(lp.Required_password(),"Required");
		  }
		  else
		  {
				 wait_elements(base_test_driver, 20, lp.invalid_credential);
			 Assert.assertEquals(lp.Required_valid(),"Invalid credentials");
		  }


  }
}
