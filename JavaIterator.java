import mungo.lib.Typestate;

@Typestate("JavaIteratorProtocol")
public class JavaIterator {
  
  public Boolean hasNext() {
    return Boolean.False;
  }
  
  public Object next() {
    return null;
  }

}
