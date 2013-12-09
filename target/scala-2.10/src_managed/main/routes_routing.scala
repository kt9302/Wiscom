// @SOURCE:/Users/kt9302/Desktop/Research/Wis Com/conf/routes
// @HASH:6edcf84b7bc14481b1d5477a787720a102037097
// @DATE:Sun Nov 24 17:58:52 PST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Search_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("application"))))
        

// @LINE:10
private[this] lazy val controllers_Search_ajax2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("search/ajax"))))
        

// @LINE:13
private[this] lazy val controllers_Figure6_index3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("figure6"))))
        

// @LINE:14
private[this] lazy val controllers_Figure6_app4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("figure6"),DynamicPart("id", """[^/]+""",true))))
        

// @LINE:15
private[this] lazy val controllers_Figure6_submit5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("figure6"))))
        

// @LINE:18
private[this] lazy val controllers_Lasso_index6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("lasso"))))
        

// @LINE:21
private[this] lazy val controllers_Topic_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("topic"))))
        

// @LINE:24
private[this] lazy val controllers_Top3_index8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("top3"))))
        

// @LINE:27
private[this] lazy val controllers_SignUp_blank9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:28
private[this] lazy val controllers_SignUp_edit10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users/fakeuser"))))
        

// @LINE:29
private[this] lazy val controllers_SignUp_submit11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:32
private[this] lazy val controllers_Contacts_blank12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contacts"))))
        

// @LINE:33
private[this] lazy val controllers_Contacts_edit13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contacts/fakecontact"))))
        

// @LINE:34
private[this] lazy val controllers_Contacts_submit14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contacts"))))
        

// @LINE:37
private[this] lazy val controllers_Wizard_step15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wizard/"),DynamicPart("step", """[^/]+""",true))))
        

// @LINE:38
private[this] lazy val controllers_Wizard_submit16 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("wizard/"),DynamicPart("step", """[^/]+""",true))))
        

// @LINE:41
private[this] lazy val controllers_Assets_at17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Search.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """application""","""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """search/ajax""","""controllers.Search.ajax(term:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """figure6""","""controllers.Figure6.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """figure6$id<[^/]+>""","""controllers.Figure6.app(id:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """figure6""","""controllers.Figure6.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """lasso""","""controllers.Lasso.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """topic""","""controllers.Topic.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """top3""","""controllers.Top3.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignUp.blank()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users/fakeuser""","""controllers.SignUp.edit()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.SignUp.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contacts""","""controllers.Contacts.blank()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contacts/fakecontact""","""controllers.Contacts.edit()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contacts""","""controllers.Contacts.submit()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wizard/$step<[^/]+>""","""controllers.Wizard.step(step:Int)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """wizard/$step<[^/]+>""","""controllers.Wizard.submit(step:Int)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Search_index0(params) => {
   call { 
        invokeHandler(controllers.Search.index(), HandlerDef(this, "controllers.Search", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_index1(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """""", Routes.prefix + """application"""))
   }
}
        

// @LINE:10
case controllers_Search_ajax2(params) => {
   call(params.fromQuery[String]("term", None)) { (term) =>
        invokeHandler(controllers.Search.ajax(term), HandlerDef(this, "controllers.Search", "ajax", Seq(classOf[String]),"GET", """ Search""", Routes.prefix + """search/ajax"""))
   }
}
        

// @LINE:13
case controllers_Figure6_index3(params) => {
   call { 
        invokeHandler(controllers.Figure6.index(), HandlerDef(this, "controllers.Figure6", "index", Nil,"GET", """ Figure 6""", Routes.prefix + """figure6"""))
   }
}
        

// @LINE:14
case controllers_Figure6_app4(params) => {
   call(params.fromPath[Int]("id", None)) { (id) =>
        invokeHandler(controllers.Figure6.app(id), HandlerDef(this, "controllers.Figure6", "app", Seq(classOf[Int]),"GET", """""", Routes.prefix + """figure6$id<[^/]+>"""))
   }
}
        

// @LINE:15
case controllers_Figure6_submit5(params) => {
   call { 
        invokeHandler(controllers.Figure6.submit(), HandlerDef(this, "controllers.Figure6", "submit", Nil,"POST", """""", Routes.prefix + """figure6"""))
   }
}
        

// @LINE:18
case controllers_Lasso_index6(params) => {
   call { 
        invokeHandler(controllers.Lasso.index(), HandlerDef(this, "controllers.Lasso", "index", Nil,"GET", """ Lasso""", Routes.prefix + """lasso"""))
   }
}
        

// @LINE:21
case controllers_Topic_index7(params) => {
   call { 
        invokeHandler(controllers.Topic.index(), HandlerDef(this, "controllers.Topic", "index", Nil,"GET", """ Topic""", Routes.prefix + """topic"""))
   }
}
        

// @LINE:24
case controllers_Top3_index8(params) => {
   call { 
        invokeHandler(controllers.Top3.index(), HandlerDef(this, "controllers.Top3", "index", Nil,"GET", """Top3""", Routes.prefix + """top3"""))
   }
}
        

// @LINE:27
case controllers_SignUp_blank9(params) => {
   call { 
        invokeHandler(controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Nil,"GET", """ Signup""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:28
case controllers_SignUp_edit10(params) => {
   call { 
        invokeHandler(controllers.SignUp.edit(), HandlerDef(this, "controllers.SignUp", "edit", Nil,"GET", """""", Routes.prefix + """users/fakeuser"""))
   }
}
        

// @LINE:29
case controllers_SignUp_submit11(params) => {
   call { 
        invokeHandler(controllers.SignUp.submit(), HandlerDef(this, "controllers.SignUp", "submit", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:32
case controllers_Contacts_blank12(params) => {
   call { 
        invokeHandler(controllers.Contacts.blank(), HandlerDef(this, "controllers.Contacts", "blank", Nil,"GET", """ Contact""", Routes.prefix + """contacts"""))
   }
}
        

// @LINE:33
case controllers_Contacts_edit13(params) => {
   call { 
        invokeHandler(controllers.Contacts.edit(), HandlerDef(this, "controllers.Contacts", "edit", Nil,"GET", """""", Routes.prefix + """contacts/fakecontact"""))
   }
}
        

// @LINE:34
case controllers_Contacts_submit14(params) => {
   call { 
        invokeHandler(controllers.Contacts.submit(), HandlerDef(this, "controllers.Contacts", "submit", Nil,"POST", """""", Routes.prefix + """contacts"""))
   }
}
        

// @LINE:37
case controllers_Wizard_step15(params) => {
   call(params.fromPath[Int]("step", None)) { (step) =>
        invokeHandler(controllers.Wizard.step(step), HandlerDef(this, "controllers.Wizard", "step", Seq(classOf[Int]),"GET", """ Wizard""", Routes.prefix + """wizard/$step<[^/]+>"""))
   }
}
        

// @LINE:38
case controllers_Wizard_submit16(params) => {
   call(params.fromPath[Int]("step", None)) { (step) =>
        invokeHandler(controllers.Wizard.submit(step), HandlerDef(this, "controllers.Wizard", "submit", Seq(classOf[Int]),"POST", """""", Routes.prefix + """wizard/$step<[^/]+>"""))
   }
}
        

// @LINE:41
case controllers_Assets_at17(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     