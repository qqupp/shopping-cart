package shoppingcart.domain

final case class Cart(items: Map[ItemId, Quantity])
