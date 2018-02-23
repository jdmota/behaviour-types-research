public interface Client {

	void sendRequest(Travel travel);

	Data receiveData();

	void payment(Data data);

	boolean receiveApproval();

	Invoice receiveInvoice();

}
