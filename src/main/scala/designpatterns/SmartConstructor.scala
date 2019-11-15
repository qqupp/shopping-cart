package designpatterns

sealed abstract class Email(val value: String)

object Email {

  def fromString(uncheckedStr: String): Option[Email] =
    if (isValidEmail(uncheckedStr))
      Some(new Email(uncheckedStr) {})
    else
      None

  private def isValidEmail(emailStr: String): Boolean =
    emailStr.nonEmpty && emailStr.contains("@")

  def unapply(arg: Email): Option[String] = Some(arg.value)

  def apply(str: String): Option[Email] = fromString(str)

}
