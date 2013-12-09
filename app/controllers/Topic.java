package controllers;

import java.io.IOException;

import play.*;
import play.mvc.*;
import play.data.*;
import static play.data.Form.*;

import views.html.index;
import views.html.topic;

import models.*;

public class Topic extends Controller {
    
    /**
     * 
     */ 
	public final static TopicModel topicModel = new TopicModel();
  
    public static Result index() throws IOException {
        return ok(topic.render(topicModel.dataStringList));
    }
}