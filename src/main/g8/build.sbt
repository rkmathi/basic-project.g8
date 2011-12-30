name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.1"

crossScalaVersions := Seq("2.9.1")

resolvers += "Scala Tools Snapshots" at "http://scala-tools.org/repo-snapshots/"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest" % "[1.2,)" % "test",
  "junit" % "junit" % "[4.8.2,)" % "test",
  "org.scalaz" %% "scalaz-core" % "6.0.3"
)

initialCommands := "import $organization$.$name$._"
