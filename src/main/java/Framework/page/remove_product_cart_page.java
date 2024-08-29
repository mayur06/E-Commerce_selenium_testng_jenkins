package Framework.page;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Framework.base.Ecomerce_base;

public class remove_product_cart_page extends Ecomerce_base {

		@FindBy(xpath="//a[text()=' Cart']")
		WebElement nav_cart;
		
		@FindBy(xpath="//a[@class='cart_quantity_delete'][@data-product-id='1']")
		WebElement remove_prod1;
		
		@FindBy(xpath="//a[@class='cart_quantity_delete'][@data-product-id='5']")
		WebElement remove_prod2;
		
		@FindBy(xpath="//b[text()='Cart is empty!']")
		WebElement validate_data;
		
		public remove_product_cart_page() {
			PageFactory.initElements(driver,this);
		}
		
		public void navi_cart_prod() {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			nav_cart.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			remove_prod1.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			remove_prod2.click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		}
		
		public List<String> valid_empty_cart() {
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			String valid_data=validate_data.getText();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			List<String> list=new ArrayList<String>();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			list.add(valid_data);
			return list;
		}
		
		
}