package controllers;

import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.node.*;


import play.*;
import play.libs.Json;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.search;

import models.*;

public class Search extends Controller {

	public final static SearchModel searchModel = new SearchModel();
    final static Form<App> appForm = form(App.class);

	public static Result index() throws IOException {
		return ok(search.render(appForm));
	}

	public static Result ajax(String term) {
		System.out.println("Received term: "+term);
		ArrayList<String> result = searchModel.search(term);
		System.out.println(result);

		ObjectNode jsonResult = Json.newObject();
		if(result == null) {
			jsonResult.put("status", "KO");
			jsonResult.put("message", "Missing parameter [term]");
			return badRequest(jsonResult);
		} else {
//			jsonResult.put("status", "OK");
//			jsonResult.put("message", "Hello " + name);
//			jsonResult.put("label", Json.toJson(result));
//			return ok(jsonResult);
			ArrayNode arrayNode = jsonResult.putArray("data");
			for (String s : result) {
				ObjectNode sNode = Json.newObject();
				sNode.put("label", s);
				sNode.put("value", s.split(":")[1]);
				arrayNode.add(sNode);
			}
			return ok(jsonResult.get("data"));
		}
		
//		System.out.println(result.toString());
//		jsonResult.arrayNode();
//		return ok(result.toString());
	}
}