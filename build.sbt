lazy val commonSettings = Seq(
  version := "1.0",
  scalaVersion := "2.11.7"
)

lazy val core = (project in file("core"))
  .dependsOn(util)
  .settings(commonSettings: _*)

lazy val util = (project in file("shared/util"))
  .settings(commonSettings: _*)
