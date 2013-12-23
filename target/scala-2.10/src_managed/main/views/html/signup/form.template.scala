
package views.html.signup

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
object form extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(signupForm: Form[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._

import helper.twitterBootstrap._

def /*6.2*/title/*6.7*/:play.api.templates.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*6.11*/("""
    Sign Up <small><a href=""""),_display_(Seq[Any](/*7.30*/routes/*7.36*/.SignUp.edit)),format.raw/*7.48*/("""">Or edit an existing user</a></small>
""")))};
Seq[Any](format.raw/*1.26*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*8.2*/("""

"""),_display_(Seq[Any](/*10.2*/main(title, nav = "signup")/*10.29*/ {_display_(Seq[Any](format.raw/*10.31*/("""
    
    """),_display_(Seq[Any](/*12.6*/helper/*12.12*/.form(action = routes.SignUp.submit)/*12.48*/ {_display_(Seq[Any](format.raw/*12.50*/("""
        
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
            
            """),_display_(Seq[Any](/*35.14*/inputPassword(
                signupForm("repeatPassword"), 
                '_label -> "Repeat password",
                '_help -> "Please repeat your password again.",
                '_error -> signupForm.error("password")
            ))),format.raw/*40.14*/("""
            
        </fieldset>
        
        <fieldset>
            
            <legend>Contact informations</legend>
            
            """),_display_(Seq[Any](/*48.14*/select(
                signupForm("profile.country"), 
                options = options(Countries.list),
                '_default -> "--- Choose a country ---",
                '_label -> "Country",
                '_error -> signupForm("profile.country").error.map(_.withMessage("Please select your country"))
            ))),format.raw/*54.14*/("""
            
            """),_display_(Seq[Any](/*56.14*/textarea(
                signupForm("profile.address"), 
                '_label -> "Address", 'cols -> 50
            ))),format.raw/*59.14*/("""
            
            """),_display_(Seq[Any](/*61.14*/inputText(
                signupForm("profile.age"), 
                '_label -> "Age", 'class -> "mini",
                '_showConstraints -> false
            ))),format.raw/*65.14*/("""
              
        </fieldset>
        
        <fieldset>
            
            """),_display_(Seq[Any](/*71.14*/checkbox(
                signupForm("accept"), 
                '_label -> None, '_text -> "You agree the Terms and conditions",
                '_showConstraints -> false
            ))),format.raw/*75.14*/("""
            
        </fieldset>
        
        <div class="actions">
            <input type="submit" class="btn primary" value="Sign Up">
            <a href=""""),_display_(Seq[Any](/*81.23*/routes/*81.29*/.Application.index)),format.raw/*81.47*/("""" class="btn">Cancel</a>
        </div>
        
    """)))})),format.raw/*84.6*/("""
    
""")))})))}
    }
    
    def render(signupForm:Form[User]): play.api.templates.HtmlFormat.Appendable = apply(signupForm)
    
    def f:((Form[User]) => play.api.templates.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Dec 23 12:25:19 PST 2013
                    SOURCE: /Users/kt9302/Desktop/Wiscom/app/views/signup/form.scala.html
                    HASH: 1337b5cc642ff8dcffe05ccf008a5910fedb8698
                    MATRIX: 784->1|935->80|947->85|1031->89|1096->119|1110->125|1143->137|1222->25|1250->78|1277->177|1315->180|1351->207|1391->209|1437->220|1452->226|1497->262|1537->264|1678->369|1916->585|1979->612|2139->750|2202->777|2403->956|2466->983|2729->1224|2916->1375|3265->1702|3328->1729|3471->1850|3534->1877|3719->2040|3845->2130|4053->2316|4254->2481|4269->2487|4309->2505|4394->2559
                    LINES: 26->1|31->6|31->6|33->6|34->7|34->7|34->7|36->1|38->5|39->8|41->10|41->10|41->10|43->12|43->12|43->12|43->12|48->17|53->22|55->24|58->27|60->29|64->33|66->35|71->40|79->48|85->54|87->56|90->59|92->61|96->65|102->71|106->75|112->81|112->81|112->81|115->84
                    -- GENERATED --
                */
            