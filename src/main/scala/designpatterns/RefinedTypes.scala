package designpatterns

import eu.timepit.refined._
import eu.timepit.refined.auto._
import eu.timepit.refined.boolean.And
import eu.timepit.refined.api.Refined
import eu.timepit.refined.collection.{Contains, NonEmpty}

class RefinedTypes {

  type EmailR = String Refined (Contains['@'] And Contains['.'])

  val email: EmailR = "emailnon@empty.com"

}
