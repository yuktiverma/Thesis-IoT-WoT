                $(document).ready(function(){
         
            $("#temperature").click(function(){
            	 $("temp").text("Hello world!");
                });
            });
          
            $("#humidity").click(function(){
                $.ajax({type:'POST' , url: "AccessSensorsController", data: {action : 'demo2'}, success: function(result1){
                    $("#hum").html(result1);
                }});
            });
            $("#rled").click(function(){
                $.ajax({type:'POST' , url: "AccessSensorsController", data: {action : 'demo4'}, success: function(result2){
                    $("#redled").html(result2);
                }});
            });
            $("#gled").click(function(){
                $.ajax({type:'POST' , url: "AccessSensorsController", data: {action : 'demo3'}, success: function(result3){
                    $("#greenled").html(result3);
                }});
            });
        
   