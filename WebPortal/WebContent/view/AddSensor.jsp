<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div id="container">
<center> <h2>Add Sensor</h2> 
<form action="../AddSensorController" method="post"> <br/>
Sensor name:<input type="text" name="sensorName"> <br/>

SensorFields (eg:sensor_id int,sensorName varchar(30) ):<input type="text" name="sensorFields"> <br/>
<input type="submit" value="Add Sensor"> </form> 
</center>

</div>
</body>
</html>