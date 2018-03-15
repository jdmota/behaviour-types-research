public class Main {

	public static void main(String[] args) {

		BankClass bank = new BankClass();

		switch (bank.receivePayment("OK")) {
		case OK:
			break;
		case KO:
			break;
		case TA:
			break;
		default: // It seems that Mungo doesn't detect that this will never run
		}

	}

}
