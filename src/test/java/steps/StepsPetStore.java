package steps;

import org.junit.Assert;

import Utils.PetHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pages.PetStoreEndpoint;

//Step definition file for PetStore
public class StepsPetStore {
	
	PetStoreEndpoint petStoreEndPoint = new PetStoreEndpoint();
	PetHelper petHelper = new PetHelper();
	String id;
	
	@Given("Pet with name {string} and {string} created in pet store")
	public void createPetInStore(String name, String status) {
		
		Response createdPet = petStoreEndPoint.createPetInStore(petHelper.createNewPetBody(name, status));
		id = createdPet.path("id").toString();
		Assert.assertEquals(createdPet.getStatusCode(), 200);
	}
	
	@And("Fetch Pet Created successfully")
	public void fetchCreatedPet() {
		
		Response createdPet = petStoreEndPoint.findPetInStore(id);
		Assert.assertEquals(200, createdPet.getStatusCode());
	}
	
	@Then("Delete the created pet")
	public void DeleteCreatedPet() {
		
		Response createdPet = petStoreEndPoint.deletePetInStore(id);
		Assert.assertEquals(200, createdPet.getStatusCode());
	}
	
	@When("Create Order for Pet with {int} and {string}")
	public void createOrderForPet(int quantity, String status) {
		
		Response createdOrder = petStoreEndPoint.createOrderInStore(petHelper.createOrderBody(Long.parseLong(id), quantity, status));
		Assert.assertEquals(200, createdOrder.getStatusCode());
	}
	
	@Then("Fetch order with id {string}")
	public void fetchCreatedOrder(String orderId) {
		
		Response createdOrder = petStoreEndPoint.findCreatedOrder(orderId);
		Assert.assertEquals(200, createdOrder.getStatusCode());
	}
}
