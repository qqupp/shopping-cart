package designpatterns

import org.scalatest.{FlatSpec, Matchers, OptionValues}

class EmailSpec extends FlatSpec with Matchers with OptionValues {

  behavior of "EmailSpec"

  it should "generate a email from a valid one" in {
    val validStr = "some.name@domain.com"

    val email: Email = Email.fromString(validStr).value

    email.value shouldBe validStr
  }

  it should "refuse invalid an email" in {
    val invalidEmailStr = "notavalid.co.uk"

    val email: Option[Email] = Email.fromString(invalidEmailStr)

    email shouldBe None
  }

  it should "be usable with pattern matching" in {
    val validStr = "some.name@domain.com"

    val email: Option[Email] = Email.fromString(validStr)

    email match {
      case Some(Email(str)) => str shouldBe validStr
      case None             => fail()
    }
  }

}
