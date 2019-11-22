package shoppingcart.domain

sealed abstract class AuthRole

object AuthRole {

  case object AdminRole extends AuthRole

  case object UserRole extends AuthRole

}