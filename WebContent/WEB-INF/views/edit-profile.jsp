<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
  
  <head>
    
    <meta charset="utf-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>Cadastro - Catraca</title>

    <!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- Theme -->
	<link href="https://maxcdn.bootstrapcdn.com/bootswatch/3.3.7/flatly/bootstrap.min.css" rel="stylesheet" integrity="sha384-+ENW/yibaokMnme+vBLnHMphUYxHs34h9lpdbSLuAwGkOKFRl4C34WkjazBtb7eT" crossorigin="anonymous">

	<!-- Custom CSS -->
	<link href="css/default.css" rel="stylesheet">
	<link href="css/override.css" rel="stylesheet">
	<link href="css/signup.css" rel="stylesheet">
	
	<!-- Font Awesome -->
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-T8Gy5hrqNKT+hzMclPo118YTQO6cYprQmhrYwIiQ/3axmI1hQomh7Ud2hPOy8SP1" crossorigin="anonymous">
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"
			integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8="
			crossorigin="anonymous"></script>
	
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

  	<!-- jQuery Form Mask Plug-in -->
  	<script src="js/jquery-mask.min.js"></script>
  	
  	<!--  <script type="text/javascript">
    	function readURL(input) {
        	if (input.files && input.files[0]) {
            	
        		var reader = new FileReader();
                
                reader.onload = function (e) {
              		$('#user-profile-img').attr('src', e.target.result);
                }
                
                reader.readAsDataURL(input.files[0]);
            }
        }
    
        $("#imgInp").change(function(){
            readURL(this);
        });
    </script>-->
  
  </head>
  
  <body>
    
    <div class="container-fluid">
    	
    	<div class="row">
    		
    		<div class="col-md-8 col-md-offset-2">
    			
    			<div class="panel panel-default">
    				
    				<div id="bg-text-override" class="panel-heading">
    				
    					<h1>Editar Perfil</h1>
    				
    				</div>
    				
    				<div class="panel-body">
    				
<!--     					<div class="row">
    					
    						<div class="col-md-12">
    						
    							<div class="alert alert-warning" id="webcam-alert">
    										
    								Enquanto você estiver realizando o cadastro estaremos filmando para salvar seu rosto em
    								nosso banco de dados! Por favor permita o acesso à sua câmera na parte de cima do navegador.
    								Se você fechou o aviso que apareceu no canto superior esquerdo, recarregue a página! 
    										
    							</div>
    						
    						</div>
    					
    					</div> -->
    					
<!--     					<div class="row">
    					
    						<div class="col-md-4">
    							
    							<div class="row">
    							
    								<div class="col-md-12">
    								
    									<div class="embed-responsive embed-responsive-16by9">
  									
  											<video autoplay="autoplay" id="user-webcam"></video>
								
										</div>
										
									</div>
    							
    							</div>
    							    							
    						</div> -->
    					
    						<div class="col-md-16">
								
								<form method="post" action="profile" id="signup-form" autocomplete="off">
										
									<!-- [START] First section: FirstName, LastName, Email, Password, ConfirmPassword -->
									<div class="col-md-6">
									
										<div class="form-group">
										
											<div class="input-group">
												
												<input aria-describedby="first-name-addon" class="form-control validation" name="first-name" placeholder="Nome" required type="text">
												<span class="input-group-addon" id="first-name-addon"><i class="fa fa-circle-o"></i></span>
												
											</div>
                                	
                                		</div>
                                
                                		<div class="form-group">
                                		
                                			<div class="input-group">
                                             
                                				<input aria-describedby="last-name-addon" class="form-control validation" name="last-name" placeholder="Sobrenome" required type="text">
                                				<span class="input-group-addon" id="last-name-addon"><i class="fa fa-circle-o"></i></span>
                                	
                                			</div>
                                		
                                		</div>
                                
                                		<div class="form-group">
                                		
                                			<div class="input-group">
                                                    
                                				<input aria-describedby="email-addon" class="form-control validation" name="email" placeholder="Email" required type="email">
                                				<span class="input-group-addon" id="email-addon"><i class="fa fa-circle-o"></i></span>
                                
                                			</div>
                                			
                                		</div>
                                
                                		<div class="form-group">
                                		
                                			<div class="input-group">
                                	
                                				<input aria-describedby="password-addon" class="form-control" name="password" placeholder="Senha" required type="password">
                                				<span class="input-group-addon" id="password-addon"><i class="fa fa-circle-o"></i></span>
                                	
                                			</div>
                                		
                                		</div>
                                
                                		<div class="form-group">
                                		
                                			<div class="input-group">
                                                
                         						<input aria-describedby="confirm-password-addon" class="form-control" name="confirm-password" placeholder="Confirmar Senha" required type="password">
                                				<span class="input-group-addon" id="confirm-password-addon"><i class="fa fa-circle-o"></i></span>
                                	
                                			</div>
                                		
                                		</div>
                                	
                                	</div>
                                	<!-- [END] First section: FirstName, LastName, Email, Password, ConfirmPassword -->
                                	
                                	<!-- [START] Second section: Gender, RG, Category, College ID, Next -->
                                	<div class="col-md-6">  
                                           	
										<div class="form-group">
                                		
                                			<select class="form-control" name="gender" required>
                                        	
                                        		<option selected disabled hidden="hidden" value="">Sexo</option>
                                            
                                            	<option value="0">Feminino</option>
                                            
                                            	<option value="1">Masculino</option>
                                        
                                       		</select>
                                	
                                		</div>
									
										<div class="form-group">
										
											<div class="input-group">
                                    	
                                    			<input aria-describedby="rg-addon" class="form-control" maxlength="12" name="rg" placeholder="RG" required type="text">
                                				<span class="input-group-addon" id="rg-addon"><i class="fa fa-circle-o"></i></span>
                                                
                                    		</div>
                                    	
                                    	</div>                                            
                                    
                                    	<div class="form-group">
                                    	
                                    		<select class="form-control" name="category" required>
                                        
                                        		<option selected disabled hidden="hidden" value="">Sou um:</option>
                                            
                                            	<option value="0">Aluno do Insper</option>
                                            
                                            	<option value="1">Professor do Insper</option>
                                            
                                            	<option value="2">Funcionário do Insper</option>
                                        
                                        	</select>
                                              
                                    	</div>
                                            
                                    	<div class="form-group">
                                    	
                                    		<div class="input-group">
                                    	
                                    			<input aria-describedby="id-addon" class="form-control" name="id" placeholder="Nº de Matrícula" required type="text">
                                				<span class="input-group-addon" id="id-addon"><i class="fa fa-circle-o"></i></span>
                                                
                                    		</div>
                                    	
                                    	</div>
                                    
                                    	<div class="form-group">
                                    	
                                    		<button type="submit" id="" class="btn btn-success" style="width:100%" disabled="disabled">Salvar</button>
                                    	
                                    	</div>
                                    
                                    </div>
                                    <!-- [END] Second section: Gender, RG, Category, College ID, Next -->
                                    
                            	</form>
                            	
                            </div>
                        
                        </div>                               
                    
                    </div>
    			
    			</div>
    				
    		</div>
    			
    	</div>
    		
    </div>
    
<!--     User Webcam Access
  	<script src="js/webcam-access.js"></script> -->
  	
  	<!-- Form Masking/Validation -->
  	<script src="js/signup-form-validation.js"></script>
  
  </body>

</html>

    