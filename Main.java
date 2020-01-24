public class Main {
	public static void main(String[] args) {
		Store store = new Store();
		switch(store.buy("item 1")) {
      case OK:
        System.out.println("Buy completed");
        break;
      case KO:
        System.out.println("Error");
        break;
    }
	}
}
