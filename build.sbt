organization := "com.example"

name := "MyKorolevProject"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.2"

val korolevVersion = "0.7.0"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-simple" % "1.7.+",
  "com.github.fomkin" %% "korolev-server-blaze" % korolevVersion
)

enablePlugins(DockerPlugin)
