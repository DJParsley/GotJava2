package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSavingsAccount extends Account {
static double APR = 5.0;

	@Test
	void testDeposit(double amount) {
amount = Account.amount;
double depositAmount = 200.00;
if (depositAmount > amount)
{
println("Amount Added");
amount = amount + depositAmount;
}
else
{
println("Deposit Should Be More Than The Initial Account Balance");
}
	}

	@Test
	void testWithdraw() {

double mainAccount = this.amount;
double fee = 25.00;
double withdrawAmount = 400.00;

if (withdrawAmount > mainAccount)
{
println("Insufficient Funds...With Ya Broke Self... Accessing $25 fee...");
mainAccount = mainAccount - fee;
println("Now Your Balance Is $" + "mainAccount" );
}
else
{
mainAccount = mainAccount - transferAmount;
println("Withdraw Complete. Balance Is $" + mainAccount);
}

	}

	@Test
public testSavingsAccount (Customer client, double startBalance, String description)
{
client = "Ricky Bobby";
startBalance = 500.00;
description = "This Account Is For Rickys Flame Proof Clothing";
}

	@Test
	public testSavingsAccount (Customer client, double startBalance, String description, double intRate) {

client = "Ricky Bobby";
startBalance = 500.00;
description = "This Account Is For Rickys Flame Proof Clothing";
intRate = 6.0;
}

	@Test
	void testAddInterestTransaction() {
		fail("Not yet implemented");
	}

	@Test
	void testGetDefaultInterestRate() {
		fail("Not yet implemented");
	}

	@Test
	void testSetDefaultInterestRate() {
		fail("Not yet implemented");
	}

}
