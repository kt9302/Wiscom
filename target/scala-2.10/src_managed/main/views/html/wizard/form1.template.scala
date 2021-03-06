
package views.html.wizard

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
object form1 extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signupForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
   Sign Up 1/2
""")))};
Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "wizard")/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""
    
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.Wizard.submit(1))/*12.51*/ {_display_(Seq[Any](format.raw/*12.53*/("""
        
        <fieldset>
            <legend>Account informations</legend>
            
            """),_display_(Seq[Any](/*17.14*/inputText(
                signupForm("username"), 
                '_label -> "Username", 
                '_help -> "Please choose a valid username.",
                '_error -> signupForm.globalError
            ))),format.raw/*22.14*/("""
            
            """),_display_(Seq[Any](/*24.14*/inputText(
                signupForm("email"), '_label -> "Email",
                '_help -> "Enter a valid email address."
            ))),format.raw/*27.14*/("""
            
            """),_display_(Seq[Any](/*29.14*/inputPassword(
                signupForm("password"), 
                '_label -> "Password",
                '_help -> "A password must be at least 6 characters. "
            ))),format.raw/*33.14*/("""
            
          	<div class="clearfix  " id="repeatPassword_field">
			    <label for="repeatPassword">Repeat password</label>
			    <div class="input">

			    <input type="password" id="repeatPassword" name="repeatPassword" value=""""),_display_(Seq[Any](/*39.81*/signupForm("password")/*39.103*/.value)),format.raw/*39.109*/("""">

			        <span class="help-inline"></span>
			        <span class="help-block">Please repeat your password again.</span> 
			    </div>
			</div>

        </fieldset>
        
		<input type="hidden" name="profile.country" value=""""),_display_(Seq[Any](/*48.55*/signupForm("profile.country")/*48.84*/.valueOr(""))),format.raw/*48.96*/("""">
		<input type="hidden" name="profile.address" value=""""),_display_(Seq[Any](/*49.55*/signupForm("profile.address")/*49.84*/.valueOr(""))),format.raw/*49.96*/("""">
		<input type="hidden" name="profile.age" value=""""),_display_(Seq[Any](/*50.51*/signupForm("profile.age")/*50.76*/.valueOr(""))),format.raw/*50.88*/("""">

        
        <div class="actions">
            <input type="submit" class="btn primary" value="Go to step 2">
        </div>
        
    """)))})),format.raw/*57.6*/("""
    
""")))})))}
    }
    
    def render(signupForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jan 25 22:58:53 PST 2014
                    SOURCE: /Users/kt9302/Desktop/Wiscom/app/views/wizard/form1.scala.html
                    HASH: 41ff3f35e676dddb9c78e0dacb78055ee99cbc8d
                    MATRIX: 785->1|936->80|948->85|1032->89|1088->25|1116->78|1143->106|1181->109|1217->136|1257->138|1303->149|1318->155|1366->194|1406->196|1547->301|1785->517|1848->544|2008->682|2071->709|2272->888|2551->1131|2583->1153|2612->1159|2884->1395|2922->1424|2956->1436|3049->1493|3087->1522|3121->1534|3210->1587|3244->1612|3278->1624|3456->1771
                    LINES: 26->1|31->6|31->6|33->6|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|43->12|48->17|53->22|55->24|58->27|60->29|64->33|70->39|70->39|70->39|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|88->57
                    -- GENERATED --
                */
            