package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import banking.Transaction;
import banking.TransactionType;

class TestTransaction {

	String description = "Billy's College Fund";
	double amount = 120.45;
	Transaction transaction = new Transaction(TransactionType.DEPOSIT, amount, description);
	
	
	@Test
	void testValidTransaction() {
		
		// Tests for the correct String description.
		assertEquals(description, "Billy's College Fund", "Description must be \"Billy's College Fund\"");
		// Tests for the correct double amount.
		assertEquals(amount, 120.45, "Amount must be 120.45");
		
	}
	
	@Test
	void testInvalidTransaction() {
		
		// Tests for the correct String description.
		assertEquals(description, "For: Will", "Description must be \"For: Will\"");
		// Tests for the correct double amount.
		assertEquals(amount, 50.64, "Amount must be 50.64");
		
	}

	@Test
	void testCompareTo() {
		fail("Not yet implemented");
	}

}
