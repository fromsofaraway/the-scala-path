val scala3Version = "3.6.4"
ThisBuild / scalaVersion := scala3Version
lazy val basics = project.in(file("modules/basics"))
  .settings(
    name := "basics",
    scalaVersion := scala3Version,
    version := "0.1.0"
  )