package Framework.test;

import java.io.IOException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Framework.base.Ecomerce_base;
import Framework.page.delete_cart_product_page;
import Framework.page.login_page;

public class delete_cart_product_test extends Ecomerce_base {
delete_cart_product_page dcpp;
login_page lp;
	
	public delete_cart_product_test() {
		super();
	}
	
	@BeforeClass
	public void delete_cart_prod() throws IOException {
		setup();
		dcpp=new delete_cart_product_page();
		lp=new login_page();
	}
	
	@Test
	public void remove_prod() {
		lp.navigation_login_page(prop.getProperty("email"),prop.getProperty("password"));	
		dcpp.delete_product();
	}
}
