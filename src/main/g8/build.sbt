import de.johoop.jacoco4sbt._
import JacocoPlugin._
import eu.henkelmann.sbt._

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.9.1"

crossScalaVersions := Seq("2.9.1")

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "6.0.3",
  "org.scalatest" % "scalatest" % "[1.2,)" % "test",
  "junit" % "junit" % "[4.8.2,)" % "test"
)

initialCommands := "import $organization$.$name$._"

seq(jacoco.settings : _*)

jacoco.reportFormats in jacoco.Config += XMLReport("utf-8")

testListeners <+= (crossTarget) map { ct => new JUnitXmlTestsListener(ct.toString) }
