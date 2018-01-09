package controllers;


import java.io.File;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
    	if(request().remoteAddress() != null){
        	System.out.println("index page accessed from " + request().remoteAddress());
    	}
        return ok(index.render());
    }
    
    
    public Result pressRelease() {
    	
    	return ok(pressrelease.render());
    }
    
    
	public Result downloadFile() {
		String filepath = "/tmp/QBUPressRelease.pdf";
		
		File file = new java.io.File(filepath);
		if(file.exists()){
			System.out.println("file found");
			return ok(new java.io.File(filepath));
		} else {
			System.out.println("file not found");
			return ok(new java.io.File("data/QBUPressRelease.pdf"));
		}
		
		//return ok(new java.io.File(filepath));
	}

}
