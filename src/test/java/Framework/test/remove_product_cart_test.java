package Framework.test;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Framework.base.Ecomerce_base;
import Framework.page.cart_product_and_delete_page;
import Framework.page.login_page;
import Framework.page.remove_product_cart_page;

public class remove_product_cart_test extends Ecomerce_base {
	remove_product_cart_page rpcp;
	cart_product_and_delete_page cpadp;
	login_page lp;

	public remove_product_cart_test() {
		super();
	}

	@BeforeClass
	public void navi_prod_cart() throws IOException {
		setup();
		rpcp = new remove_product_cart_page();
		cpadp = new cart_product_and_delete_page();
		lp = new login_page();
	}

	@Test(priority = 1)
	public void remove_product_cart() {
		lp.navigation_login_page(prop.getProperty("email"), prop.getProperty("password"));
		cpadp.nav_product();
		rpcp.navi_cart_prod();
	}

	@Test(priority = 2)
	public void valid_empty_cart() {
		List<String> empty_cart = rpcp.valid_empty_cart();
		String actual_empty_cart = empty_cart.get(0);

		String expected_empty_cart = "Cart is empty!";
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Assert.assertEquals(actual_empty_cart, expected_empty_cart);
	}

//	@AfterClass
	/*public void teardown() {
		driver.close();
	}*/

}
