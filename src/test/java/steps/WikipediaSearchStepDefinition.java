package steps;

import java.io.File;

import org.junit.Assert;

import Base.StepHelper;
import Utils.PropertiesReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchHomePage;
import pages.SearchListingPage;

//Step definition file for Wikipedia Search
public class WikipediaSearchStepDefinition extends StepHelper {
	
	String envFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test"
			+ File.separator + "resources" + File.separator + "env.properties";
	
	PropertiesReader propertiesEnv = new PropertiesReader(envFilePath);

	@Given("User is on the wikipedia search page")
	public void userIsOpeningWikipediaPage() {
		accessToTheBrowser();
		
		driver.get(propertiesEnv.getProperty("wikipedia.url"));
		
	}
	
	@When("User searched for {string} on search page")
	public void userSearchForKeyword(String keyword) {
		
		SearchHomePage searchHomePage = new SearchHomePage(driver);
		searchHomePage.enterSearchKeyword(keyword);
	}
	
	@And("User clicks on search button")
	public void userClicksOnSearchButton() {
		
		SearchHomePage searchHomePage = new SearchHomePage(driver);
		searchHomePage.clickOnSearchButton();
	}
	
	@Then("User should see search results")
	public void searchResultsVisibleToUser() {
		
		SearchListingPage searchListingPage = new SearchListingPage(driver);
		Assert.assertNotEquals(searchListingPage.countSearchResult(), 0);
	}
	
	@Then("User select and deselect the search options")
	public void userSelectSearchOptions() {
		
		SearchHomePage searchHomePage = new SearchHomePage(driver);
		
		searchHomePage.selectSearchOptions();
	}
}
