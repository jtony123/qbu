name := """qbu"""

version := "1.0.10"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "com.typesafe.play" %% "play-mailer" % "5.0.0-M1"
)

import com.typesafe.sbt.packager.MappingsHelper._
    mappings in Universal ++= directory(baseDirectory.value / "data")

