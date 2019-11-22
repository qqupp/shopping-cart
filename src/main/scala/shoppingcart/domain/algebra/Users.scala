package shoppingcart.domain.algebra

import shoppingcart.domain._

trait Users[F[_]] {

  def find(username: UserName, password: Password): F[Option[User]]

  def create(username: UserName, password: Password): F[UserId]

}
