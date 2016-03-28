<%@page import="model.*" import="java.util.*" import="beans.*" import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center> <h2>Create a Group</h2> 
<form action="../AddGroupController" method="post"> <br/>
Group name:<input type="text" name="groupname"> <br/>

<%
FetchUsersFromDB userObject=new FetchUsersFromDB();
List users=userObject.fetchUsers();
System.out.print(users);
request.setAttribute("users", users);
Properties prop = new Properties();
InputStream input = null;

try {

	input = new FileInputStream("/Users/ankurjuneja/Documents/workspace/WebPortal/Sensor.propeties");

	// load a properties file
	prop.load(input);
	System.out.print(prop.stringPropertyNames()+"all keys");
	request.setAttribute("propertyNamesList", prop.stringPropertyNames());

} catch (IOException ex) {
	ex.printStackTrace();
} 
%>
Add users and Sensors:
<table>
<tr>
<td>
<table>
<th>Choose Users</th>
<c:forEach items="${users}" var="element"> 
<tr>

<td><input type=checkbox  name="checkbox" value="${element.username}"/><c:out value="${element.username}" /></td>

</tr>
</c:forEach>

</table>
</td>
<td>
<table>
<th>Choose Sensors</th>
<c:forEach items="${propertyNamesList}" var="element"> 
<tr>

<td><input type=checkbox  name="checkbox1" value="${element}"/><c:out value="${element}" /></td>
<td>
<select name="permission">
  <option value="r" >Read only</option>
  <option value="rw">Read and Write</option>
 
</select>
</td>

</tr>
</c:forEach>

</table>
</td>
</tr>
</table>
<input type="submit" value="Add Group"> </form> 
</center>

</body>
</html>