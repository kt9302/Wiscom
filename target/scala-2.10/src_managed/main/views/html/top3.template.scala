
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
object top3 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[String],List[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(top3Data: List[String], top3: List[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.46*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html("Top 3 complaints in categories"), nav = "top3")/*3.60*/ {_display_(Seq[Any](format.raw/*3.62*/("""
    
    <script type='text/javascript' > 
	    var top3 = []
        """),_display_(Seq[Any](/*7.10*/for(top3Entry <- top3Data) yield /*7.36*/ {_display_(Seq[Any](format.raw/*7.38*/("""
        	top3.push('"""),_display_(Seq[Any](/*8.22*/Html(top3Entry))),format.raw/*8.37*/("""');
        """)))})),format.raw/*9.10*/("""
	</script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.42*/routes/*11.48*/.Assets.at("javascripts/top3.js"))),format.raw/*11.81*/(""""></script>
    <div>
    	<h3>Game</h3>
	    <div class="btn-group btn-group-justified">
	    	<a id="btn-0" class="btn btn-primary change">"""),_display_(Seq[Any](/*15.53*/top3(0))),format.raw/*15.60*/("""</a>
	    	<a id="btn-1" class="btn btn-default change">"""),_display_(Seq[Any](/*16.53*/top3(1))),format.raw/*16.60*/("""</a>
	    	<a id="btn-2" class="btn btn-default change">"""),_display_(Seq[Any](/*17.53*/top3(2))),format.raw/*17.60*/("""</a>
	    	<a id="btn-3" class="btn btn-default change">"""),_display_(Seq[Any](/*18.53*/top3(3))),format.raw/*18.60*/("""</a>
	    	<a id="btn-4" class="btn btn-default change">"""),_display_(Seq[Any](/*19.53*/top3(4))),format.raw/*19.60*/("""</a>
	    	<a id="btn-5" class="btn btn-default change">"""),_display_(Seq[Any](/*20.53*/top3(5))),format.raw/*20.60*/("""</a>
		</div>
    	<h3>Application</h3>
	    <div class="btn-group btn-group-justified">
	    	<a id="btn-6" class="btn btn-default change">"""),_display_(Seq[Any](/*24.53*/top3(6))),format.raw/*24.60*/("""</a>
	    	<a id="btn-7" class="btn btn-default change">"""),_display_(Seq[Any](/*25.53*/top3(7))),format.raw/*25.60*/("""</a>
	    	<a id="btn-8" class="btn btn-default change">"""),_display_(Seq[Any](/*26.53*/top3(8))),format.raw/*26.60*/("""</a>
	    	<a id="btn-9" class="btn btn-default change">"""),_display_(Seq[Any](/*27.53*/top3(9))),format.raw/*27.60*/("""</a>
	    	<a id="btn-10" class="btn btn-default change">"""),_display_(Seq[Any](/*28.54*/top3(10))),format.raw/*28.62*/("""</a>
	    	<a id="btn-11" class="btn btn-default change">"""),_display_(Seq[Any](/*29.54*/top3(11))),format.raw/*29.62*/("""</a>
		</div>
	    <div class="btn-group btn-group-justified">
	    	<a id="btn-12" class="btn btn-default change">"""),_display_(Seq[Any](/*32.54*/top3(12))),format.raw/*32.62*/("""</a>
	    	<a id="btn-13" class="btn btn-default change">"""),_display_(Seq[Any](/*33.54*/top3(13))),format.raw/*33.62*/("""</a>
	    	<a id="btn-14" class="btn btn-default change">"""),_display_(Seq[Any](/*34.54*/top3(14))),format.raw/*34.62*/("""</a>
	    	<a id="btn-15" class="btn btn-default change">"""),_display_(Seq[Any](/*35.54*/top3(15))),format.raw/*35.62*/("""</a>
	    	<a id="btn-16" class="btn btn-default change">"""),_display_(Seq[Any](/*36.54*/top3(16))),format.raw/*36.62*/("""</a>
	    	<a id="btn-17" class="btn btn-default change">"""),_display_(Seq[Any](/*37.54*/top3(17))),format.raw/*37.62*/("""</a>
		</div>
	    <div class="btn-group btn-group-justified">
	    	<a id="btn-18" class="btn btn-default change">"""),_display_(Seq[Any](/*40.54*/top3(18))),format.raw/*40.62*/("""</a>
	    	<a id="btn-19" class="btn btn-default change">"""),_display_(Seq[Any](/*41.54*/top3(19))),format.raw/*41.62*/("""</a>
	    	<a id="btn-20" class="btn btn-default change">"""),_display_(Seq[Any](/*42.54*/top3(20))),format.raw/*42.62*/("""</a>
	    	<a id="btn-21" class="btn btn-default change">"""),_display_(Seq[Any](/*43.54*/top3(21))),format.raw/*43.62*/("""</a>
	    	<a id="btn-22" class="btn btn-default change">"""),_display_(Seq[Any](/*44.54*/top3(22))),format.raw/*44.62*/("""</a>
	    	<a id="btn-23" class="btn btn-default change">"""),_display_(Seq[Any](/*45.54*/top3(23))),format.raw/*45.62*/("""</a>
		</div>
	    <div class="btn-group btn-group-justified">
	    	<a id="btn-24" class="btn btn-default change">"""),_display_(Seq[Any](/*48.54*/top3(24))),format.raw/*48.62*/("""</a>
	    	<a id="btn-25" class="btn btn-default change">"""),_display_(Seq[Any](/*49.54*/top3(25))),format.raw/*49.62*/("""</a>
	    	<a id="btn-26" class="btn btn-default change">"""),_display_(Seq[Any](/*50.54*/top3(26))),format.raw/*50.62*/("""</a>
	    	<a id="btn-27" class="btn btn-default change">"""),_display_(Seq[Any](/*51.54*/top3(27))),format.raw/*51.62*/("""</a>
	    	<a id="btn-28" class="btn btn-default change">"""),_display_(Seq[Any](/*52.54*/top3(28))),format.raw/*52.62*/("""</a>
	    	<a id="btn-29" class="btn btn-default change">"""),_display_(Seq[Any](/*53.54*/top3(29))),format.raw/*53.62*/("""</a>
		</div>
	</div>
	<p></p>
    <div>
    	<div class="center_col">
    		<div id="pie_div"></div>
    	</div>
    </div>
    
""")))})))}
    }
    
    def render(top3Data:List[String],top3:List[String]): play.api.templates.HtmlFormat.Appendable = apply(top3Data,top3)
    
    def f:((List[String],List[String]) => play.api.templates.HtmlFormat.Appendable) = (top3Data,top3) => apply(top3Data,top3)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 25 22:58:53 PST 2014
                    SOURCE: /Users/kt9302/Desktop/Wiscom/app/views/top3.scala.html
                    HASH: f7f8ebff8219d18067011b083aa894e44d90de90
                    MATRIX: 792->1|930->45|969->50|1035->108|1074->110|1185->186|1226->212|1265->214|1323->237|1359->252|1404->266|1495->321|1510->327|1565->360|1747->506|1776->513|1870->571|1899->578|1993->636|2022->643|2116->701|2145->708|2239->766|2268->773|2362->831|2391->838|2572->983|2601->990|2695->1048|2724->1055|2818->1113|2847->1120|2941->1178|2970->1185|3065->1244|3095->1252|3190->1311|3220->1319|3375->1438|3405->1446|3500->1505|3530->1513|3625->1572|3655->1580|3750->1639|3780->1647|3875->1706|3905->1714|4000->1773|4030->1781|4185->1900|4215->1908|4310->1967|4340->1975|4435->2034|4465->2042|4560->2101|4590->2109|4685->2168|4715->2176|4810->2235|4840->2243|4995->2362|5025->2370|5120->2429|5150->2437|5245->2496|5275->2504|5370->2563|5400->2571|5495->2630|5525->2638|5620->2697|5650->2705
                    LINES: 26->1|29->1|31->3|31->3|31->3|35->7|35->7|35->7|36->8|36->8|37->9|39->11|39->11|39->11|43->15|43->15|44->16|44->16|45->17|45->17|46->18|46->18|47->19|47->19|48->20|48->20|52->24|52->24|53->25|53->25|54->26|54->26|55->27|55->27|56->28|56->28|57->29|57->29|60->32|60->32|61->33|61->33|62->34|62->34|63->35|63->35|64->36|64->36|65->37|65->37|68->40|68->40|69->41|69->41|70->42|70->42|71->43|71->43|72->44|72->44|73->45|73->45|76->48|76->48|77->49|77->49|78->50|78->50|79->51|79->51|80->52|80->52|81->53|81->53
                    -- GENERATED --
                */
            