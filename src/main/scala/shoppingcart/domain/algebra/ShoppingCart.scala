package shoppingcart.domain.algebra

import shoppingcart.domain._

trait ShoppingCart[F[_]] {

  def get(userId: JwtToken): F[CartTotal]

  def add(userId: JwtToken, itemId: ItemId, quantity: Quantity): F[Unit]

  def delete(userId: JwtToken): F[Unit]

  def removeItem(userId: JwtToken, itemId: ItemId): F[Unit]

  def update(userId: JwtToken, cart: Cart): F[Unit]

}
