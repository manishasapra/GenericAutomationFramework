package PojoClasses;

//This class has fields related to Order.
public class PetOrder {

	private String id;
	private long petId;
	private int quantity;
	private String status;
	private String complete;
	
	
	/**
	 * Constructor to create Order API request body
	 * 
	 * @param petId petId for which order needs to be placced
	 * @param quanity how many pets needs to be orders
	 * @param status order state
	 */
	public PetOrder(long petId, int quanity, String status) {
		this.petId = petId;
		this.quantity = quanity;
		this.status = status;
	}

}
