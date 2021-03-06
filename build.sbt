resolvers += Resolver.sonatypeRepo("releases")
enablePlugins(ScalaJSPlugin)

organization := "com.tribbloids.spike.scalajs"
name := "scalajs-cli-demo"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.12.7"
scalaJSModuleKind := ModuleKind.CommonJSModule
scalaJSUseMainModuleInitializer := true
mainClass in Compile := Some("HelloWorldApp")

// https://mvnrepository.com/artifact/io.scalajs/nodejs
libraryDependencies += "io.scalajs" %%% "nodejs" % "0.4.2"

moduleName in fullOptJS := "scalajs-cli-demo"
