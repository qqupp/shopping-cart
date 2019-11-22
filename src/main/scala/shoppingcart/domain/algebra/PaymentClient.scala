package shoppingcart.domain.algebra

import shoppingcart.domain._

trait PaymentClient[F[_]] {

  def process(userId: UserId, total: USD, card: Card): F[PaymentId]
}
