# Lab Tut

This is an exploration of [tut](https://github.com/tpolecat/tut)'s features.

The source file should be located @ https://github.com/mboogerd/lab-tut/tree/master/src/main/tut/README.md

The generated output should be located @ https://github.com/mboogerd/lab-tut/tree/master/README.md

## Basic usage

* A basic `tut` shed
```scala
scala> 1 + 1
res0: Int = 2
```

* A tut shed without Scala REPL is made using `tut:silent`
```scala
// This should be Scala block without the output of REPL evaluation
2 + 2
```

* A tut shed that must throw an exception for the build to pass: `tut:fail`
```scala
scala> throw new RuntimeException("Without this exception, no tut for you!")
java.lang.RuntimeException: Without this exception, no tut for you!
	at .<init>(<console>:9)
	at .<clinit>(<console>)
	at .<init>(<console>:7)
	at .<clinit>(<console>)
	at $print(<console>)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at scala.tools.nsc.interpreter.IMain$ReadEvalPrint.call(IMain.scala:734)
	at scala.tools.nsc.interpreter.IMain$Request.loadAndRun(IMain.scala:983)
	at scala.tools.nsc.interpreter.IMain.loadAndRunReq$1(IMain.scala:573)
	at scala.tools.nsc.interpreter.IMain.interpret(IMain.scala:604)
	at scala.tools.nsc.interpreter.IMain.interpret(IMain.scala:568)
	at tut.Tut$$anonfun$tut$Tut$$interp$1$$anonfun$apply$16$$anonfun$apply$17$$anonfun$apply$18$$anonfun$apply$19$$anonfun$apply$20.apply(Tut.scala:50)
	at tut.Tut$$anonfun$tut$Tut$$interp$1$$anonfun$apply$16$$anonfun$apply$17$$anonfun$apply$18$$anonfun$apply$19$$anonfun$apply$20.apply(Tut.scala:50)
	at tut.Zed$IO$$anonfun$apply$5.apply(Zed.scala:86)
	at tut.Zed$IO$$anonfun$apply$5.apply(Zed.scala:86)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$IOOps$$anonfun$withOut$1$$anonfun$apply$8.apply(Zed.scala:101)
	at tut.Zed$IOOps$$anonfun$withOut$1$$anonfun$apply$8.apply(Zed.scala:101)
	at scala.util.DynamicVariable.withValue(DynamicVariable.scala:57)
	at scala.Console$.withOut(Console.scala:126)
	at tut.Zed$IOOps$$anonfun$withOut$1.apply(Zed.scala:101)
	at tut.Zed$IOOps$$anonfun$withOut$1.apply(Zed.scala:101)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$map$1.apply(Zed.scala:31)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$State$$anonfun$flatMap$1.apply(Zed.scala:32)
	at tut.Zed$IOOps.unsafePerformIO(Zed.scala:99)
	at tut.TutMain$.main(TutMain.scala:8)
	at tut.TutMain.main(TutMain.scala)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at sbt.Run.invokeMain(Run.scala:67)
	at sbt.Run.run0(Run.scala:61)
	at sbt.Run.sbt$Run$$execute$1(Run.scala:51)
	at sbt.Run$$anonfun$run$1.apply$mcV$sp(Run.scala:55)
	at sbt.Run$$anonfun$run$1.apply(Run.scala:55)
	at sbt.Run$$anonfun$run$1.apply(Run.scala:55)
	at sbt.Logger$$anon$4.apply(Logger.scala:84)
	at sbt.TrapExit$App.run(TrapExit.scala:248)
	at java.lang.Thread.run(Thread.java:745)

```

* We can combine modifiers, such as `tut:fail:silent`
```scala
throw new RuntimeException("Without this exception, no tut for you!")
```

* and render without Scala syntax highlighting using `tut:plain`
```
scala> // No syntax highlighting :(
     | val dummy: Int = 1
dummy: Int = 1
```

* we can create invisible tut sheds using `tut:invisible`... really!



* to make it easy to copy-paste code, use `tut:book`:
```scala
// This code can be copy pasted directly into the REPL
val x = 1
// x: Int = 1

val y = 2
// y: Int = 2

x + y
// res8: Int = 3
```

* we can make sure that only the evaluated expressions are printed (skipping prompt and inputs) using `tut:evaluated`
```
x: Int = 1
y: Int = 2
res10: Int = 3
```

* We can reset a REPL using `tut:reset`:

Let's set a value
    
```scala
scala> val x: Int = 1
x: Int = 1
```

Which we can out of the box evaluate again in a subsequent shed
    
```scala
scala> val y = x
y: Int = 1
```

Unless we use `reset`
    
```scala
scala> val z = y
<console>:8: error: not found: value y
       val z = y
               ^
```

## Interact with codebase

We can interact with our codebase by default

```scala
import com.github.mboogerd._
// import com.github.mboogerd._

val dummy = Dummy()
// dummy: com.github.mboogerd.Dummy = Dummy(I am a dummy)
```
