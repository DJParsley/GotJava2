package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import banking.Bank;

class TestBank {

	//@Test
	//void testBank() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//void testMain() {
		//fail("Not yet implemented");
//	}

	//@Test
	//void testGetInsufficientFundsPenalty() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//void testSetInsufficientFundsPenalty() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//void testGetNAME() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//void testAddAccountWizard() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//void testGetAllAccounts() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//void testAddCustomerWizard() {
	//	fail("Not yet implemented");
	//}
// add customer tests
	@Test
	void testValidAddCustomer() {
		
		String firstName = "first";
		String lastName = "last";
        String result = "";
	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
		
		try {
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				result = "All good";
			}
			else {
				fail (result = "failed");
			}
		}
		catch (Exception e){
			
		}
			
	}
	
	@Test
	void testInvalidAddCustomer1() {
		
		String firstName = "9taco";
		String lastName = "last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
			
	}
	
	@Test
	void testInvalidAddCustomer2() {
		
		String firstName = "first";
		String lastName = "9last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
			
	}
	
	@Test
	void testInvalidAddCustomer3() {
		
		String firstName = "9first";
		String lastName = "9last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
	}
	
	@Test
	void testInvalidAddCustomer4() {
		
		String firstName = "!first";
		String lastName = "last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
			
	}
	
	@Test
	void testInvalidAddCustomer5() {
		
		String firstName = "first";
		String lastName = "!last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	
	@Test
	void testInvalidAddCustomer6() {
		
		String firstName = "!first";
		String lastName = "!last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	@Test
	void testInvalidAddCustomer7() {
		
		String firstName = "";
		String lastName = "last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	@Test
	void testInvalidAddCustomer8() {
		
		String firstName = "first";
		String lastName = "";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	@Test
	void testInvalidAddCustomer9() {
		
		String firstName = "";
		String lastName = "";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	
	@Test
	void testInvalidAddCustomer10() {
		
		String firstName = " ";
		String lastName = "last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	@Test
	void testInvalidAddCustomer11() {
		
		String firstName = "first";
		String lastName = " ";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	@Test
	void testInvalidAddCustomer12() {
		
		String firstName = " ";
		String lastName = " ";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
//add customer tests
	//Remove customer tests
	@Test
	void testValidRemoveCustomer() {
		int counter = 0;
		String result = "";
		while (counter < Bank.customers.size()) 
		{
			if (customerId == customers[counter]) {
				result = "All good";
				break;
			}
			if (counter == customers.size()) {
				fail (result = "failed");
			}
			counter = counter + 1;
		}
	
	}
	
	void testInvalidRemoveCustomer() {
		int counter = 0;
		String result = "";
		while (counter < customers.size()) 
		{
			if (customerId == customers[counter]) {
				result = "All good";
				break;
			}
			if (counter == customers.size()) {
				fail (result = "failed");
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

	
	//test getCustomer below
	
	@Test
	void testValidGetCustomerStringString() {
		
		String firstName = "first";
		String lastName = "last";
        String result = "";
	        //if the first name has anything but characters it would print false;
			//if the last name has anything but characters it would print false
		
		try {
			if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
				result = "All good";
			}
			else {
				fail (result = "failed");
			}
		}
		catch (Exception e){
			
		}
			
	}
	
	@Test
	void testInvalidGetCustomerStringString1() {
		
		String firstName = "9taco";
		String lastName = "last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
			
	}
	
	@Test
	void testInvalidGetCustomerStringString2() {
		
		String firstName = "first";
		String lastName = "9last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
			
	}
	
	@Test
	void testInvalidGetCustomerStringString3() {
		
		String firstName = "9first";
		String lastName = "9last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
	}
	
	@Test
	void testInvalidGetCustomerStringString4() {
		
		String firstName = "!first";
		String lastName = "last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
			
	}
	
	@Test
	void testInvalidGetCustomerStringString5() {
		
		String firstName = "first";
		String lastName = "!last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	
	@Test
	void testInvalidGetCustomerStringString6() {
		
		String firstName = "!first";
		String lastName = "!last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	@Test
	void testInvalidGetCustomerStringString7() {
		
		String firstName = "";
		String lastName = "last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	@Test
	void testInvalidGetCustomerStringString8() {
		
		String firstName = "first";
		String lastName = "";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	@Test
	void testInvalidGetCustomerStringString9() {
		
		String firstName = "";
		String lastName = "";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	
	@Test
	void testInvalidGetCustomerStringString10() {
		
		String firstName = " ";
		String lastName = "last";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	@Test
	void testInvalidGetCustomerStringString11() {
		
		String firstName = "first";
		String lastName = " ";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	@Test
	void testInvalidGetCustomerStringString12() {
		
		String firstName = " ";
		String lastName = " ";
		String result = "";
        //if the first name has anything but characters it would print false;
		//if the last name has anything but characters it would print false
	
	try {
		if ((lastName.matches("[a-zA-Z]+"))&&(firstName.matches("[a-zA-Z]+"))) {
			result = "All good";
		}
		else {
			fail (result = "failed");
		}
	}
	catch (Exception e){
		
	}
			
			
	}
	
//test getCustomer above
	//test getCustomersAccounts below
	
	@Test
	void testValidGetCustomersAccounts() {
		int counter = 0;
		String result = "";
		while (counter < customers.size()) 
		{
			if (customerId == customers[counter]) {
				result = "All good";
				break;
			}
			if (counter == customers.size()) {
				fail (result = "failed");
			}
			counter = counter + 1;
		}
	
	}
	
	void testInvalidGetCustomersAccounts() {
		int counter = 0;
		String result = "";
		while (counter < customers.size()) 
		{
			if (customerId == customers[counter]) {
				result = "All good";
				break;
			}
			if (counter == customers.size()) {
				fail (result = "failed");
			}
			counter = counter + 1;
		}
	
	}
	//test getCusomtersAccounts above

}
