package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome_page extends Base_page{

	public Welcome_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public By Employee_information=By.xpath("//h5[@class=\"oxd-text oxd-text--h5 oxd-table-filter-title\"]");

public String expected_result_employee()
{
	//wait_elements(base_page_driver,10,Employee_information);
	return base_page_driver.findElement(Employee_information).getText();
}
}
