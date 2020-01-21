## behaviour-types-research

Output using `mungo-1-1.jar` from https://bitbucket.org/abcd-glasgow/mungo/src/e83ac35cc4be635ca095cff11e8e1d6f98fca77c

Reports as expected.

```
Main.java: 3-21: Semantic Error
  Object created at Main.java: 3. Typestate mismatch. Found: Object next(). Expected: Boolean hasNext().
```

Output using `mungo-latest.jar` from https://bitbucket.org/abcd-glasgow/mungo/src/32578aef61f2544db28b8a679e31a10f8535bee2

Expected an error, saw nothing.

```

```


