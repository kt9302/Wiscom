package controllers;

import java.io.IOException;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.index;
import views.html.lasso;

import models.*;

public class Lasso extends Controller {

	public final static LassoModel lassoModel = new LassoModel();
  
    public static Result index() throws IOException {
        return ok(lasso.render(lassoModel.lassoString));
    }
}