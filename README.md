# opener

> open with something good

Opener provides interfaces for opening files and URI's on your desktop using this [tool](http://docs.oracle.com/javase/6/docs/api/java/awt/Desktop.html) which may or may not be available depending on your environment. When it's not, that's okay too.

## install

Via the copy and paste method

    libraryDependencies += "me.lessis" %% "opener" % "0.1.0"
    
Via [a more civilized method](https://github.com/softprops/ls#readme)

    > lsInstall opener

## usage

Each operation is exposed as an object with an apply for the type of input the operation expects. You can open with `opener.Browse`, `opener.Edit`, `opener.Mail`, and `opener.Open`. Each operation returns a `scala.util.Try` of the attempted operation. A few examples are given below.

Open this projects readme on github.com

```scala
opener.Browse(new java.net.URI("https://github.com/softprops/opener#readme"))
```

Tell your mom how much you miss her using a service that she'll understand ( email )

```scala
opener.Mail(new java.net.URI("mailto:mom@gmail.com?subject=hi%20mom&body=miss%20you"))
```

Doug Tangren (softprops) 2013
