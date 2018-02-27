public class Main_BadClientUse {

	public static void main(String[] args) {

		ClientClass client = new ClientClass();

		client.receiveInfo();

		client.tryPayment("some data for payment: OK");

		client.sendRequest("my travel");

	}

}
