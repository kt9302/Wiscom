
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
object lasso extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(lasso: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html("Sentiment of words"), nav = "lasso")/*3.49*/ {_display_(Seq[Any](format.raw/*3.51*/("""
    
    <script type='text/javascript' > 
  		var lasso = """"),_display_(Seq[Any](/*6.19*/lasso)),format.raw/*6.24*/(""""; 
	</script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*8.42*/routes/*8.48*/.Assets.at("javascripts/lasso.js"))),format.raw/*8.82*/(""""></script>
    <p>
        <div id="lasso_div"></div>
    </p>
    
""")))})))}
    }
    
    def render(lasso:String): play.api.templates.HtmlFormat.Appendable = apply(lasso)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (lasso) => apply(lasso)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 24 17:58:56 PST 2013
                    SOURCE: /Users/kt9302/Desktop/Research/Wis Com/app/views/lasso.scala.html
                    HASH: 2d737c68969ab0cba3da9f67d94043982076741e
                    MATRIX: 774->1|883->16|922->21|977->68|1016->70|1116->135|1142->140|1235->198|1249->204|1304->238
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|36->8|36->8|36->8
                    -- GENERATED --
                */
            