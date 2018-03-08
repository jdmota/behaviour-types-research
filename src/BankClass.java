import mungo.lib.Typestate;

@Typestate("BankProtocol")
public class BankClass {

	public PaymentStatus receivePayment(String data) {
		if (data.endsWith("OK")) {
			return PaymentStatus.OK;
		}
		if (data.endsWith("TA")) {
			return PaymentStatus.TA;
		}
		return PaymentStatus.KO;
	}

	public OurBool exit(OurBool b) {
		return b;
	}

}
