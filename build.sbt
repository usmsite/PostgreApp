name := "PostgreApp"

version := "0.1"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "9.4-1206-jdbc41",
  "com.typesafe.play" %% "play-json" % "2.6.2"
)