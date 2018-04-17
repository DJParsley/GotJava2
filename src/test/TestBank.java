package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBank {

	@Test
	void testBank() {
		fail("Not yet implemented");
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

	@Test
	void testGetInsufficientFundsPenalty() {
		fail("Not yet implemented");
	}

	@Test
	void testSetInsufficientFundsPenalty() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNAME() {
		fail("Not yet implemented");
	}

	@Test
	void testAddAccountWizard() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllAccounts() {
		fail("Not yet implemented");
	}

	@Test
	void testAddCustomerWizard() {
		fail("Not yet implemented");
	}
// add customer tests
	@Test
	void testValidAddCustomer() {
		
		String firstName = "first";
		String lastName = "last";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
	}
	
	@Test
	void testInvalidAddCustomer1() {
		
		String firstName = "9taco";
		String lastName = "last";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	
	@Test
	void testInvalidAddCustomer2() {
		
		String firstName = "first";
		String lastName = "9last";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	
	@Test
	void testInvalidAddCustomer3() {
		
		String firstName = "9first";
		String lastName = "9last";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	
	@Test
	void testInvalidAddCustomer4() {
		
		String firstName = "!first";
		String lastName = "last";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	
	@Test
	void testInvalidAddCustomer5() {
		
		String firstName = "first";
		String lastName = "!last";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	
	@Test
	void testInvalidAddCustomer6() {
		
		String firstName = "!first";
		String lastName = "!last";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	@Test
	void testInvalidAddCustomer7() {
		
		String firstName = "";
		String lastName = "last";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	@Test
	void testInvalidAddCustomer8() {
		
		String firstName = "first";
		String lastName = "";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	@Test
	void testInvalidAddCustomer9() {
		
		String firstName = "";
		String lastName = "";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	
	@Test
	void testInvalidAddCustomer10() {
		
		String firstName = " ";
		String lastName = "last";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	@Test
	void testInvalidAddCustomer11() {
		
		String firstName = "first";
		String lastName = " ";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
	@Test
	void testInvalidAddCustomer12() {
		
		String firstName = " ";
		String lastName = " ";

	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				System.out.println("All good");
			}
			else {
				System.out.println("failed");
			}
			
			
			
	}
//add customer tests
	//Remove customer tests
	@Test
	void testValidRemoveCustomer() {
		int counter = 0;
		while (counter < customers.size()) 
		{
			if (customerId == customers[counter]) {
				//System.out.println("All good");
				break;
			}
			counter = counter + 1;
		}
	
	}
	
	void testInvalidRemoveCustomer() {
		int counter = 0;
		while (counter < customers.size()) 
		{
			if (customerId == customers[counter]) {
				//System.out.println("All good");
				break;
			}
			counter = counter + 1;
		}
	
	}
	
	
	//Remove customer tests
	@Test
	void testGetAllCustomers() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCustomerString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCustomerStringString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetCustomersAccounts() {
		fail("Not yet implemented");
	}

}
