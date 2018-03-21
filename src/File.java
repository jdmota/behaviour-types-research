import mungo.lib.Typestate;

@Typestate("FileProtocol")
public class File {

	private int i = 10;

	public Status open() {
		return Status.OK;
	}

	public Boolean hasNext() {
		if (i > 0) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}

	public void read() {
		i--;
	}

	public void close() {

	}

}
