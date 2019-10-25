scalaVersion := "2.11.8"

name := "$name;format="norm"$"
organization := "com.example"
version := "1.0"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.4" % "provided"
