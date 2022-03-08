package PojoClasses;

import java.util.List;

//This class has fields related to Pet.
public class Pet {
	
	private long id;
	private String name;
	private String status;
	
	/**
	 * Constructor to create Pet API request body
	 * 
	 * @param name name of the pet
	 * @param status status of the pet availability
	 */
	public Pet(String name, String status) {
		this.name = name;
		this.status = status;
	}

}
