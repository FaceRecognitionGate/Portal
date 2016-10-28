<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
  
  <head>
    
    <meta charset="utf-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>Histórico de Acesso - Catraca</title>

    <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- Theme -->
	<link href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-+ENW/yibaokMnme+vBLnHMphUYxHs34h9lpdbSLuAwGkOKFRl4C34WkjazBtb7eT" crossorigin="anonymous">

	<!-- Custom CSS -->
	<link href="css/default.css" rel="stylesheet">
	<link href="css/history.css" rel="stylesheet">
	<link href="css/override.css" rel="stylesheet">
	
	<!-- Font Awesome -->
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
  
  </head>
  
  <body style="overflow-y:hidden;">
    
    <div class="container-fluid">
    	
    	<!-- [START] Pagination -->
    	<div class="row">
    		
    		<div class="col-md-8 col-md-offset-2" >
            	
            	<nav aria-label="Navegação">
  					
  					<ul class="pagination">
    					
    					<li class="disabled"><a href="#" aria-label="Próximo"><span aria-hidden="true">&laquo;</span></a></li>
    					
    					<li class="active"><a href="#">1</a></li>
    					
    					<li><a href="#">2</a></li>
    					
    					<li><a href="#">3</a></li>
    					
    					<li><a href="#">4</a></li>
    					
    					<li><a href="#">5</a></li>
    					
    					<li><a href="#" aria-label="Anterior"><span aria-hidden="true">&raquo;</span></a></li>
  					
  					</ul>
				
				</nav>
    		
    		</div>
    	
    	</div>
    	<!-- [END] Pagination -->

		<!-- [START] Access History -->
		<div class="row">
    		
    		<div class="col-md-8 col-md-offset-2">
    			
    			<div class="panel panel-default">
    				
    				<div id="bg-text-override" class="panel-heading">
    					
    					<h1>Histórico de Acesso</h1>
    				
    				</div>
    				
    				<table class="table table-striped table-hover">
  						
  						<thead>
    						
    						<tr>
      							
      							<th>#</th>
      							
      							<th>Nome</th>
      							
      							<th>R.G.</th>
      							
      							<th>Categoria</th>
      							
      							<th>Data/Hora</th>
    						
    						</tr>
  						
  						</thead>
  						
  						<tbody>
    						
    						<tr>
      							
      							<td>4</td>
      							
      							<td>Rafael Molines</td>
      							
      							<td>45.987.334-0</td>
      							
      							<td>Aluno</td>
      							
      							<td>14/10/16 08:53</td>
    						
    						</tr>
    						
    						<tr>
      							
      							<td>3</td>
      							
      							<td>Gustavo Efeiche</td>
      							
      							<td>33.879.560-2</td>
      							
      							<td>Aluno</td>
      							
      							<td>14/10/16 07:18</td>
    						
    						</tr>
    						
    						<tr>
      							
      							<td>2</td>
      							
      							<td>Gabriela Almeida</td>
      							
      							<td>52.352.135-3</td>
      							
      							<td>Aluno</td>
      							
      							<td>14/10/16 07:12</td>
    						
    						</tr>
    						
    						<tr>
      							
      							<td>1</td>
      							
      							<td>Luciano Soares</td>
      							
      							<td>41.421.441-8</td>
      							
      							<td>Professor</td>
      							
      							<td>14/10/16 06:49</td>
    						
    						</tr>
  						
  						</tbody>
					
					</table> 
				
				</div>
    		
    		</div>
    	
    	</div>
		<!-- [END] Access History -->
		
		<div class="row">
		
			<div class="col-md-2 col-md-offset-8">
			
				<a class="btn btn-default" href="gate-access" role="button" style="width:100%">Voltar</a>
			
			</div>
		
		</div>	
	
	</div>
    
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  
  </body>

</html>