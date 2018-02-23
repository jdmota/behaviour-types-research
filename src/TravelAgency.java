interface TravelAgency {

	Travel receiveRequest();

	void sendData(Data data);

	boolean receiveApproval();

	void sendInvoice(Invoice invoice);

}
