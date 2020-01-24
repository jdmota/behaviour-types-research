## behaviour-types-research

Generic collector example.

```
Collector.java:7: error: type argument 1 is of type Unknown which is not within the bounds of type parameter E (E extends java.lang.Object)
Collector.java:7,20: error: no visible type named T
Collector.java:9: error: type argument 1 is of type Unknown which is not within the bounds of type parameter E (E extends java.lang.Object)
Collector.java:9,29: error: no visible type named T
Collector.java:13: error: type argument 1 is of type Unknown which is not within the bounds of type parameter E (E extends java.lang.Object)
Collector.java:13,15: error: no visible type named T
Collector.java:14: error: type argument 1 is of type Unknown which is not within the bounds of type parameter E (E extends java.lang.Object)
Collector.java:14,10: error: no visible type named T
Main.java:5: error: Collector is not a generic type but used as one in Collector<String>
Main.java:5: error: Collector is not a generic type but used as one in Collector<String>
Main.java:6: error: no method named init(java.util.Iterator<java.lang.String>) in Collector matches. However, there is a method init(java.util.Iterator<Unknown>)
Main.java:7: error: can not assign variable list of type java.util.List<java.lang.String> a value of type java.util.List<Unknown>

Collector.java: 0-0: Semantic Error
  Cannot find typestate CollectorProtocol defined for class Collector.

Main.java: 0-0: Semantic Error
  Method call init(Iterator) has no target.

Collector.java: 0-0: Semantic Error
  Cannot find typestate CollectorProtocol defined for class Collector.

Main.java: 0-0: Semantic Error
  Method call init(Iterator) has no target.
Collector.java:7: error: type argument 1 is of type Unknown which is not within the bounds of type parameter E (E extends java.lang.Object)
Collector.java:7,20: error: no visible type named T
Collector.java:9: error: type argument 1 is of type Unknown which is not within the bounds of type parameter E (E extends java.lang.Object)
Collector.java:9,29: error: no visible type named T
Collector.java:13: error: type argument 1 is of type Unknown which is not within the bounds of type parameter E (E extends java.lang.Object)
Collector.java:13,15: error: no visible type named T
Collector.java:14: error: type argument 1 is of type Unknown which is not within the bounds of type parameter E (E extends java.lang.Object)
Collector.java:14,10: error: no visible type named T
Main.java:5: error: Collector is not a generic type but used as one in Collector<String>
Main.java:5: error: Collector is not a generic type but used as one in Collector<String>
Main.java:6: error: no method named init(java.util.Iterator<java.lang.String>) in Collector matches. However, there is a method init(java.util.Iterator<Unknown>)
Main.java:7: error: can not assign variable list of type java.util.List<java.lang.String> a value of type java.util.List<Unknown>
CollectorProtocol.protocol:3,28: error: unexpected token "<"
CollectorProtocol.protocol:11,1: error: unexpected token ""
```
