package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FristTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("WebDriver.Ge", value)
		System.setProperty("webdriver.gecko.driver", "D:\\\\Selenuim\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true);
		//WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://www.baidu.com/");
	}

}
