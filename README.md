# opener

> open with something good

Opener provides interfaces for opening files on your desktop using this [tool](http://docs.oracle.com/javase/6/docs/api/java/awt/Desktop.html) which may or may not be available. When it's not, that's okay too. 

## usage

Each operation is exposed as an object with an apply for the type of input the operation expects. You can open with `opener.Browse`, `opener.Edit`, `opener.Mail`, and `opener.Open`. Each operation returns a `scala.util.Try` of the attempted operation.

```scala
opener.Browse(new java.net.URI("https://github.com/softprops/opener#readme"))
```

Doug Tangren (softprops) 2013
