import AssemblyKeys._

name := "$name$"

lazy val buildSettings = Seq(
  organization := "$organization$",
  version := "$version$",
  scalaVersion := "2.11.0",
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.8.2" % "test"
)

scalacOptions := Seq(
  "-Xfatal-warnings", "-deprecation", "-feature", "-unchecked"
)

testOptions in (Test, test) += Tests.Argument("console")

test in assembly := {}

val app = (project in file("app")).
    settings(buildSettings: _*).
    settings(assemblySettings: _*)

jarName in assembly <<= (name, version) map {
  (name, version) => name + "-" + version + ".jar"
}

mainClass in assembly := Some("$organization$.Main")

