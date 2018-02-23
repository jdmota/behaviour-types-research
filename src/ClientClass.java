import mungo.lib.Typestate;

@Typestate("ClientProtocol")
public class ClientClass {

	private TravelAgencyClass travelAgency = new TravelAgencyClass();

	public String receiveInfo() {
		return this.travelAgency.getInfo();
	}

	public void sendRequest(String travel) {
		this.travelAgency.receiveRequest(travel);
	}

	public PaymentStatus tryPayment(String data) {
		return this.travelAgency.tryPayment(data);
	}

	public String receiveInvoice() {
		return this.travelAgency.getInvoice();
	}

}
