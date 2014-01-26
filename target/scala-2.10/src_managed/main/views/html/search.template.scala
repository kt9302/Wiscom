
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
object search extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[App],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(appForm: Form[App]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.22*/("""
"""),format.raw/*3.1*/("""
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="Coming soon page">
<meta name="author" content="Your name">
<title>Home page of WisCom</title>
<link href=""""),_display_(Seq[Any](/*12.14*/routes/*12.20*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*12.59*/("""" rel="stylesheet" type='text/css'>

<link href=""""),_display_(Seq[Any](/*14.14*/routes/*14.20*/.Assets.at("stylesheets/jqueryui.css"))),format.raw/*14.58*/("""" rel="stylesheet" type='text/css'>
<link href=""""),_display_(Seq[Any](/*15.14*/routes/*15.20*/.Assets.at("stylesheets/font-awesome.css"))),format.raw/*15.62*/("""" rel="stylesheet" type='text/css'>
<link href=""""),_display_(Seq[Any](/*16.14*/routes/*16.20*/.Assets.at("stylesheets/coming-soon.css"))),format.raw/*16.61*/("""" rel="stylesheet" type='text/css'>

</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container">
				<a class="navbar-brand brand" href=""""),_display_(Seq[Any](/*23.42*/routes/*23.48*/.Search.index())),format.raw/*23.63*/(""""><img src=""""),_display_(Seq[Any](/*23.76*/routes/*23.82*/.Assets.at("images/logo.png"))),format.raw/*23.111*/("""" width="80" height="30" /></a>
				<div class="nav-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href=""""),_display_(Seq[Any](/*26.36*/routes/*26.42*/.Search.index())),format.raw/*26.57*/("""">Search</a></li>
						<li><a href=""""),_display_(Seq[Any](/*27.21*/routes/*27.27*/.Figure6.index())),format.raw/*27.43*/("""">Visualization</a></li>
						<li><a href=""""),_display_(Seq[Any](/*28.21*/routes/*28.27*/.Lasso.index())),format.raw/*28.41*/("""">Sentiment</a></li>
						<li><a href=""""),_display_(Seq[Any](/*29.21*/routes/*29.27*/.Topic.index())),format.raw/*29.41*/("""">Root Causes</a></li>
						<li><a href=""""),_display_(Seq[Any](/*30.21*/routes/*30.27*/.Top3.index())),format.raw/*30.40*/("""">Complaints</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="container2" id="abc">
		<div class="widget transparent lighting-border rounded-corner">
			<h1 class="logo align-center">
				<img src=""""),_display_(Seq[Any](/*40.16*/routes/*40.22*/.Assets.at("images/logo.png"))),format.raw/*40.51*/("""" width="400" height="100" />
			</h1>
			<h2 class="description">A multi-level system that analyzes user
				reviews at various granularities: micro-level (comment-word
				centric), meso-level (app centric), and macro-level (market 		                centric analysis).</h2>
               
			<div class="clearfix"></div>
		</div>
		"""),_display_(Seq[Any](/*48.4*/helper/*48.10*/.form(action = routes.Figure6.submit(), 'class -> "form-group form-search subscribe-container", 'method -> "get")/*48.123*/ {_display_(Seq[Any](format.raw/*48.125*/("""
			<div class="input-group """),_display_(Seq[Any](/*49.29*/("has-error".when(appForm.hasErrors)))),format.raw/*49.66*/("""">
            
				<input type="hidden" name="id" id="id" value=""""),_display_(Seq[Any](/*51.52*/appForm("id")/*51.65*/.value)),format.raw/*51.71*/("""" required>
				<input type="text" name="appName" id="appName" data-provide="typeahead" class="form-control input-lg" placeholder="App name" required>
				<span class="input-group-btn">
			        <button class="btn btn-success input-lg" type="submit" >Go!</button>
			    </span>
			
            </div>
			<span class="help-block">
				"""),_display_(Seq[Any](/*59.6*/if(appForm.error("appName") != null)/*59.42*/ {_display_(Seq[Any](format.raw/*59.44*/("""
					"""),_display_(Seq[Any](/*60.7*/appForm/*60.14*/.error("appName").message)),format.raw/*60.39*/("""
                    
				""")))})),format.raw/*62.6*/("""
			</span>
		""")))})),format.raw/*64.4*/("""
 
		<!-- Modal -->
		<div class="modal fade" id="myModal">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		        <h4 class="modal-title">Alert</h4>
		      </div>
		      <div class="modal-body">
		        Sorry, App: """),_display_(Seq[Any](/*75.24*/appForm("appName")/*75.42*/.value)),format.raw/*75.48*/(""" """),_display_(Seq[Any](/*75.50*/appForm("id")/*75.63*/.value)),format.raw/*75.69*/("""  is not found in the database.
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->
		<div class="footer align-center">
			<span class="copyright transparent lighting-border rounded-corner">
				&copy; 2013 All rights reserved. </span>
		</div>
	</div>
    
	<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
	<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
   
    <script src="/twitter-bootstrap/twitter-bootstrap-v2/docs/assets/js/jquery.js"></script>  

    <script type="text/javascript" src=""""),_display_(Seq[Any](/*91.42*/routes/*91.48*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*91.90*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*92.39*/routes/*92.45*/.Assets.at("javascripts/search.js"))),format.raw/*92.80*/(""""></script>
</body>
</html>"""))}
    }
    
    def render(appForm:Form[App]): play.api.templates.HtmlFormat.Appendable = apply(appForm)
    
    def f:((Form[App]) => play.api.templates.HtmlFormat.Appendable) = (appForm) => apply(appForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 25 22:58:53 PST 2014
                    SOURCE: /Users/kt9302/Desktop/Wiscom/app/views/search.scala.html
                    HASH: e67827d493f68abc6c85e6be5963096ee350148a
                    MATRIX: 778->1|908->21|935->39|1248->316|1263->322|1324->361|1410->411|1425->417|1485->455|1570->504|1585->510|1649->552|1734->601|1749->607|1812->648|2051->851|2066->857|2103->872|2152->885|2167->891|2219->920|2395->1060|2410->1066|2447->1081|2521->1119|2536->1125|2574->1141|2655->1186|2670->1192|2706->1206|2783->1247|2798->1253|2834->1267|2913->1310|2928->1316|2963->1329|3221->1551|3236->1557|3287->1586|3658->1922|3673->1928|3796->2041|3837->2043|3902->2072|3961->2109|4064->2176|4086->2189|4114->2195|4487->2533|4532->2569|4572->2571|4614->2578|4630->2585|4677->2610|4735->2637|4781->2652|5196->3031|5223->3049|5251->3055|5289->3057|5311->3070|5339->3076|5968->3669|5983->3675|6047->3717|6133->3767|6148->3773|6205->3808
                    LINES: 26->1|30->1|31->3|40->12|40->12|40->12|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|51->23|51->23|51->23|51->23|51->23|51->23|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|58->30|58->30|58->30|68->40|68->40|68->40|76->48|76->48|76->48|76->48|77->49|77->49|79->51|79->51|79->51|87->59|87->59|87->59|88->60|88->60|88->60|90->62|92->64|103->75|103->75|103->75|103->75|103->75|103->75|119->91|119->91|119->91|120->92|120->92|120->92
                    -- GENERATED --
                */
            