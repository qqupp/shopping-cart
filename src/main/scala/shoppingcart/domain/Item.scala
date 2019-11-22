package shoppingcart.domain

final case class Item(
    uuid: ItemId,
    name: ItemName,
    description: ItemDescription,
    price: USD,
    brand: Brand,
    category: Category
)
