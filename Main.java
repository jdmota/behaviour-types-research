import java.util.*;

public class Main {
	public static void main(String[] args) {
		Collector<String> collector = new Collector<>();
    collector.init(Arrays.asList(args).iterator());
    List<String> list = collector.collect();
	}
}
