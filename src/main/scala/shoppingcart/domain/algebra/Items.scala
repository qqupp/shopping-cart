package shoppingcart.domain.algebra

import shoppingcart.domain._

trait Items[F[_]] {

  def findAll: F[List[Item]]

  def findBy(brand: Brand): F[List[Item]] //BrandName in Book?

  def findById(itemId: ItemId): F[Option[Item]]

  def create(item: CreateItem): F[Unit]

  def update(item: UpdateItem): F[Unit]

}
