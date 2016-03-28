package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;

/**
 * Servlet implementation class AccessSensorsController
 */
@WebServlet("/AccessSensorsController")
public class AccessSensorsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccessSensorsController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hi servlet");
		String action=request.getParameter("action");
		System.out.println("hi servlet");
		if(action.equals("demo1"))
		{
		//CoapClient client = new CoapClient("coap://[aaaa::212:4b00:799:6300]:5683/sen/bar/temp");
		    //CoapResponse result = client.get();
		    response.getWriter().write("22.5");       // Write response body.
		}
		else if (action.equals("demo2")) {
			CoapClient client = new CoapClient("coap://[aaaa::212:4b00:799:6300]:5683/sen/hdc/h");
		    CoapResponse result = client.get();
		    response.getWriter().write(result.getResponseText());       // Write response body.
		}
		
		else if (action.equals("demo3")) {
			CoapClient client = new CoapClient("coap://[aaaa::212:4b00:799:6300]:5683/lt/g");
		    CoapResponse result = client.post("payload",8);
		
		    response.getWriter().write(result.getResponseText());       // Write response body.
		}
		
		else if (action.equals("demo4")) {
			CoapClient client = new CoapClient("coap://[aaaa::212:4b00:799:6300]:5683/lt/r");
			CoapResponse result = client.post("payload",8);
		    response.getWriter().write(result.getResponseText());       // Write response body.
		}
		
	}
	}


