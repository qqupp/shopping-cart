###### Strongly-typed functions

-- pure functions allows you to reason  about the program just looking at the signature.

-- Smart constructors
    
    sealed abstract class Username(value: String)
    object Username {
    }