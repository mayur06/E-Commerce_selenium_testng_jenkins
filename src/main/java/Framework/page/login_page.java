package Framework.page;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Framework.base.Ecomerce_base;

public class login_page extends Ecomerce_base{

	@FindBy(xpath="//a[contains(text(),'Signup / Login')]")
	WebElement sign_login_button;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement login_email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement login_password;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement login_button;
	
	public login_page() {
		PageFactory.initElements(driver,this);
	}
	
	public void navigation_login_page(String usr,String pass) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		sign_login_button.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login_email.sendKeys(usr);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login_password.sendKeys(pass);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		login_button.click();
	}
	
	public List<String> validate_login_page() {
		String title_page=driver.getTitle();
		
		List<String> list=new ArrayList<String>();
		list.add(title_page);
		return list;
	}
}