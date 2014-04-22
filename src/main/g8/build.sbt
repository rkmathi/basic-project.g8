name := "$name$"

organization := "$organization$",

version := "$version$",

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.11" % "test"
)

scalacOptions := Seq(
  "-Xfatal-warnings", "-deprecation", "-feature", "-unchecked"
)

testOptions in (Test, test) += Tests.Argument("console")

