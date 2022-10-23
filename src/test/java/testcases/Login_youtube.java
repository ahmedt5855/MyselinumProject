package testcases;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import pages.Login_page;
import pages.Welcome_page;
import pages.forget_password;

public class Login_youtube extends Basetest{
	Login_page lp;
	forget_password fp;
	Welcome_page wp; 
  @Test
  public void test_youtube() throws InterruptedException{
		lp=new Login_page(base_test_driver);
		lp.click_on_youtube();
		Set<String> ids = base_test_driver.getWindowHandles();
		Iterator <String> it = ids.iterator();
		String parentID = it.next();
		String childID = it.next();
		base_test_driver.switchTo().window(childID);
		String url = base_test_driver.getCurrentUrl();
		System.out.println(url);
		base_test_driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		assertEquals(url,"https://www.youtube.com/c/OrangeHRMInc");

  }
}
