package controllers;

import java.io.IOException;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.top3;

import models.*;

public class Top3 extends Controller {
    
    /**
     * 
     */ 
	public final static Top3Model top3Model = new Top3Model();
  
    public static Result index() throws IOException {
        return ok(top3.render(top3Model.dataStringList, top3Model.categoryStringList));
    }
}