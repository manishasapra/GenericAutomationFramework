package Utils;

import PojoClasses.Pet;
import PojoClasses.PetOrder;

//This class helps in creating body of the API
public class PetHelper {

	/**
	 * This method will create request body for pet API
	 * 
	 * @param name pet name
	 * @param status pet state
	 * @return request body class object
	 */
	public Pet createNewPetBody(String name, String status) {
		
		return new Pet(name, status);
	}
	
	/**
	 * This method will create request body for order API
	 * 
	 * @param petId pet id for order
	 * @param quanity pet numbers
	 * @param status order state
	 * @return request body class object
	 */
	public PetOrder createOrderBody(long petId, int quanity, String status) {
		
		return new PetOrder(petId, quanity, status);
	}
}
