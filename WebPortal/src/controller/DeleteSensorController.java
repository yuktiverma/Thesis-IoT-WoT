package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DeleteSensorClass;
import model.DeleteUserClass;
import beans.Sensor;
import beans.User;

/**
 * Servlet implementation class DeleteSensorController
 */
@WebServlet("/DeleteSensorController")
public class DeleteSensorController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteSensorController() {
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
		Sensor sensor =new Sensor();
		sensor.setSensorName(sensorName);
		DeleteSensorClass ob=new DeleteSensorClass();
		boolean status=ob.deleteSensor(sensor);
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


