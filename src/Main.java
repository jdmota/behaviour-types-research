public class Main {

	public static void main(String[] args) {

		BankClass bank = new BankClass();

		// Can't I use the returned value even if Bank reached the "end"?

		switch (bank.receivePayment("OK")) {
		case OK:
			break;
		case KO:
			break;
		case TA:
			break;
		}

	}

}
