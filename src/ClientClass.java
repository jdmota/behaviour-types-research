// @Typestate("ClientProtocol")
public class ClientClass implements Client {

	private Travel travel = null;
	private Data data = null;
	private boolean paymentSent = false;
	private boolean approved = false;

	// @invariant true;
	// @initial travel == null && data == null && !paymentSent && !approved;
	public ClientClass() {

	}

	// @requires t != null && travel == null;
	// @ensures travel != null;
	public void sendRequest(Travel t) {

	}

	// @requires travel != null && data == null;
	// @ensures data != null;
	public Data receiveData() {
		return null;
	}

	// @requires d != null && data != null && !paymentSent;
	// @ensures paymentSent;
	public void payment(Data d) {

	}

	// @requires paymentSent;
	// @ensures |result| -> approved;
	public boolean receiveApproval() {
		return false;
	}

	// @requires approved;
	public Invoice receiveInvoice() {
		return null;
	}

	public static void main(String[] args) {

		Client client = new ClientClass();

		Travel travel = null;

		client.sendRequest(travel);

		Data data = client.receiveData();

		client.payment(data);

		boolean approved = client.receiveApproval();

		if (approved) {
			Invoice invoice = client.receiveInvoice();
		}

	}

}
