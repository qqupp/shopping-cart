package shoppingcart.domain.algebra

import shoppingcart.domain.Category

trait Categories[F[_]] {

  def findAll: F[List[Category]]

  def create(category: Category): F[Unit]

}
