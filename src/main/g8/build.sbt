name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.1"

scalacOptions := Seq(
  "-Xfatal-warnings", "-deprecation", "-feature", "-unchecked"
)

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.1.7" % "test"
)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-oD")

