package shoppingcart.domain

final case class CartTotal(items: List[CartItem], total: USD)
