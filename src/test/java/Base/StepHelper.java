package Base;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//This Class is the base for all test cases.
public class StepHelper {
	
	protected static WebDriver driver = null;
	protected static Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());
	
	/**
	 * This method is responsible for launching the specified browser 
	 */
	public void accessToTheBrowser() {
		String browser = System.getProperty("browser", "chrome");
		
		if(driver == null) {
			if(browser.contains("firefox")) {
				
				accessFirefox();
				
			} else if (browser.contains("chrome")) {
				
				accessChrome();
				
			} else {
				
				logger.info("Browser name not specified correctly.");
				System.exit(0);
			}
		}
	}
	
	/**
	 * This method is responsible for launching the firefox
	 */
	public void accessFirefox() {
		
		System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/mac/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info("Firefox driver initiated.");
	}
	
	/**
	 * This method is responsible for launching the chrome
	 */
	public void accessChrome() {
		
		String operatingSystem = System.getProperty("os.name").toLowerCase();
		
		if (operatingSystem.contains("windows")) {
			
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/win/chromedriver.exe");
		
		} else if (operatingSystem.contains("mac")) {
			
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/mac/chromedriver");
			
		} else if (operatingSystem.contains("linux")) {
			
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/linux/chromedriver.exe");
			
		}
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		logger.info("Chrome driver initiated.");
	}
	
}
