
public class ATMSelfTester {

	public static void main(String[] args) {
		ATM test = new ATM();
		test.openAccount(1);
		test.openAccount(2, 100);
		
		System.out.println("balance 1: " + test.checkBalance(1));
		System.out.println("balance 2: " + test.checkBalance(2));
		
		test.closeAccount(1);
		System.out.println("balance 1: " + test.checkBalance(1));
		System.out.println("deposit 1: " + test.depositMoney(1, 100));
		System.out.println("withdraw 1: " + test.withdrawMoney(1, 100));
		
		test.closeAccount(2);
		System.out.println("balance 2: " +test.checkBalance(2));
		System.out.println("deposit 2: " + test.depositMoney(2, 100));
		System.out.println("withdraw 2: " + test.withdrawMoney(2, 100));

	}

}
