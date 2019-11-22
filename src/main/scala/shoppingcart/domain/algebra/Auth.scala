package shoppingcart.domain.algebra

import shoppingcart.domain._

trait Auth[F[_]] {

  def findUser(token: JwtToken): F[Option[User]]

  def newUser(username: UserName, password: Password, role: AuthRole): F[JwtToken]

  def login(username: UserName, password: Password): F[JwtToken]

  def logout(token: JwtToken, username: UserName): F[Unit]

}
