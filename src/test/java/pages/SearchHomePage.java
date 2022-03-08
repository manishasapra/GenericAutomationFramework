package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This class has all the methods related to home page
public class SearchHomePage {
	
	//Declaration of web driver
	WebDriver driver;
	
	/**
	 * Constructor for initializing driver
	 * 
	 * @param driver initialized web driver
	 */
	public SearchHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//All OR for home page
	private By searchBox = By.name("search");
	private By searchButton = By.cssSelector(".oo-ui-inputWidget-input > .oo-ui-labelElement-label");
	private By searchOptionsTab = By.cssSelector(".mw-advancedSearch-namespacesPreview");
	private By searchOptionDiscussion = By.xpath("//input[@value='discussion']");
	private By searchOptionGeneralHelp = By.xpath("//input[@value='generalHelp']");
	private By searchOptionDefault = By.xpath("//input[@value='defaultNamespaces']");	
	
	/**
	 * This method is responsible for entering keyword in search box
	 * 
	 * @param keyword the word which needs to be searched
	 */
	public void enterSearchKeyword(String keyword) {
		
		driver.findElement(searchBox).sendKeys(keyword);
	}
	
	/**
	 * This method is responsible for clicking on search button. 
	 * 
	 */
	public void clickOnSearchButton() {

		driver.findElement(searchButton).click();
	}
	
	/**
	 * This method is responsible for selecting and de-selecting
	 * search options 
	 * 
	 */
	public void selectSearchOptions() {
		
		driver.findElement(searchOptionsTab).click();
		driver.findElement(searchOptionDiscussion).click();
		driver.findElement(searchOptionGeneralHelp).click();
		driver.findElement(searchOptionDefault).click();
	}	
}
