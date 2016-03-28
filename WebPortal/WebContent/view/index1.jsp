<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script>
        $(document).ready(function(){
            $("#b2").click(function(){
                $("#1").text("22.5 Celsius");
            });
        });
        $(document).ready(function(){
            $("#b1").click(function(){
                $("#2").text("red light toggled");
            });
        });
           
           
         
        </script>
</head>
<body>
<button id="b2">Temperature</button>
<p id="1"></p>
  <button id="b1">Toggle Red Light</button>
<p id="2"></p>
</body>
</html>