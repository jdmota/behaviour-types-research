public class Main {

	public static void main(String[] args) {

		File f = new File();

		switch (f.open()) {
		case ERROR:
			break;
		case OK: {

			loop: while (true) {
				switch (f.hasNext()) {
				case TRUE:
					f.read();
					break;
				case FALSE:
					break loop;
				}
			}

			f.close();

		}
		}

	}

}
