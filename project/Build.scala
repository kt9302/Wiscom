import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

    val appName         = "WisCom"
    val appVersion      = "1.0"

    val appDependencies = Seq(
	  javaCore,
	  javaJdbc,
	  javaJpa
    )

    val main = play.Project(appName, appVersion, appDependencies).settings(
      // Add your own project settings here      
    )

}
