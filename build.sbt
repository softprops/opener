organization := "me.lessis"

name := "opener"

version := "0.1.0"

description := "opens files, URIs, and your eyes on any given platform"

licenses := Seq(
  ("MIT", url("https://github.com/softprops/%s/blob/%s/LICENSE"
              .format(name.value,version.value))))

homepage := Some(url("https://github.com/softprops/%s/#readme".format(name.value)))

scalaVersion := "2.9.3"

crossScalaVersions := Seq("2.9.3", "2.10.0", "2.10.1", "2.10.2")

seq(bintraySettings:_*)

bintray.Keys.packageLabels in bintray.Keys.bintray := Seq("open", "tools", "launcher")

seq(lsSettings:_*)

(LsKeys.tags in LsKeys.lsync) := Seq("open", "tools", "launcher")

(externalResolvers in LsKeys.lsync) := (resolvers in bintray.Keys.bintray).value
