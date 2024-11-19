package testng;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class antotations {
	

	

	
		@BeforeMethod
		 void Login() {
			System.out.println("This is Login");	
			
		}
		@Test (priority = 1)
		 void serach() {
			System.out.println("This is search");
		}
		@Test (priority = 2)
		 void advsearch() {
			System.out.println("This is adv serach");
		}
		 @AfterMethod
		 void logout() {
			System.out.println("This is logout");
		}

	}


