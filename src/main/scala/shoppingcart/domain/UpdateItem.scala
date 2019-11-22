package shoppingcart.domain

final case class UpdateItem(
    id: ItemId,
    price: USD
)
