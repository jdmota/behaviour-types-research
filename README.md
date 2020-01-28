## behaviour-types-research

Generic comparator example.

```
Main.java:3: error: MyComparator is not a generic type but used as one in MyComparator<Integer>
Main.java:3: error: MyComparator is not a generic type but used as one in MyComparator<Integer>
MyComparator.java:5,22: error: no visible type named T
MyComparator.java:5,27: error: no visible type named T

MyComparator.java: 0-0: Semantic Error
                Cannot find typestate MyComparatorProtocol defined for class MyComparator.

MyComparator.java: 0-0: Semantic Error
                Cannot find typestate MyComparatorProtocol defined for class MyComparator.
Main.java:3: error: MyComparator is not a generic type but used as one in MyComparator<Integer>
Main.java:3: error: MyComparator is not a generic type but used as one in MyComparator<Integer>
MyComparator.java:5,22: error: no visible type named T
MyComparator.java:5,27: error: no visible type named T
MyComparatorProtocol.protocol:1,31: error: unexpected token "<"
MyComparatorProtocol.protocol:6,1: error: unexpected token ""
```
