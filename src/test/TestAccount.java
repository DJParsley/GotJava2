package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAccount {

Customer customer = "Ricky Bobby";
string acctID = "1234";
string description = "Spent most of balance on flame retardant clothing";
LocalDateTime openingDate = LocalDateTime.now();
double amount = 300.00;

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testAccount() {
string badAcct = "4321"

if (badAcct != this.acctID)
{
println("Account Valid!");
}
else
{
println("Account Invalid");
}
	}

	@Test
	void testDeposit() {
double testAmount = this.amount;
if (testAmount > 500)
{
println( testAmount + " Has Been Deposited Into Your Account. ");
}
else
{
println("Enter An Amount Greater Than 500 To Continue.");
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
	void testTransfer() {
double sendAcctBalance = 300;
double receiveAcctBalance = 200;
double xferAmount = 25;
if (xferAmount >= 100)
{
sendAcctBalance = sendAcctBalance - xferAmount;
receiveAcctBalance = recieveAcctBalance + xferAmount;
println("Transfer Successful! You are $" + xferAmount + " Dollars Richer.")
}
else
{
println("Transfer Amount Must Be At Least $100");
}
	}

	@Test
	string testGetAccountDescription() {
string acctDescription = this.description;
string badDescription = " This Account Is Closed";

if (badDescription.matches(acctDescription))
{
println("Correct Description");
}
else
{
println("Wrong Description");
}
	}

	@Test
	void testSetAccountDescription() {
string acctDescription = "Hot Cross Buns";
string copyDescription = this.description;

if (acctDescription.matches(copyDescription))
{
println("Variable Set");
}
else
{
println("Something Is Wrong");
}
	}

	@Test
	void testGetBalance() {
double currentBalance = this.amount;
println("The Current Balance Is: $" + currentBalance);
	}

	@Test
	string testGetTransactions() {
return acctDescription
}
	}

	@Test
	void testGetTransaction() {
string transactionID = "555";
try
{
if (transactionID.matches("444"))
{
println("Transaction Found");
}
else
{
println("Transaction Not Found");
}
catch(IllegalArgumentException x)
{}
	}

	@Test
	string testGetAccountId() {
string mainID = this.acctID;
return mainID;
	}

	@Test
	string testGetCustomerId() {
string mainID = this.customer;
return mainID;
	}

	@Test
	LocalDateTime testGetAccountCreationDate() {
LocalDateTime openDate = this.creationDate;
return openDate;
	}

	@Test
	void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	void testCompareTo() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
