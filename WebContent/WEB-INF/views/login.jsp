<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
  
  <head>
    
    <meta charset="utf-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>Login - Catraca</title>

    <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- Theme -->
	<link href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-+ENW/yibaokMnme+vBLnHMphUYxHs34h9lpdbSLuAwGkOKFRl4C34WkjazBtb7eT" crossorigin="anonymous">

	<!-- Custom CSS -->
	<link href="css/default.css" rel="stylesheet">
	<link href="css/override.css" rel="stylesheet">
	
	<!-- jQuery -->
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"
			integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
			crossorigin="anonymous">
    </script>
	
	<!-- Font Awesome -->
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  
  </head>
  
  <body style="overflow-y:hidden;">
    
    <div class="container-fluid">
    	
    	<div class="row">
    		
    		<div class="col-md-4 spacer"></div>
    		
    		<div class="col-md-4">
    			
    			<div class="panel panel-default">
    				
    				<div id="bg-text-override" class="panel-heading">
    					
    					<h1>Bem-vindo!</h1>
    				
    				</div>
    				
    				<div class="panel-body">
    					
    					<div class="row">
    						
    						<div class="col-md-12">
    							
    							<div class="container-fluid">
    								
    								<form method="post" action="validateLogin">
  										
  										<div class="form-group">
  										
  											<div class="input-group">
    										
    											<input aria-describedby="email-addon" type="email" class="form-control" name="email" placeholder="Email">
  												<span class="input-group-addon" id="email-addon"><i class="fa fa-circle-o"></i></span>
  										
  											</div>
  										
  										</div>
  										
  										<div class="form-group">
    										
    										<input type="password" class="form-control" name="password" placeholder="Senha">
  										
  										</div>
  										
  										<button type="submit" class="btn btn-default btn-block">Login</button>
									
									</form>
    							
    							</div>
    						
    						</div>
    					
    					</div>
    					
    					<br>
    					
    					<div class="row">
    						
    						<div class="col-md-1 spacer"></div>
    						
    						<div class="col-md-10" style="text-align:center">
    							
    							<a href="signup" style="color:#bc0b0b">Ainda não me cadastrei!</a>
    						
    						</div>
    						
    						<div class="col-md-1 spacer"></div>
    					
    					</div>
    				
    				</div>
    			
    			</div>
    		
    		</div>
    		
    		<div class="col-md-4 spacer"></div>
    	
    	</div>
    
    </div>
    
    <!-- Form Masking/Validation -->
  	<script src="js/login-form-validation.js"></script>
  	
  	<script type="text/javascript">
  		$(document).ready(function() {
  			$("button").click(function() {
  				$.ajax({
  					method: 'POST',
  					url: '/validateLogin',
  					data: $("form").serialize(),
  					success: function(response) {
  						alert('Password:' + $("input[name='password']").val());
  					},
  					error: function(response) {
  						console.log('Error');
  					}
  				});
  			});
  		});
  	</script>
  
  </body>

</html>