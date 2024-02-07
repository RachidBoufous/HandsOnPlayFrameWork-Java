name := """Todo-simple-app"""
organization := "com.laedx"

version := "1.0-SNAPSHOT"

lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.13.12"

libraryDependencies += guice
libraryDependencies += "io.ebean" % "ebean" % "12.2.10"
libraryDependencies += "com.h2database" % "h2" % "1.4.200" // Or the latest version

