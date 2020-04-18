lazy val sparkDep = "org.apache.spark" %% "spark-sql" % "2.4.4"
lazy val scalaTestDep = "org.scalatest" %% "scalatest" % "3.1.1"

lazy val $name;format="lower-camel"$ = (project in file("."))
	.settings(
		organization := "com.example",
		name := "$name;format="norm"$",
		version := "1.0",
		scalaVersion := "2.11.8",
		libraryDependencies ++= Seq(
			sparkDep % "provided",
			scalaTestDep % Test,
		),
	 )

