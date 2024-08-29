package Framework.test;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Framework.base.Ecomerce_base;
import Framework.page.login_page;

public class login_test extends Ecomerce_base {
	login_page lp;
	
	public login_test() {
		super();
	}
	
	@BeforeClass
	public void login_test_set() throws IOException {
		setup();
		lp=new login_page();
	}
	
	@Test
	public void navigation_login_test() {
		lp.navigation_login_page(prop.getProperty("email"),prop.getProperty("password"));
	
		List<String> title_valid=lp.validate_login_page();
		String actual_title=title_valid.get(0);
		
		String expected_title="Automation Exercise";
		
		Assert.assertEquals(actual_title,expected_title);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
