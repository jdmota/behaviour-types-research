import mungo.lib.Typestate;

@Typestate("ClientProtocol")
public class Client {
  
  private final int id;
	private double bid;

	public Client(int id) {
    this.id = id;
		this.bid = 0.0;
	}
  
	public void bid(double newBid) {
    bid = newBid;
  }
  
	public void withdraw() {
    bid = 0;
  }
  
	public void win() {
    // Collect prize
  }
  
  public void lose() {
    // Lost the auction
  }

}
