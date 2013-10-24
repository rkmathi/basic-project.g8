import AssemblyKeys._

net.virtualvoid.sbt.graph.Plugin.graphSettings

name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  // ---------- basic ----------
  "org.specs2" %% "specs2" % "2.2.3" % "test"
  //,"com.github.nscala-time" %% "nscala-time" % "0.6.0"
  //,"com.typesafe.akka" %% "akka-actor" % "2.2.1"
  //,"org.scalaz" %% "scalaz-core" % "7.0.4"
  //,"org.typelevel" %% "scalaz-contrib-210" % "0.1.5"
  //,"org.typelevel" %% "scalaz-specs2" % "0.1.5" % "test"
  // ---------- for FILE IO ----------
  //,"com.github.scala-incubator.io" %% "scala-io-core" % "0.4.2"
  //,"com.github.scala-incubator.io" %% "scala-io-file" % "0.4.2"
  //,"com.github.tototoshi" %% "scala-csv" % "0.8.0"
  // ---------- for WEB ----------
  //,"net.databinder.dispatch" %% "dispatch-core" % "0.11.0"
  //,"org.json4s" %% "json4s-jackson" % "3.2.5"
  // ---------- for CLI ----------
  //,"com.github.kxbmap" %% "configs" % "0.2.0"
  //,"com.github.scopt" %% "scopt" % "3.1.0"
  //,"com.typesafe" % "config" % "1.0.2"
  // ---------- for DB ----------
  //,"com.github.seratch" %% "scalikejdbc" % "1.6.10"
  //,"com.github.seratch" %% "scalikejdbc-config" % "1.6.10"
  //,"com.github.seratch" %% "scalikejdbc-interpolation" % "1.6.10"
  //,"mysql" % "mysql-connector-java" % "5.1.26"
  // ---------- for Logging ----------
  //,"org.slf4j" % "slf4j-api" % "1.7.5"
  //,"org.slf4j" % "slf4j-simple" % "1.7.5"
  // ---------- test scope ----------
  //,"junit" % "junit" % "4.11" % "test"
  //,"org.pegdown" % "pegdown" % "1.4.1" % "test"
)

scalacOptions <++= scalaVersion.map { sv =>
  if (sv.startsWith("2.10")) {
    Seq(
      "-deprecation",
      "-language:dynamics",
      "-language:postfixOps",
      "-language:reflectiveCalls",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:existentials",
      "-language:reflectiveCalls",
      "-language:experimental.macros",
      "-Xfatal-warnings"
    )
  } else {
    Seq("-deprecation")
  }
}

testOptions in (Test, test) += Tests.Argument("console")

//initialCommands := """
//import scalaz._, Scalaz._
//import scalax.io._
//import scalax.file._
//import scalax.file.ImplicitConversions._
//import com.github.nscala_time.time.Imports._
//"""

cleanupCommands := ""


// ========== for sbt-assembly ==========

seq(assemblySettings: _*)

jarName in assembly <<= (name, version) map { (name, version) => name + "-" + version + ".jar" }

mainClass in assembly := Some("Main")

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
  {
    case "application.conf" => MergeStrategy.concat
    case x => old(x)
  }
}

