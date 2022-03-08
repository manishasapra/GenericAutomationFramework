package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This class has all the methods related to search listing page
public class SearchListingPage {
	
	//Declaration of web driver
	WebDriver driver;
	
	/**
	 * Constructor for initializing driver
	 * 
	 * @param driver initialized web driver
	 */
	public SearchListingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//All OR for search listing page
	private By searchResults = By.className("mw-search-result");
	
	/**
	 * This method is responsible for counting search results.
	 * 
	 * @return count of results searched
	 */
	public int countSearchResult() {
		
		return driver.findElements(searchResults).size();
		
	}

}
