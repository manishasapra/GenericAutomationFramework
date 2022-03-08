package Utils;

import Base.StepHelper;
import io.cucumber.java.AfterAll;

//This call will contain all before and after methods
public class AppHooks extends StepHelper {

	/**
	 * This method is responsible for closing the browser
	 */
	@AfterAll
	public static void tearDown() {
		driver.quit();
	}
}
