// @Typestate("TravelAgencyProtocol")
public class TravelAgencyClass implements TravelAgency {

	private Travel travel = null;
	private Data data = null;
	private boolean approved = false;

	// @invariant true;
	// @initial travel == null && data == null && !approved;
	public TravelAgencyClass() {

	}

	// @requires travel == null;
	// @ensures travel != null;
	public Travel receiveRequest() {
		return null;
	}

	// @requires d != null && travel != null && data == null;
	// @ensures data != null;
	public void sendData(Data d) {

	}

	// @requires travel != null && data != null;
	// @ensures |result| -> approved;
	public boolean receiveApproval() {
		return false;
	}

	// @requires i != null && approved;
	public void sendInvoice(Invoice i) {

	}

	public static void main(String[] args) {

		TravelAgency travelAgency = new TravelAgencyClass();

		Travel travel = travelAgency.receiveRequest();

		Data data = null;

		travelAgency.sendData(data);

		boolean approved = travelAgency.receiveApproval();

		if (approved) {
			Invoice invoice = null;
			travelAgency.sendInvoice(invoice);
		}

	}

}
