## behaviour-types-research

``` 
Exception in thread "main" java.lang.ClassCastException: JavaTypestate.AST.List cannot be cast to JavaTypestate.AST.Opt
        at JavaTypestate.AST.ClassDecl.getSuperClassOpt(ClassDecl.java:349)
        at JavaTypestate.AST.EnumDecl.hasSuperClass(EnumDecl.java:489)
        at JavaTypestate.AST.ClassDecl.lookupMethodTargets(ClassDecl.java:1031)
        at JavaTypestate.AST.ClassDecl.lookupMethod(ClassDecl.java:995)
        at JavaTypestate.AST.MethodAccess.lookupMethod(MethodAccess.java:843)
        at JavaTypestate.AST.MethodAccess.getTarget(MethodAccess.java:644)
        at JavaTypestate.AST.MethodAccess.getGraph(MethodAccess.java:474)
        at JavaTypestate.AST.AbstractDot.getGraph(AbstractDot.java:288)
        at JavaTypestate.AST.IfStmt.getGraph(IfStmt.java:312)
        at JavaTypestate.AST.Block.getGraph(Block.java:313)
        at JavaTypestate.AST.MethodDecl.getGraph(MethodDecl.java:680)
        at JavaTypestate.AST.ClassDecl.getFieldGraph(ClassDecl.java:848)
        at JavaTypestate.AST.ClassDecl.getFieldGraph(ClassDecl.java:830)
        at JavaTypestate.AST.ClassDecl.getFieldGraph(ClassDecl.java:757)
        at JavaTypestate.AST.ClassDecl.getGraph_compute(ClassDecl.java:714)
        at JavaTypestate.AST.ClassDecl.getGraph(ClassDecl.java:690)
        at JavaTypestate.AST.ClassDecl.typestateCheck(ClassDecl.java:85)
        at JavaTypestate.AST.ASTNode.collectTypestate(ASTNode.java:44)
        at JavaTypestate.AST.ASTNode.collectTypestate(ASTNode.java:46)
        at JavaTypestate.AST.Program.collect(Program.java:176)
        at JavaTypestate.AST.Program.compile(Program.java:199)
        at TypestateMain.compile(Unknown Source)
        at TypestateMain.main(Unknown Source)
```