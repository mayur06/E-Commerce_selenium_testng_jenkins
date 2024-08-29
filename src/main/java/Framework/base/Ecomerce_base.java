package Framework.base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecomerce_base {

	public static FileReader fr;
	public static WebDriver driver;
	public static Properties prop=new Properties();
	
	public void setup() throws IOException {
		if(driver == null) {
			fr=new FileReader("C:\\Users\\mayur\\eclipse-workspace\\ECommerce_Project\\src\\main\\java\\Framework\\config\\config.properties");
			prop.load(fr);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.getProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
		}
	}
}
