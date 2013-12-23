package controllers;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.node.*;


import play.*;
import play.libs.Json;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;


import views.html.figure6;
import views.html.search;

import models.*;

public class Figure6 extends Controller {
    
    /**
     * 
     */
    public final static Form<App> appForm = Form.form(App.class);
	public final static AppModel appModel = new AppModel();
  
    public static Result index() throws IOException {
    	return app(130210);
    }
    
    /**
     * 
     * @throws IOException 
     */ 
    public static Result app(int id) throws IOException {
    	Figure6Model figure6Model = new Figure6Model(id);
    	return ok(figure6.render(figure6Model.dataString, figure6Model.pieString, figure6Model.appName,figure6Model.appid));
    }
  
    public static Result submit() throws IOException {
    	System.out.println(request().body());
    	Form<App> form = appForm.bindFromRequest();
    	App app = form.get();
    	System.out.println("id is:"+app.id+" app is:"+app.appName);
    	Figure6Model figure6Model;
    	if (app.id.equals("")) {
    		figure6Model = new Figure6Model(app.appName);
    	} else {
    		figure6Model = new Figure6Model(Integer.parseInt(app.id), app.appName);
    	}
    	if (figure6Model.dataString.indexOf("not") >= 0) {
    		System.out.println(figure6Model.dataString);
    		appForm.reject("appName", figure6Model.dataString);
    		return badRequest(search.render(appForm));
    	} else {
        	return ok(figure6.render(figure6Model.dataString, figure6Model.pieString, figure6Model.appName, figure6Model.appid));
    	}
    }
    
    
}