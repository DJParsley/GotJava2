package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import banking.Transaction;
import banking.TransactionType;

class TestTransaction {

	String description = "Billy's College Fund";
	double amount = 120.45;
	Transaction transaction = new Transaction(TransactionType.DEPOSIT, amount, description);
	
	
	@Test
	void testValidTransaction() {
		
		System.out.println("Inside testValidTransaction()");
		
		Assert.assertEquals(description, 
				"^[A-Za-z.\\s_-]+$", "Invalid description.");
		Assert.assertEquals(amount, 
				"^\\$?([0-9]{1,3},([0-9]{3},)*[0-9]{3}|[0-9]+)(.[0-9][0-9])?$", "Invalid amount.");
	}

	@Test
	void testCompareTo() {
		fail("Not yet implemented");
	}

}
