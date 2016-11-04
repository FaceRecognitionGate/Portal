<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
  
  <head>
    
    <meta charset="utf-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>Meus Dados - Catraca</title>

    <!-- Bootstrap CSS -->
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
		  rel="stylesheet"
		  integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
		  crossorigin="anonymous">
		  
	<!-- Bootstrap Theme -->
	<link href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/flatly/bootstrap.min.css"
		  rel="stylesheet"
		  integrity="sha384-+ENW/yibaokMnme+vBLnHMphUYxHs34h9lpdbSLuAwGkOKFRl4C34WkjazBtb7eT"
		  crossorigin="anonymous">

	<!-- Font Awesome -->
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
		  rel="stylesheet"
		  integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1"
		  crossorigin="anonymous">

	<!-- Custom CSS -->
	<link href="css/default.css" rel="stylesheet">
	<link href="css/override.css" rel="stylesheet">
	
	<!-- jQuery -->
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"
			integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
			crossorigin="anonymous">
    </script>
	
	<!-- Bootstrap JS -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
			integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
			crossorigin="anonymous">
	</script>
	
	<!-- Edit Info -->
	<script src="js/edit-info.js"></script>
  
  </head>
  
  <body style="overflow-y:hidden;">
    
    <div class="container-fluid">
    	
    	<div class="row">
    		
    		<div class="col-md-6 col-md-offset-3">
    			
    			<div class="panel panel-default">
    				
    				<div id="bg-text-override" class="panel-heading">
    					
    					<h1>Meus Dados</h1>
    				
    				</div>
    				
    				<div class="panel-body">
    					
    					<div class="row">
    						
    						<!-- [START] User Picture -->
    						<div class="col-md-4">
    							
    							<div class="row">
    								
    								<div class="col-md-12">
    									
    									<img src="images/user-picture.png" class="center-block" alt="Foto do Usuário" width="100%">
    								
    								</div>
    							
    							</div>
    							
    							<br>
    							
    							<div class="row">
    								
    								<div class="col-md-12 text-center">
    									
    									<a href="#" style="color:#bc0b0b">Alterar Foto</a>
    								
    								</div>
    							
    							</div>
    							
    						</div>
    						<!-- [END] User Picture -->
    						
    						<!-- [START] User Info -->
    						<div class="col-md-8">
    							
    							<table class="table table-condensed table-bordered table-striped" id="table-user-info">
							    	
							    	<tr>
							        	
							        	<th>Nome:</th>
							        	
							        	<td class="text-input">Gabriela Almeida</td>					        
							      	
							      	</tr>
							      	
							      	<tr>
							        	
							        	<th>Sexo:</th>
							        	
							        	<td class="select-input">Feminino</td>					        
							      	
							      	</tr>
							      	
							      	<tr>
							        	
							        	<th>E-mail:</th>
							        	
							        	<td class="text-input">gabriela.almeida@gmail.com</td>					        
							      	
							      	</tr>
							      	
							      	<tr>
							        	
							        	<th>RG:</th>
							        	
							        	<td class="text-input">12.345.678-9</td>					        
							      	
							      	</tr>
							      	
							      	<tr>
							        	
							        	<th>Sou um:</th>
							        	
							        	<td class="select-input">Aluno</td>					        
							      	
							      	</tr>
							      	
							      	<tr>
							        	
							        	<th>Matrícula:</th>
							        	
							        	<td class="text-input">15847921</td>					        
							      	
							      	</tr>
							      	
								</table>
								
								<button type="button" class="btn btn-default btn-block" style="width:100%">Editar Dados</button>
    						
    						</div>
    						<!-- [END] User Info -->
    					
    					</div>
    				
    				</div>
    			
    			</div>
    		
    		</div>
    	
    	</div>
    
    </div>
  
  </body>

</html>