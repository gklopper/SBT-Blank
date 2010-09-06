import sbt._

class Project(info: ProjectInfo) extends AppengineProject(info) with IdeaProject {

  val appengineVersion = "1.3.7"

  //val appengineApi = "com.google.appengine" % "appengine-api-1.0-sdk" % appengineVersion

  val servletApi = "javax.servlet" % "servlet-api" % "2.5" % "provided"

  val sonatypeNexusSnapshots = "Sonatype Nexus Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
  val sonatypeNexusReleases = "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases"

  val scalatra = "org.scalatra" %% "scalatra" % "2.0.0.M1"
}
