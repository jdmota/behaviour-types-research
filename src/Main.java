public class Main {

	public static void main(String[] args) {

		BankClass bank = new BankClass();
		TravelAgencyClass t = new TravelAgencyClass(bank);
		ClientClass client = new ClientClass(t);

		client.receiveInfo();

		client.sendRequest("my travel");

		int tries = 0;

		while (tries < 2) {
			switch (client.tryPayment("some data for payment: OK")) {
			case OK:
				client.receiveInvoice();
				client.exit(OurBool.TRUE);
				return;
			case KO:
				client.exit(OurBool.FALSE);
				return;
			case TA:
				tries++;
			}
		}

		client.exit(OurBool.TRUE);

	}

}
