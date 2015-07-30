
name := "service-framework"

organization := "llc.flyingwalrus"

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-target:jvm-1.8",
  "-language:_",
  "-feature",
  "-deprecation",
  "-encoding", "UTF-8",
  /* woo-hoo java 8 magic be here! */
  "-Ybackend:GenBCode",
  "-Ydelambdafy:method",
  "-Yopt:l:classpath"
)

javacOptions ++= Seq(
  "-source", "1.8",
  "-target", "1.8"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.12",
  "com.typesafe.akka" %% "akka-http-experimental" % "1.0",
  "com.typesafe.akka" %% "akka-stream-experimental" % "1.0",
  "org.scalaz" %% "scalaz-core" % "7.1.3",
  "io.argonaut" %% "argonaut" % "6.1",
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.5.0",
  "org.vikraman" %% "akka-argonaut" % "0.4.0",
  "org.scalatest" %% "scalatest" % "2.2.5" % Test,
  "org.typelevel" %% "scalaz-scalatest" % "0.2.3" % Test,
  "com.typesafe.akka" %% "akka-testkit" % "2.3.12" % Test
)
