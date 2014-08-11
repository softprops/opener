organization := "me.lessis"

name := "opener"

version := "0.1.0"

description := "opens files, URIs, and your eyes on any given platform"

licenses := Seq(
  ("MIT", url("https://github.com/softprops/%s/blob/%s/LICENSE"
              .format(name.value,version.value))))

homepage := Some(url("https://github.com/softprops/%s/#readme".format(name.value)))

crossScalaVersions := Seq("2.10.4", "2.11.1")

scalaVersion := crossScalaVersions.value.last

seq(bintraySettings:_*)

bintray.Keys.packageLabels in bintray.Keys.bintray := Seq("open", "tools", "launcher")

seq(lsSettings:_*)

(LsKeys.tags in LsKeys.lsync) := Seq("open", "tools", "launcher")

(externalResolvers in LsKeys.lsync) := (resolvers in bintray.Keys.bintray).value

pomExtra := (
  <scm>
    <url>git@github.com:softprops/opener.git</url>
    <connection>scm:git:git@github.com:softprops/opener.git</connection>
  </scm>
  <developers>
    <developer>
      <id>softprops</id>
      <name>Doug Tangren</name>
      <url>https://github.com/softprops</url>
    </developer>
  </developers>)
