package Framework.test;

import java.io.IOException;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Framework.base.Ecomerce_base;
import Framework.page.cart_product_and_delete_page;
import Framework.page.login_page;

public class cart_product_and_delete_test extends Ecomerce_base{
	cart_product_and_delete_page cpadp;
	login_page lp;
	
	public cart_product_and_delete_test() {
		super();
	}
	
	@BeforeClass
	public void nav_product_test() throws IOException {
		setup();
		cpadp=new cart_product_and_delete_page();
		lp=new login_page();
	}
	
	@Test(priority = 1)
	public void navigation_product() {
		lp.navigation_login_page(prop.getProperty("email"),prop.getProperty("password"));
		cpadp.nav_product();
		
		List<String> validate_card=cpadp.validate_cart_items();
		String actual_item_valid1=validate_card.get(0);
		String actual_item_valid2=validate_card.get(1);
		
		String expected_item_valid1="Blue Top";
		String expected_item_valid2="Winter Top";
		
		Assert.assertEquals(actual_item_valid1,expected_item_valid1);
		Assert.assertEquals(actual_item_valid2,expected_item_valid2);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
