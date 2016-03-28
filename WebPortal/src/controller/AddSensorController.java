package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.ha.backend.Sender;

import model.AddSensorClass;
import model.AddUserClass;
import beans.Sensor;
import beans.User;

/**
 * Servlet implementation class AddSensorController
 */
@WebServlet("/AddSensorController")
public class AddSensorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSensorController() {
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
String sensorName=request.getParameter("sensorName");
		
		String sensorFields=request.getParameter("sensorFields");
		Sensor sensor =new Sensor();
		sensor.setSensorName(sensorName);
		sensor.setSensorFields(sensorFields);
		
		AddSensorClass ob=new AddSensorClass();
		boolean status=ob.addSensor(sensor);
		if(status==false)
		{
			response.sendRedirect("view/Success.jsp");
		}
		else
		{
			response.sendRedirect("view/Fail.jsp");
		}
	}
	}


