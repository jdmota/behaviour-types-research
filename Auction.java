import mungo.lib.Typestate;

@Typestate("AuctionProtocol")
@SuppressWarnings("unused")
public class Auction {

	private int hBidder = -1;
	private double hBid;
	private boolean ended;
  private boolean won;

	public Auction() {
		hBidder = -1;
		hBid = 0.0;
		ended = false;
    won = false;
	}

	public void bid(int bidder, double v) {

	}

	public void win(int bidder) {

	}

	public void finish() {
		ended = true;
	}
	
	public static void main(String[] args) {
		
		Auction a = new Auction();
		
		a.bid(0, 10.0);
		
		a.finish();
		
		a.win(0);
		
	}

}
