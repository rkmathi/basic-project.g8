import AssemblyKeys._

assemblySettings

// Skip test when run sbt-assembly
test in assembly := {}

// Main class name
mainClass in assembly := Some("Main")

// JAR file name
jarName in assembly := "$name$-$version$.jar"

