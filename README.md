## behaviour-types-research

Generic example.

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 156
  at JavaTypestate.parser.JavaParser$Events.errorPhraseRemoved(JavaParser.java:698)
  at beaver.Parser.recoverFromError(Parser.java:676)
  at beaver.Parser.parse(Parser.java:470)
  at beaver.Parser.parse(Parser.java:411)
  at JavaTypestate.parser.JavaParser.parse(JavaParser.java:724)
  at JavaTypestate.AST.Program.compile(Program.java:140)
  at JavaTypestate.AST.Program.compile(Program.java:195)
  at TypestateMain.compile(Unknown Source)
  at TypestateMain.main(Unknown Source)
```
