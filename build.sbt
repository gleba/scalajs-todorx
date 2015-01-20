scalaJSSettings

name := "Scala.js Tutorial"

scalaVersion := "2.11.2"




libraryDependencies ++= Seq(
  "org.scala-lang.modules.scalajs" %%% "scalajs-dom" % "0.6",
  "com.scalatags" %%% "scalatags" % "0.4.2",
  "com.scalarx" %%% "scalarx" % "0.2.6"
)

ScalaJSKeys.jsDependencies += scala.scalajs.sbtplugin.RuntimeDOM

skip in ScalaJSKeys.packageJSDependencies := false

// uTest settings
utest.jsrunner.Plugin.utestJsSettings

ScalaJSKeys.persistLauncher in Compile := true

ScalaJSKeys.persistLauncher in Test := false



