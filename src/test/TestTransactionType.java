package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import banking.TransactionType;

class TestTransactionType {
	
	private static final int NUM_TYPES = 7;

	@Test
	void testTransactionType() {
		assertEquals(NUM_TYPES, TransactionType.values().length);
	}

}
