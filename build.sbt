import sbt._

name := "tut"

organization := "com.github.mboogerd"

version := "0.1"

lazy val root = project.in(file("."))
  .settings(LicenseConf.settings)
  .enablePlugins(TutPlugin)
  .settings(TutConf.settings)
