public class Main_KO {

	public static void main(String[] args) {

		ClientClass client = new ClientClass();

		client.receiveInfo();

		client.sendRequest("my travel");

		int tries = 0;

		while (tries < 2) {
			switch (client.tryPayment("some data for payment: KO")) {
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
