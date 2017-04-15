# Lab Tut

This is an exploration of [tut](https://github.com/tpolecat/tut)'s features.

The source file should be located @ https://github.com/mboogerd/lab-tut/tree/master/src/main/tut/README.md

The generated output should be located @ https://github.com/mboogerd/lab-tut/tree/master/README.md

## Basic usage

* A basic `tut` shed
```tut
1 + 1
```

* A tut shed without Scala REPL is made using `tut:silent`
```tut:silent
// This should be Scala block without the output of REPL evaluation
2 + 2
```

* A tut shed that must throw an exception for the build to pass: `tut:fail`
```tut:fail
throw new RuntimeException("Without this exception, no tut for you!")
```

* We can combine modifiers, such as `tut:fail:silent`
```tut:fail:silent
throw new RuntimeException("Without this exception, no tut for you!")
```

* and render without Scala syntax highlighting using `tut:plain`
```tut:plain
// No syntax highlighting :(
val dummy: Int = 1
```

* we can create invisible tut sheds using `tut:invisible`... really!
```tut:invisible
// There is something here!
```

* to make it easy to copy-paste code, use `tut:book`:
```tut:book
// This code can be copy pasted directly into the REPL
val x = 1
val y = 2
x + y
```

* we can make sure that only the evaluated expressions are printed (skipping prompt and inputs) using `tut:evaluated`
```tut:evaluated
// This code can be copy pasted directly into the REPL
val x = 1
val y = 2
x + y
```

* We can reset a REPL using `tut:reset`:

Let's set a value
    
```tut
val x: Int = 1
```

Which we can out of the box evaluate again in a subsequent shed
    
```tut
val y = x
```

Unless we use `reset`
    
```tut:reset:fail
val z = y
```

## Interact with codebase

We can interact with our codebase by default

```tut:book
import com.github.mboogerd._
val dummy = Dummy()
```