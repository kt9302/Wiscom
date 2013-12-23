
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
object topic extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(topic: List[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html("Words in root causes"), nav = "topic")/*3.51*/ {_display_(Seq[Any](format.raw/*3.53*/("""
    
    <script type='text/javascript' > 
	    var topic = []
        """),_display_(Seq[Any](/*7.10*/for(topicEntry <- topic) yield /*7.34*/ {_display_(Seq[Any](format.raw/*7.36*/("""
        	topic.push('"""),_display_(Seq[Any](/*8.23*/Html(topicEntry))),format.raw/*8.39*/("""');
        """)))})),format.raw/*9.10*/("""
	</script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.42*/routes/*11.48*/.Assets.at("javascripts/topic.js"))),format.raw/*11.82*/(""""></script>
    <div>
	    <div class="btn-group btn-group-justified">
	    	<a id="btn-0" class="btn btn-primary change">Cost</a>
	    	<a id="btn-1" class="btn btn-default change">Picture</a>
	    	<a id="btn-2" class="btn btn-default change">Telephony</a>
	    	<a id="btn-3" class="btn btn-default change">Connectivity</a>
	    	<a id="btn-4" class="btn btn-default change">Compatibility</a>
		</div>
		<div class="btn-group btn-group-justified">
	    	<a id="btn-5" class="btn btn-default change">Attractiveness</a>
	    	<a id="btn-6" class="btn btn-default change">Media</a>
	    	<a id="btn-7" class="btn btn-default change">Stability</a>
	    	<a id="btn-8" class="btn btn-default change">Accuracy</a>
	    	<a id="btn-9" class="btn btn-default change">Spam</a>
		</div>
	</div>
	<p></p>
    <div>
    	<div class="left_col">
    		<div id="pie_div"></div>
    	</div>
    	<div class="right_col">
    		<div id="table_div"></div>
    	</div>
    </div>
    
""")))})))}
    }
    
    def render(topic:List[String]): play.api.templates.HtmlFormat.Appendable = apply(topic)
    
    def f:((List[String]) => play.api.templates.HtmlFormat.Appendable) = (topic) => apply(topic)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 25 12:54:37 PST 2013
                    SOURCE: /Users/kt9302/Desktop/Research/w1/app/views/topic.scala.html
                    HASH: 577c6b1c43bc18aca13080ddd659de7516619b95
                    MATRIX: 780->1|895->22|934->27|991->76|1030->78|1142->155|1181->179|1220->181|1279->205|1316->221|1361->235|1452->290|1467->296|1523->330
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|36->8|36->8|37->9|39->11|39->11|39->11
                    -- GENERATED --
                */
            