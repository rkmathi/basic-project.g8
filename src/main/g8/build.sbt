name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.1"

crossScalaVersions := Seq("2.9.0-1")

libraryDependencies := Seq(
  "org.scalatest" % "scalatest" % "[1.2,)" % "test",
  "junit" % "junit" % "[4.8.2,)" % "test"
)

initialCommands := "import $organization$.$name$._"
