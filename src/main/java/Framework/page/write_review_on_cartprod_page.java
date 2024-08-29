package Framework.page;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Framework.base.Ecomerce_base;

public class write_review_on_cartprod_page extends Ecomerce_base{
	@FindBy(xpath="//a[text()=' Cart']")
	WebElement cart_button;
	
	@FindBy(xpath="//a[text()='Blue Top']")
	WebElement first_prod;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement name_text;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email_text;
	
	@FindBy(xpath="//textarea[@id='review']")
	WebElement review_text;
	
	@FindBy(xpath="//button[@id='button-review']")
	WebElement submit_button_review;
	
	@FindBy(xpath="//a[text()='Winter Top']")
	WebElement second_prod;
	
	public write_review_on_cartprod_page() {
		PageFactory.initElements(driver,this);
	}
	
	public void cart_product_review() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		cart_button.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		first_prod.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)","");
		name_text.sendKeys("test1");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		email_text.sendKeys("test1@gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		review_text.sendKeys("This is a blue top of rs 500 quantity 1");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		submit_button_review.click();
	}
	
	public void cart_second_product_review() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		cart_button.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		second_prod.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)","");
		name_text.sendKeys("test2");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		email_text.sendKeys("test2@gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		review_text.sendKeys("This is a good winter top of rs 600 quanitity 2");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		submit_button_review.click();
	}
}
