package pages;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import PojoClasses.Pet;
import PojoClasses.PetOrder;
import io.restassured.http.ContentType;

public class PetStoreEndpoint {

	/**
	 * This method is responsible for creating pet in the store
	 * 
	 * @param pet Body of the Pet creation API
	 * @return Return the response body and header
	 */
	public Response createPetInStore(Pet pet) {

		return given().log().body()
				.contentType(ContentType.JSON)
				.body(pet)
				.when()
				.post(PetStoreEndpointDetails.NEW_PET)
				.then().log().all()
				.extract().response();
	}
	
	/**
	 * This method is responsible for fetching created pet in the store
	 * 
	 * @param id of the created pet
	 * @return Return the response body and header
	 */
	public Response findPetInStore(String id) {

		return given().log().body()
				.pathParam("id", id)
				.when()
				.get(PetStoreEndpointDetails.GET_PET)
				.then().log().all()
				.extract().response();
	}
	
	/**
	 * This method is responsible for deleting created pet in the store
	 * 
	 * @param id id of the created pet
	 * @return Return the response body and header
	 */
	public Response deletePetInStore(String id) {

		return given().log().body()
				.pathParam("id", id)
				.when()
				.delete(PetStoreEndpointDetails.GET_PET)
				.then().log().all()
				.extract().response();
	}
	
	/**
	 * This method is responsible for creating order in the store
	 * 
	 * @param petOrder Body of the order creation API
	 * @return Return the response body and header
	 */
	public Response createOrderInStore(PetOrder petOrder) {

		return given().log().body()
				.contentType(ContentType.JSON)
				.body(petOrder)
				.when()
				.post(PetStoreEndpointDetails.NEW_ORDER)
				.then().log().all()
				.extract().response();
	}
	
	/**
	 * This method is responsible for fetching order in the store
	 * 
	 * @param id id of the order
	 * @return Return the response body and header
	 */
	public Response findCreatedOrder(String id) {

		return given().log().body()
				.pathParam("orderId", id)
				.when()
				.get(PetStoreEndpointDetails.GET_ORDER)
				.then().log().all()
				.extract().response();
	}
}
