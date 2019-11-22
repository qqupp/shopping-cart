package shoppingcart.domain

final case class CreateItem(
    name: ItemName,
    description: ItemDescription,
    price: USD,
    brandId: Brand,      //BrandId in Book
    categoryId: Category //CategoryId in Book
)
