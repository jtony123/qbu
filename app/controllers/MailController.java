package controllers;


////import org.apache.commons.mail.DefaultAuthenticator;
//import org.apache.commons.mail.EmailException;
////import org.apache.commons.mail.HtmlEmail;
//
//import java.util.Date;
//import java.util.Properties;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.MessagingException;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//
//
//
//import play.mvc.Controller;
import play.mvc.Result;

import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import play.mvc.Controller;

import javax.inject.Inject;
import java.io.File;
import org.apache.commons.mail.EmailAttachment;

public class MailController extends Controller {


	//public class MyComponent {
	  @Inject MailerClient mailerClient;

	  public Result sendEmail() {
	    String cid = "1234";
	    Email email = new Email()
	      .setSubject("An email sent from the website")
	      .setFrom("WEBSITE<mywebsite@qbu.ie>")
	      .addTo("<Nicole@qbu.ie>")
	      // adds attachment
	      //.addAttachment("attachment.pdf", new File("/some/path/attachment.pdf"))
	      // adds inline attachment from byte array
	      //.addAttachment("data.txt", "data".getBytes(), "text/plain", "Simple data", EmailAttachment.INLINE)
	      // adds cid attachment
	      //.addAttachment("image.jpg", new File("/some/path/image.jpg"), cid)
	      // sends text, HTML or both...
	      .setBodyText("A text message")
	      .setBodyHtml("<html><body><p>An <b>html</b> message with cid <img src=\"cid:" + cid + "\"></p></body></html>");
	    //mailerClient.send(email);
	    return ok("Success");
	  }
	
	
	
//  public Result sendEmail() throws EmailException {
//	HtmlEmail email = new HtmlEmail();
//    String authuser = "jtony123@gmail.com";
//    String authpwd = "ctdictdi";
//    email.setSmtpPort(465);
//    email.setAuthenticator(new DefaultAuthenticator(authuser, authpwd));
//    email.setDebug(true);
//    email.setHostName("smtp.gmail.com");
//    email.setFrom("jtony123@gmail.com", "Dorothy Jackson");
//    email.setSubject("TestMail");
//    email.setHtmlMsg("<html><body><h1>Wanna ... later...</h1></body></html>");
//    email.addTo("anthony.jackson@orreco.com", "Anthony");
//    email.setSSL(true);
//    email.setTLS(true);
//    email.send();
//    return ok("Success");
//  }
  
}