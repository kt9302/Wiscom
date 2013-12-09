
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Html("Form samples"))/*1.28*/ {_display_(Seq[Any](format.raw/*1.30*/("""
    
    <h2>Sign up form</h2>
    
    <p>
        Demonstrate a classical sign up form.
    </p>
    
    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*10.31*/routes/*10.37*/.SignUp.blank)),format.raw/*10.50*/("""">View sample »</a>
    </p>
    
    <h2>Contact form</h2>
    
    <p>
        Demonstrate a contact manager that allow to add complex contact informations.
    </p>
    
    <p>
        <a class="btn" href=""""),_display_(Seq[Any](/*20.31*/routes/*20.37*/.Contacts.blank)),format.raw/*20.52*/("""">View sample »</a>
    </p>
    
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Nov 24 17:58:56 PST 2013
                    SOURCE: /Users/kt9302/Desktop/Research/Wis Com/app/views/index.scala.html
                    HASH: ea860f52ea2ba1f712ecf397563d4df5d7f048d6
                    MATRIX: 864->1|898->27|937->29|1116->172|1131->178|1166->191|1413->402|1428->408|1465->423
                    LINES: 29->1|29->1|29->1|38->10|38->10|38->10|48->20|48->20|48->20
                    -- GENERATED --
                */
            