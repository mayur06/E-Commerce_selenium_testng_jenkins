package Framework.page;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Framework.base.Ecomerce_base;

public class cart_product_and_delete_page extends Ecomerce_base{

	@FindBy(xpath="//a[text()=' Products']")
	WebElement products_nav;
	
	@FindBy(xpath="//input[@id='search_product']")
	WebElement search_textbox;
	
	@FindBy(xpath="//button[@id='submit_search']")
	WebElement submit_button;
	
	@FindBy(xpath="//a[text()='Add to cart']")
	WebElement add_to_cart_button;
	
	@FindBy(xpath="//a[text()='View Cart']")
	WebElement view_cart_button;
	
	@FindBy(xpath="//button[text()='Continue Shopping']")
	WebElement continue_shopping;
	
	@FindBy(xpath="//u[text()='View Cart']")
	WebElement view_cart_page;
	
	//------------validate xpaths
	@FindBy(xpath="//a[text()='Blue Top']")
	WebElement first_prod;
	
	@FindBy(xpath="//a[text()='Winter Top']")
	WebElement second_prod;
	
	public cart_product_and_delete_page() {
		PageFactory.initElements(driver,this);
	}
	
	public void nav_product() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		products_nav.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		search_textbox.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		search_textbox.sendKeys("Blue Top");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		submit_button.click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)","");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		add_to_cart_button.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		continue_shopping.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		search_textbox.clear();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		search_textbox.sendKeys("Winter Top");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		submit_button.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,400)","");
		add_to_cart_button.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		view_cart_page.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public List<String> validate_cart_items(){
		String cart_item1=first_prod.getText();
		String cart_item2=second_prod.getText();
		
		List<String> list=new ArrayList<String>();
		list.add(cart_item1);
		list.add(cart_item2);
		return list;
	}
}
