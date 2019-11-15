package designpatterns

import org.scalatest.{FlatSpec, Matchers, OptionValues}

class EmailSpec extends FlatSpec with Matchers with OptionValues {

  behavior of "Email smart constructor"

  it should "generate an email type from a valid email string" in {
    val validStr = "some.name@domain.com"

    val email: Email = Email.fromString(validStr).value

    email.value shouldBe validStr
  }

  it should "refuse invalid an email string" in {
    val invalidEmailStr = "notavalid.co.uk"

    val email: Option[Email] = Email.fromString(invalidEmailStr)

    email shouldBe None
  }

  "Email" should "be usable with pattern matching" in {
    val validStr = "some.name@domain.com"

    val email: Option[Email] = Email.fromString(validStr)

    email match {
      case Some(Email(str)) => str shouldBe validStr
      case None             => fail()
    }
  }

  it should "not be copiable" in {
    val validStr = "some.name@domain.com"

    val email: Email = Email.fromString(validStr).value

    assertDoesNotCompile("""email.copy(value = "nonvalidemail")""")
  }

}
