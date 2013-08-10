package opener

import java.net.URI
import java.io.File
import scala.util.Try

object Invoke {
  def apply[A <: AnyRef](name: String, value: A): Try[Unit] = Try {
    val desk = Class.forName("java.awt.Desktop")
    desk.getMethod(name, value.getClass).invoke(
      desk.getMethod("getDesktop").invoke(null),
      value
    )
  }
}

abstract class Invokes[T <: AnyRef](name: String) {
  def apply(value: T) = Invoke(name, value)
}

object Open extends Invokes[File]("open")

object Browse extends Invokes[URI]("browse")

object Edit extends Invokes[File]("edit")

object Mail extends Invokes[URI]("mail")
