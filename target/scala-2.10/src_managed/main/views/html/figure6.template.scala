
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object figure6 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(figure6: String, figure6Pie: String, appName: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.56*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html(appName), nav = "visualization")/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""
    
    <script type='text/javascript' > 
  		var figure6 = """"),_display_(Seq[Any](/*6.21*/figure6)),format.raw/*6.28*/(""""; 
  		var figure6Pie = """"),_display_(Seq[Any](/*7.24*/figure6Pie)),format.raw/*7.34*/("""";
	</script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.42*/routes/*9.48*/.Assets.at("javascripts/figure6.js"))),format.raw/*9.84*/(""""></script>
    <p>
        <div id="chart_div" class="center_col"></div>
        <div id="dashboard">  
		  <div id="control"><!-- Controls renders here --></div>  
		  <div id="chartInterval"><!-- Line chart renders here --></div>  
		</div>
    	<div id="pie_div" class="center_col"></div>
    </p>
    
""")))})))}
    }
    
    def render(figure6:String,figure6Pie:String,appName:String): play.api.templates.HtmlFormat.Appendable = apply(figure6,figure6Pie,appName)
    
    def f:((String,String,String) => play.api.templates.HtmlFormat.Appendable) = (figure6,figure6Pie,appName) => apply(figure6,figure6Pie,appName)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 24 18:02:37 PST 2013
                    SOURCE: /Users/kt9302/Desktop/Research/Wis Com/app/views/figure6.scala.html
                    HASH: 4c7ad005b0bc76f4539c983fa9cba452d8203c54
                    MATRIX: 790->1|938->55|975->58|1025->100|1064->102|1163->166|1191->173|1253->200|1284->210|1374->265|1388->271|1445->307
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|35->7|35->7|37->9|37->9|37->9
                    -- GENERATED --
                */
            