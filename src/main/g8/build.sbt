import scalariform.formatter.preferences._

name := "$name$"

organization := "$organization$"

scalaVersion := "$scalacV$"

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

val akkaV = "$akkaV$"
val akkaStreamV = "$akkaStreamV$"
val scalazV = "$scalazV$"

resolvers ++= Seq(
  Resolver.sonatypeRepo("releases")
  Resolver.bintrayRepo("vikraman","maven")
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaV,
  "com.typesafe.akka" %% "akka-http-core-experimental" % akkaStreamV,
  "com.typesafe.akka" %% "akka-http-experimental" % akkaStreamV,
  "com.typesafe.akka" %% "akka-stream-experimental" % akkaStreamV,
  "org.scalaz" %% "scalaz-core" % scalazV,
  "io.argonaut" %% "argonaut" % argonautV,
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.5.0",
  "com.github.mpilquist" %% "simulacrum" % "0.3.0",
  "org.typelevel" %% "machinist" % "0.4.1",
  "org.vikraman" %% "akka-argonaut" % "0.4.0",
  "org.scalatest" %% "scalatest" % "2.2.5" % Test,
  "org.typelevel" %% "scalaz-scalatest" % "0.2.3" % Test,
  "com.typesafe.akka" %% "akka-testkit" % akkaV % Test
)

scalariformSettings

// make the default formatting style be the scala style guide style
ScalariformKeys.preferences := ScalariformKeys.preferences.value.
  setPreference(DoubleIndentClassDeclarations).
  setPreference(PlaceScaladocAsterisksBeneathSecondAsterisk)
