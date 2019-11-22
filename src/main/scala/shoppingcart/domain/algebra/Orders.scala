package shoppingcart.domain.algebra

import shoppingcart.domain._

trait Orders[F[_]] {

  def findAll(userId: JwtToken): F[List[Order]]

  def get(userId: JwtToken, orderId: OrderId): F[Option[Order]]

  def create(userId: JwtToken, paymentId: PaymentId, items: List[CartItem], total: USD): F[Unit]

}
