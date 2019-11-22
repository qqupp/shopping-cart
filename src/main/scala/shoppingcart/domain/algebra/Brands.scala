package shoppingcart.domain.algebra

import shoppingcart.domain.Brand

trait Brands[F[_]] {

  def findAll: F[List[Brand]]

  def create(brand: Brand): F[Unit]

}
