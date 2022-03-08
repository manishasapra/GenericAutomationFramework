package pages;

//This class has the list of endpoints used in the request
public class PetStoreEndpointDetails {

	//Endpoint Constants
	public static String SERVER = "https://petstore.swagger.io/v2";
	public static String NEW_PET = SERVER + "/pet";
	public static String GET_PET = SERVER + "/pet/{id}";
	public static String NEW_ORDER = SERVER + "/store/order";
	public static String GET_ORDER = SERVER + "/store/order/{orderId}";
}
