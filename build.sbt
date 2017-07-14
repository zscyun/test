
name := "weKanban"

organization := "scalainaction"

version := "0.1"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
"org.scalaz" %% "scalaz-core" % "6.0.3",
"org.scalaz" %% "scalaz-http" % "6.0.3",
"org.eclipse.jetty" % "jetty-servlet" % "7.3.0.v20110203" % "container",
"org.eclipse.jetty" % "jetty-webapp" % "7.3.0.v20110203" % "test,container",
"org.eclipse.jetty" % "jetty-server" % "7.3.0.v20110203" % "container"
)

enablePlugins(JettyPlugin)