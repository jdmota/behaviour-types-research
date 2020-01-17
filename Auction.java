import mungo.lib.Typestate;

@Typestate("AuctionProtocol")
@SuppressWarnings("unused")
public class Auction {

	// i represents the one running

	private int hBidder = -1;
	private double hBid;
	private double[] pr; // pending returns
	private boolean ended;

	public Auction() {
		hBidder = -1;
		hBid = 0.0;
		pr = new double[] {};
		ended = false;
	}

	// bid0: 0-process makes a bid
	// pre: v > hBid && i != hBidder && !ended && pr[i] == 0
	// pos: pr[old(hBidder)] == old(hBid) && hBid == v && hBidder == i
	public void bid0(double v) {

	}

	// bid1: 1-process makes a bid
	public void bid1(double v) {

	}

	// bid2: 2-process makes a bid
	public void bid2(double v) {

	}

	// pre: i != hBidder && pr[i] > 0
	// pos: pr[i] == 0
	public void withdraw0() {

	}

	public void withdraw1() {

	}

	public void withdraw2() {

	}

	// pre: ended && i == hBidder
	public void win0() {

	}

	public void win1() {

	}

	public void win2() {

	}

	// pre: i == owner
	// pos: ended == true
	public void finish() {
		ended = true;
	}
	
	public static void main(String[] args) {
		
		Auction a = new Auction();
		
		a.bid0(10.0);
		
		// a.bid0(5.0); // Cannot bid if it is the current highest bidder
		
		a.bid1(20.0);
		
		a.bid2(30.0);
		
		a.finish();
		
		a.win2();
		
		a.withdraw0();
		
		a.withdraw1();
		
	}

}
