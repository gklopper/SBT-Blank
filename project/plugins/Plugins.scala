import sbt._
class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val sbtIdeaRepo = "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
  val sbtIdea = "com.github.mpeltonen" % "sbt-idea-plugin" % "0.1-SNAPSHOT"

  val appenginePlugin = "net.stbbs.yasushi" % "sbt-appengine-plugin" % "2.1" from "http://github.com/downloads/Yasushi/sbt-appengine-plugin/sbt-appengine-plugin-2.1.jar"
}
