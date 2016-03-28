<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/styles.css">
<link rel="stylesheet" type="text/css" href="css/bg.css">
<script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
<script src="javascript/script.js"></script>
<script src="javascript/bg.js"></script>
<script src="javascript/sensors.js"></script>

</head>
<body>
<div id='header'>
  <div id='cssmenu'>
<ul>
   <li><a href='#'><span>Home</span></a></li>
   <li class='active has-sub'><a href='#'><span>Sensors</span></a>
      <ul>
         <li class='has-sub'><a href='AddSensor.jsp'><span>Add Sensors</span></a>
            
         </li>
         <li class='has-sub'><a href='DeleteSensor.jsp'><span>Delete Sensors</span></a>
            
         </li>
        
      </ul>
   </li>
   <li class='active has-sub'><a href='#'><span>Groups</span></a>
      <ul>
         <li class='has-sub'><a href='AddGroup.jsp'><span>Add Groups</span></a>
            
         </li>
         <li class='has-sub'><a href='DeleteGroup.jsp'><span>Delete Groups</span></a>
            
         </li>
         
      </ul>
   </li>
   <li class='active has-sub'><a href='#'><span>Users</span></a>
      <ul>
         <li class='has-sub'><a href='AddUser.jsp'><span>Add User</span></a>
            
         </li>
         <li class='has-sub'><a href='DeleteUser.jsp'><span>Delete User</span></a>
            
         </li>
         
      </ul>
   </li>
  
</ul>
</div></div>
<div id="container">
<form method="post">
<input type="button" id="temperature" value="Temperature">
<span id="temp"></span><br><br>
<input type="button" id="humidity" value="Humidity">
<span id="hum"></span><br><br>
<input type="button" id="rled" value="Toggle Red Light">
<span id="redled"></span><br><br>
<input type="button" id="gled" value="Toggle Green Light">
<span id="greenled"></span><br><br>
</form>
</div>
<div id="footer">

</div>
  
</body>
</html>