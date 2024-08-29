package Framework.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Framework.base.Ecomerce_base;

public class delete_cart_product_page extends Ecomerce_base{
	
	@FindBy(xpath="//a[text()=' Cart']")
	WebElement cart_page;	
	
	@FindBy(xpath="//a[data-product-id='1']")
	WebElement remove_cart1;
	
	@FindBy(xpath="//a[data-product-id='5']")
	WebElement remove_cart2;
	
	public delete_cart_product_page() {
		PageFactory.initElements(driver,this);
	}
	
	public void delete_product() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		cart_page.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		remove_cart1.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		remove_cart2.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
}
