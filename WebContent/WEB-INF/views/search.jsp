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
	
	<!-- Font Awesome -->
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    
    <!-- jQuery Form Mask Plug-in -->
  	<script src="js/jquery-mask.min.js"></script>
  </head>
  
  <body style="overflow-y:hidden;">
    
    <div class="container-fluid">
    	
    	<div class="row">
    		
    		<div class="col-md-4 spacer"></div>
    		
    		<div class="col-md-4">
    			
    			<div class="panel panel-default">
    				
    				<div id="bg-text-override" class="panel-heading">
    					
    					<h1>Pesquisar Usuario</h1>
    				
    				</div>
    				
    				<div class="panel-body">
    					
    					<div class="row">
    						
    						<div class="col-md-12">
    							
    							<div class="container-fluid">
    								
    								<form method="post" action="profile">
  										
  										<div class="form-group">
    										
                                    			<input aria-describedby="rg-addon" class="form-control" maxlength="12" name="rg" placeholder="RG" required type="text">
  										
  										</div>
  									
  										
  										<button type="submit" class="btn btn-default" style="width:100%">Pesquisar</button>
									
									</form>
    							
    							</div>
    						
    						</div>
    					
    					</div>
    					
    					<br>
    					
    				
    				</div>
    		<div class="row">
		
				<div class="col-md-4 col-md-offset-8">
				
					<a class="btn btn-default" href="gate" role="button" style="width:100%">Voltar</a>
				
				</div>
		
			</div>	
    			
    			</div>

    		
    		</div>

    		
    		<div class="col-md-4 spacer"></div>
    	
    	</div>
    
    </div>
    
    
    
    <!-- Form Masking/Validation -->
  	<script src="js/signup-form-validation.js"></script>
  
  </body>

</html>