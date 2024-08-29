package Framework.test;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Framework.base.Ecomerce_base;
import Framework.page.cart_product_and_delete_page;
import Framework.page.login_page;
import Framework.page.write_review_on_cartprod_page;

public class write_review_on_cartprod_test extends Ecomerce_base{
	write_review_on_cartprod_page wrcp;
	cart_product_and_delete_page cpadp;
	login_page lp;
	
	public write_review_on_cartprod_test() {
		super();
	}
	
	@BeforeClass
	public void nav_write_review_cartprod() throws IOException {
		setup();
		lp=new login_page();
		cpadp=new cart_product_and_delete_page();
		wrcp=new write_review_on_cartprod_page();
	}
	
	@Test(priority = 1)
	public void cart_product_first_review() {
		lp.navigation_login_page(prop.getProperty("email"),prop.getProperty("password"));
		cpadp.nav_product();
		wrcp.cart_product_review();
	}
	
	@Test(priority = 2)
	public void cart_product_second_review() {
		//lp.navigation_login_page(prop.getProperty("email"),prop.getProperty("password"));
		wrcp.cart_second_product_review();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
