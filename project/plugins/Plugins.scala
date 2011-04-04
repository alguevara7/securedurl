import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val appenginePlugin = "net.stbbs.yasushi" % "sbt-appengine-plugin" % "2.1"
  val eclipsePlugin = "de.element34" % "sbt-eclipsify" % "0.7.0"
}


