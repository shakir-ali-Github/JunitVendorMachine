package vendormachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import vendormachine.users.util.Wallet;

public class WalletTEST {
	
	/** 
	 * Task 1:
	 * 	Objective:
	 * 		Test the Wallet class from:
	 * 		'vendormachine.users.util.Wallet'
	 * 
	 * 		Goal: 80% code/line coverage
	 * */
	
	// Hint: 
	// Others Tests for other classes that use Wallet may impact code coverage
	// Avoid relying on these tests, one test for one class; keep "Single Responsibility" in mind.
	
	@Test
	public void testAddCredit() {
		Wallet wallet1 = new Wallet();
		wallet1.addCredit(1.5f);
		assertEquals(2f, wallet1.getAllCredit());
	}
	
	@Test
	public void testGetCredit() {
		Wallet wallet1 = new Wallet();
		wallet1.getCredit(1.5f);
		assertEquals(0.5f, wallet1.getCredit(0.5f));
	}
	

	
}

