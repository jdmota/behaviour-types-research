import mungo.lib.Typestate;

@Typestate("BankProtocol")
public class BankClass {

	public PaymentStatus receivePayment(String data) {
		switch (data) {
		case "OK":
			return PaymentStatus.OK;
		case "KO":
			return PaymentStatus.KO;
		}
		return PaymentStatus.TA;
	}

}
