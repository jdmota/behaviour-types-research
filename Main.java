import mungo.lib.Boolean;

public class Main {
	public static void main(String[] args) {
		Collector<Object> collector = new Collector<>();
		collector.init(new JavaIterator<Object>() {
      public Boolean hasNext() {
        return Boolean.False;
      }
      public Object next() {
        return null;
      }
    });
    collector.collect();
	}
}
