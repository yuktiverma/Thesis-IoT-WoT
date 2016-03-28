package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddGroupClass;
import model.AddUserGroupMapping;
import model.ReturnGroupId;
import model.ReturnUserId;
import model.SetPermissionSensorClass;
import beans.Group;
import beans.GroupSensor;
import beans.UserGroup;

/**
 * Servlet implementation class AddGroupController
 */
@WebServlet("/AddGroupController")
public class AddGroupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddGroupController() {
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
		String groupName=request.getParameter("groupname");
		String userNames[]=request.getParameterValues("checkbox");
		String sensors[]=request.getParameterValues("checkbox1");
		String permission[]=request.getParameterValues("permission");
		
		
		
		Group group = new Group();
		UserGroup userGroup=new UserGroup();
		GroupSensor groupSensor=new GroupSensor();
		SetPermissionSensorClass spsc=new SetPermissionSensorClass();
		
		//add group to group table
		AddGroupClass addGroupClass=new AddGroupClass();
		group.setGroupName(groupName);
	boolean status1=addGroupClass.addGroup(group);
		
		
		//get the group id using the group name 
		int groupId=0;
		ReturnGroupId returnGroupId=new ReturnGroupId();
		groupId=returnGroupId.returnId(groupName);
		
		//add group id and usernames to group user table
		userGroup.setUserName(userNames);
		userGroup.setGroupId(groupId);
		AddUserGroupMapping addUserGroupMapping=new AddUserGroupMapping();
		int status2=addUserGroupMapping.addUserGroup(userGroup);
		
		//add group if,permission and sensors to GroupSensor class
		groupSensor.setGroupId(groupId);
		groupSensor.setPermission(permission);
		groupSensor.setSensorName(sensors);
		boolean status3=spsc.setPermission(groupSensor);
		
		if(status1==false&&status2==1)
		{
			response.sendRedirect("view/Success.jsp");
		}
		else
		{
			response.sendRedirect("view/Fail.jsp");
		}
		
		
		/*
		
		
		ReturnUserId returnUserId=new ReturnUserId();
		
		int userId[]=new int[userNames.length];
		
		
		for(int i=0; i<userNames.length;i++)
		{
			userId[i]= returnUserId.returnId(userNames[i]);
			//System.out.println("userid"+userId[i]);
		}
		
		System.out.println(groupName+"grrrr");
	
		userGroup.setUserId(userId);
		
		
		
		userGroup.setGroupId(groupId);
		
		int status=addUserGroupMapping.addUserGroup(userGroup);
		
		if(status==1&&status1==1)
		{
			response.sendRedirect("view/Success.jsp");
		}
		else
		{
			response.sendRedirect("view/Fail.jsp");
		}*/
		
		//System.out.println(userNames+"jkhkj");
	}

}
