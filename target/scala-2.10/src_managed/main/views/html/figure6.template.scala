
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
object figure6 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(figure6: String, figure6Pie: String, appName: String,appId: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.70*/("""

"""),_display_(Seq[Any](/*3.2*/main(Html(appName), nav = "visualization")/*3.44*/ {_display_(Seq[Any](format.raw/*3.46*/("""
    
    <script type='text/javascript' > 
  		var figure6 = """"),_display_(Seq[Any](/*6.21*/figure6)),format.raw/*6.28*/(""""; 
  		var figure6Pie = """"),_display_(Seq[Any](/*7.24*/figure6Pie)),format.raw/*7.34*/("""";
		var appName=""""),_display_(Seq[Any](/*8.17*/appName)),format.raw/*8.24*/("""";
		var appId=""""),_display_(Seq[Any](/*9.15*/appId)),format.raw/*9.20*/("""";		
	</script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*11.42*/routes/*11.48*/.Assets.at("javascripts/figure6.js"))),format.raw/*11.84*/(""""></script>
    <p>
    	
        <div id="chart_div" class="center_col"></div>
        <div id="dashboard">  
		  <div id="control"><!-- Controls renders here --></div>  
		  <div id="chartInterval"><!-- Line chart renders here --></div>  
		</div>
    	<div id="pie_div" class="center_col"></div>
    </p>
    <!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
        <h4 class="modal-title" id="myModalLabel"></h4>
      </div>
      <div class="modal-body" >
      <div id="modal-body" class="center_col"></div>
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
    
""")))})))}
    }
    
    def render(figure6:String,figure6Pie:String,appName:String,appId:String): play.api.templates.HtmlFormat.Appendable = apply(figure6,figure6Pie,appName,appId)
    
    def f:((String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (figure6,figure6Pie,appName,appId) => apply(figure6,figure6Pie,appName,appId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 25 22:58:53 PST 2014
                    SOURCE: /Users/kt9302/Desktop/Wiscom/app/views/figure6.scala.html
                    HASH: 91632ed5ce9676737a1308543c31e9bcc0ab309b
                    MATRIX: 797->1|959->69|996->72|1046->114|1085->116|1184->180|1212->187|1274->214|1305->224|1359->243|1387->250|1439->267|1465->272|1558->329|1573->335|1631->371
                    LINES: 26->1|29->1|31->3|31->3|31->3|34->6|34->6|35->7|35->7|36->8|36->8|37->9|37->9|39->11|39->11|39->11
                    -- GENERATED --
                */
            