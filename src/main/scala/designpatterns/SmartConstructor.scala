package designpatterns

sealed abstract case class Email(value: String)

object Email {

  def fromString(uncheckedStr: String): Option[Email] =
    if (isValidEmail(uncheckedStr))
      Some(new Email(uncheckedStr) {})
    else
      None

  private def isValidEmail(emailStr: String): Boolean =
    emailStr.nonEmpty && emailStr.contains("@")

}
