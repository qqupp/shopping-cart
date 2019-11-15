import sbt._

object Dependencies {

  lazy val depenencies = scalaTest ++ refined

  lazy val scalaTest =
    Seq("org.scalatest" %% "scalatest" % "3.0.8" % Test)

  lazy val refined =
    Seq("eu.timepit" %% "refined" % "0.9.10")
}
