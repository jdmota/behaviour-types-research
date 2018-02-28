public class Main_BadAgencyUse {

	public static void main(String[] args) {
		
		BadClientClass client = new BadClientClass();

		client.receiveInfo();

		client.sendRequest("my travel");

		int tries = 0;

		while (tries < 2) {
			switch (client.tryPayment("some data for payment: SKIP BANK")) {
			case OK:
				System.out.println("Payment succeded.");
				System.out.println(client.receiveInvoice());
				return;
			case KO:
				System.out.println("Payment failed. Cannot recover.");
				return;
			case TA:
				tries++;
				System.out.println("Payment failed, but you can try again.");
			}
		}

		System.out.println("Payment failed too many times.");

	}

}
