// @SOURCE:/Users/kt9302/Desktop/Wiscom/conf/routes
// @HASH:57f0f7c1880af3e8dde1e11c80869a204630e8af
// @DATE:Mon Dec 23 12:25:39 PST 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:43
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:10
// @LINE:7
// @LINE:6
package controllers {

// @LINE:43
class ReverseAssets {
    

// @LINE:43
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:31
// @LINE:30
// @LINE:29
class ReverseSignUp {
    

// @LINE:30
def edit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users/fakeuser")
}
                                                

// @LINE:29
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:31
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                
    
}
                          

// @LINE:26
class ReverseTop3 {
    

// @LINE:26
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "top3")
}
                                                
    
}
                          

// @LINE:23
class ReverseTopic {
    

// @LINE:23
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "topic")
}
                                                
    
}
                          

// @LINE:17
// @LINE:15
// @LINE:13
class ReverseFigure6 {
    

// @LINE:13
def abc(term:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "figure6/abc" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("term", term)))))
}
                                                

// @LINE:15
def app(id:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "figure6" + implicitly[PathBindable[Int]].unbind("id", id))
}
                                                

// @LINE:17
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "figure6")
}
                                                
    
}
                          

// @LINE:20
class ReverseLasso {
    

// @LINE:20
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "lasso")
}
                                                
    
}
                          

// @LINE:7
class ReverseApplication {
    

// @LINE:7
def index(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "application")
}
                                                
    
}
                          

// @LINE:10
// @LINE:6
class ReverseSearch {
    

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:10
def ajax(term:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "search/ajax" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("term", term)))))
}
                                                
    
}
                          

// @LINE:36
// @LINE:35
// @LINE:34
class ReverseContacts {
    

// @LINE:35
def edit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contacts/fakecontact")
}
                                                

// @LINE:34
def blank(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contacts")
}
                                                

// @LINE:36
def submit(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "contacts")
}
                                                
    
}
                          

// @LINE:40
// @LINE:39
class ReverseWizard {
    

// @LINE:39
def step(step:Int): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "wizard/" + implicitly[PathBindable[Int]].unbind("step", step))
}
                                                

// @LINE:40
def submit(step:Int): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "wizard/" + implicitly[PathBindable[Int]].unbind("step", step))
}
                                                
    
}
                          
}
                  


// @LINE:43
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:43
class ReverseAssets {
    

// @LINE:43
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:31
// @LINE:30
// @LINE:29
class ReverseSignUp {
    

// @LINE:30
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.edit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users/fakeuser"})
      }
   """
)
                        

// @LINE:29
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:31
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.SignUp.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        
    
}
              

// @LINE:26
class ReverseTop3 {
    

// @LINE:26
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Top3.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "top3"})
      }
   """
)
                        
    
}
              

// @LINE:23
class ReverseTopic {
    

// @LINE:23
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Topic.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "topic"})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:15
// @LINE:13
class ReverseFigure6 {
    

// @LINE:13
def abc : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Figure6.abc",
   """
      function(term) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "figure6/abc" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("term", term)])})
      }
   """
)
                        

// @LINE:15
def app : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Figure6.app",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "figure6" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:17
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Figure6.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "figure6"})
      }
   """
)
                        
    
}
              

// @LINE:20
class ReverseLasso {
    

// @LINE:20
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Lasso.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lasso"})
      }
   """
)
                        
    
}
              

// @LINE:7
class ReverseApplication {
    

// @LINE:7
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "application"})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:6
class ReverseSearch {
    

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def ajax : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Search.ajax",
   """
      function(term) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/ajax" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("term", term)])})
      }
   """
)
                        
    
}
              

// @LINE:36
// @LINE:35
// @LINE:34
class ReverseContacts {
    

// @LINE:35
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Contacts.edit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts/fakecontact"})
      }
   """
)
                        

// @LINE:34
def blank : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Contacts.blank",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
      }
   """
)
                        

// @LINE:36
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Contacts.submit",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contacts"})
      }
   """
)
                        
    
}
              

// @LINE:40
// @LINE:39
class ReverseWizard {
    

// @LINE:39
def step : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Wizard.step",
   """
      function(step) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "wizard/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("step", step)})
      }
   """
)
                        

// @LINE:40
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Wizard.submit",
   """
      function(step) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "wizard/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("step", step)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:43
// @LINE:40
// @LINE:39
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:23
// @LINE:20
// @LINE:17
// @LINE:15
// @LINE:13
// @LINE:10
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:43
class ReverseAssets {
    

// @LINE:43
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:31
// @LINE:30
// @LINE:29
class ReverseSignUp {
    

// @LINE:30
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.edit(), HandlerDef(this, "controllers.SignUp", "edit", Seq(), "GET", """""", _prefix + """users/fakeuser""")
)
                      

// @LINE:29
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.blank(), HandlerDef(this, "controllers.SignUp", "blank", Seq(), "GET", """ Signup""", _prefix + """signup""")
)
                      

// @LINE:31
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.SignUp.submit(), HandlerDef(this, "controllers.SignUp", "submit", Seq(), "POST", """""", _prefix + """signup""")
)
                      
    
}
                          

// @LINE:26
class ReverseTop3 {
    

// @LINE:26
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Top3.index(), HandlerDef(this, "controllers.Top3", "index", Seq(), "GET", """Top3""", _prefix + """top3""")
)
                      
    
}
                          

// @LINE:23
class ReverseTopic {
    

// @LINE:23
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Topic.index(), HandlerDef(this, "controllers.Topic", "index", Seq(), "GET", """ Topic""", _prefix + """topic""")
)
                      
    
}
                          

// @LINE:17
// @LINE:15
// @LINE:13
class ReverseFigure6 {
    

// @LINE:13
def abc(term:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Figure6.abc(term), HandlerDef(this, "controllers.Figure6", "abc", Seq(classOf[String]), "GET", """ Figure 6""", _prefix + """figure6/abc""")
)
                      

// @LINE:15
def app(id:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Figure6.app(id), HandlerDef(this, "controllers.Figure6", "app", Seq(classOf[Int]), "GET", """""", _prefix + """figure6$id<[^/]+>""")
)
                      

// @LINE:17
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Figure6.submit(), HandlerDef(this, "controllers.Figure6", "submit", Seq(), "POST", """""", _prefix + """figure6""")
)
                      
    
}
                          

// @LINE:20
class ReverseLasso {
    

// @LINE:20
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Lasso.index(), HandlerDef(this, "controllers.Lasso", "index", Seq(), "GET", """ Lasso""", _prefix + """lasso""")
)
                      
    
}
                          

// @LINE:7
class ReverseApplication {
    

// @LINE:7
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """application""")
)
                      
    
}
                          

// @LINE:10
// @LINE:6
class ReverseSearch {
    

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.index(), HandlerDef(this, "controllers.Search", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:10
def ajax(term:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Search.ajax(term), HandlerDef(this, "controllers.Search", "ajax", Seq(classOf[String]), "GET", """ Search""", _prefix + """search/ajax""")
)
                      
    
}
                          

// @LINE:36
// @LINE:35
// @LINE:34
class ReverseContacts {
    

// @LINE:35
def edit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Contacts.edit(), HandlerDef(this, "controllers.Contacts", "edit", Seq(), "GET", """""", _prefix + """contacts/fakecontact""")
)
                      

// @LINE:34
def blank(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Contacts.blank(), HandlerDef(this, "controllers.Contacts", "blank", Seq(), "GET", """ Contact""", _prefix + """contacts""")
)
                      

// @LINE:36
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Contacts.submit(), HandlerDef(this, "controllers.Contacts", "submit", Seq(), "POST", """""", _prefix + """contacts""")
)
                      
    
}
                          

// @LINE:40
// @LINE:39
class ReverseWizard {
    

// @LINE:39
def step(step:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Wizard.step(step), HandlerDef(this, "controllers.Wizard", "step", Seq(classOf[Int]), "GET", """ Wizard""", _prefix + """wizard/$step<[^/]+>""")
)
                      

// @LINE:40
def submit(step:Int): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Wizard.submit(step), HandlerDef(this, "controllers.Wizard", "submit", Seq(classOf[Int]), "POST", """""", _prefix + """wizard/$step<[^/]+>""")
)
                      
    
}
                          
}
        
    