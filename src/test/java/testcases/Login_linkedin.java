package testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import pages.Login_page;
import pages.Welcome_page;
import pages.forget_password;

public class Login_linkedin extends Basetest{
	Login_page lp;
	forget_password fp;
	Welcome_page wp; 
  @Test
  public void test_linkedin() throws InterruptedException {
		lp=new Login_page(base_test_driver);
		lp.click_on_linkedin();
		Set<String> ids = base_test_driver.getWindowHandles();
		Iterator <String> it = ids.iterator();
		String parentID = it.next();
		String childID = it.next();
		base_test_driver.switchTo().window(childID);
		String url = base_test_driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		assertTrue(url.contains("https://www.linkedin.com/"));

  }
}
