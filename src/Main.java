public class Main {

	public static void main(String[] args) {

		BankClass bank = new BankClass();

		boolean b = true;

		while (b) {
			bank.receivePayment();
		}

		bank.exit();

	}

}
