
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>WisCom</title>

		<link href=""""),_display_(Seq[Any](/*9.16*/routes/*9.22*/.Assets.at("stylesheets/bootstrap-responsive.min.css"))),format.raw/*9.76*/("""" rel="stylesheet" type='text/css'>
		<link href=""""),_display_(Seq[Any](/*10.16*/routes/*10.22*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*10.65*/("""" rel="stylesheet" type='text/css'>
		<link href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" rel="stylesheet">
		<link href=""""),_display_(Seq[Any](/*12.16*/routes/*12.22*/.Assets.at("stylesheets/font-awesome.css"))),format.raw/*12.64*/("""" rel="stylesheet" type='text/css'>
		<link href=""""),_display_(Seq[Any](/*13.16*/routes/*13.22*/.Assets.at("stylesheets/coming-soon.css"))),format.raw/*13.63*/("""" rel="stylesheet" type='text/css'>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/main.css"))),format.raw/*14.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*15.59*/routes/*15.65*/.Assets.at("images/favicon.png"))),format.raw/*15.97*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*16.46*/routes/*16.52*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*16.97*/(""""></script>
        <script type="text/javascript" src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*18.46*/routes/*18.52*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*18.94*/(""""></script>
    	<script type="text/javascript" src="https://www.google.com/jsapi"></script>
    </head>
        
    <body>
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container">
					<a class="navbar-brand brand" href=""""),_display_(Seq[Any](/*26.43*/routes/*26.49*/.Search.index())),format.raw/*26.64*/(""""><img src=""""),_display_(Seq[Any](/*26.77*/routes/*26.83*/.Assets.at("images/logo.png"))),format.raw/*26.112*/("""" width="80" height="30" /></a>
					<div class="nav-collapse collapse">
						<ul class="nav navbar-nav">
							<li class=""""),_display_(Seq[Any](/*29.20*/("active".when(nav == "search")))),format.raw/*29.52*/("""">
                            	<a href=""""),_display_(Seq[Any](/*30.40*/routes/*30.46*/.Search.index())),format.raw/*30.61*/("""">Search</a>
                        	</li>
                        	<li class=""""),_display_(Seq[Any](/*32.38*/("active".when(nav == "visualization")))),format.raw/*32.77*/("""">
                            	<a href=""""),_display_(Seq[Any](/*33.40*/routes/*33.46*/.Figure6.index())),format.raw/*33.62*/("""">Visualization</a>
                        	</li>
                        	<li class=""""),_display_(Seq[Any](/*35.38*/("active".when(nav == "lasso")))),format.raw/*35.69*/("""">
                            	<a href=""""),_display_(Seq[Any](/*36.40*/routes/*36.46*/.Lasso.index())),format.raw/*36.60*/("""">Sentiment</a>
                        	</li>
                        	<li class=""""),_display_(Seq[Any](/*38.38*/("active".when(nav == "topic")))),format.raw/*38.69*/("""">
                            	<a href=""""),_display_(Seq[Any](/*39.40*/routes/*39.46*/.Topic.index())),format.raw/*39.60*/("""">Root Causes</a>
                        	</li>
                        	<li class=""""),_display_(Seq[Any](/*41.38*/("active".when(nav == "top3")))),format.raw/*41.68*/("""">
                            	<a href=""""),_display_(Seq[Any](/*42.40*/routes/*42.46*/.Top3.index())),format.raw/*42.59*/("""">Complaints</a>
                        	</li>
						</ul>
					</div>
				</div>
			</div>
		</div>

        <div class="container">

            <div class="content">
                
                <div class="page-header">
                    <h1>"""),_display_(Seq[Any](/*55.26*/title)),format.raw/*55.31*/("""</h1>
                </div>

                <div class="row">
                        """),_display_(Seq[Any](/*59.26*/content)),format.raw/*59.33*/("""
                </div>
                
            </div>

            <footer>
                <div class="footer align-center">
					<span class="copyright">
						&copy; 2013 All rights reserved. 
					</span>
				</div>
            </footer>

        </div>
        
    </body>
</html>
"""))}
    }
    
    def render(title:Html,nav:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 23 11:54:51 PST 2013
                    SOURCE: /Users/kt9302/Desktop/Wiscom/app/views/main.scala.html
                    HASH: 84dc92a9c58dd37864ef1e61cc08067451ec06f3
                    MATRIX: 783->1|923->47|1041->130|1055->136|1130->190|1217->241|1232->247|1297->290|1482->439|1497->445|1561->487|1648->538|1663->544|1726->585|1851->674|1866->680|1922->714|2019->775|2034->781|2088->813|2172->861|2187->867|2254->912|2448->1070|2463->1076|2527->1118|2843->1398|2858->1404|2895->1419|2944->1432|2959->1438|3011->1467|3173->1593|3227->1625|3305->1667|3320->1673|3357->1688|3474->1769|3535->1808|3613->1850|3628->1856|3666->1872|3790->1960|3843->1991|3921->2033|3936->2039|3972->2053|4092->2137|4145->2168|4223->2210|4238->2216|4274->2230|4396->2316|4448->2346|4526->2388|4541->2394|4576->2407|4866->2661|4893->2666|5018->2755|5047->2762
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|46->18|46->18|46->18|54->26|54->26|54->26|54->26|54->26|54->26|57->29|57->29|58->30|58->30|58->30|60->32|60->32|61->33|61->33|61->33|63->35|63->35|64->36|64->36|64->36|66->38|66->38|67->39|67->39|67->39|69->41|69->41|70->42|70->42|70->42|83->55|83->55|87->59|87->59
                    -- GENERATED --
                */
            