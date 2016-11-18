<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en">
  
  <head>
    
    <meta charset="utf-8">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <title>Cadastro - CatracaInsper</title>

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
	<link href="css/signup.css" rel="stylesheet">
	
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

  	<!-- jQuery Form Mask Plug-in -->
  	<script src="js/jquery-mask.min.js"></script>
  
  </head>
  
  <body>
    
    <div class="container-fluid">
    	
    	<div class="row">
    		
    		<div class="col-md-8 col-md-offset-2">
    			
    			<div class="panel panel-default">
    				
    				<div id="bg-text-override" class="panel-heading">
    				
    					<h1>Cadastro</h1>
    				
    				</div>
    				
    				<div class="panel-body">
    				
    					<div class="row">
    					
    						<div class="col-md-12">
    						
    							<div class="alert alert-warning" id="webcam-alert">
    										
    								Enquanto você estiver realizando o cadastro estaremos fotografando seu rosto para
    								podermos adicioná-lo ao sistema de reconhecimento facial! Por favor permita o acesso 
    								à sua câmera na parte de cima do navegador. Se você fechou o aviso no canto superior
    								esquerdo, recarregue a página!
    										
    							</div>
    							
    							<div class="alert alert-warning" id="webcam-alert2">
    										
    								Quando estiver pronto(a), clique em salvar imagem para poder prosseguir com o cadastro!
    										
    							</div>
    						
    						</div>
    					
    					</div>
    					
    					<div class="row">
    					
    						<div class="col-md-4">
    							
    							<div class="row">
    							
    								<div class="col-md-12">
    								
    								
    									
  									
  											<video autoplay="autoplay" id="video" style="width:100%"></video>
  											
										
										
										<button id="snap" class="btn btn-default btn-danger" style="width:100%;margin-top:5%">Salvar Imagens</button>
										
										<canvas id="canvas" width="640" height="480" style="width:100%;display:none"></canvas>
										
									</div>
    							
    							</div>
    							    							
    						</div>
    					
    						<div class="col-md-8">
								
								<form method="post" action="signupValidate" id="signup-form" autocomplete="off">
										
									<!-- [START] First section: FirstName, LastName, Email, Password, ConfirmPassword -->
									<div class="col-md-6">
									
										<div class="form-group">
										
											<div class="input-group">
												
												<input aria-describedby="first-name-addon" class="form-control validation" name="nome" placeholder="Nome" required type="text">
												<span class="input-group-addon" id="first-name-addon"><i class="fa fa-circle-o"></i></span>
												
											</div>
                                	
                                		</div>
                                
                                		<div class="form-group">
                                		
                                			<div class="input-group">
                                             
                                				<input aria-describedby="last-name-addon" class="form-control validation" name="sobrenome" placeholder="Sobrenome" required type="text">
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
                                	
                                				<input aria-describedby="password-addon" class="form-control" name="senha" placeholder="Senha" required type="password">
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
                                		
                                			<select class="form-control" name="sexo" required>
                                        	
                                        		<option selected disabled hidden="hidden" value="">Sexo</option>
                                            
                                            	<option value="F">Feminino</option>
                                            
                                            	<option value="M">Masculino</option>
                                        
                                       		</select>
                                	
                                		</div>
									
										<div class="form-group">
										
											<div class="input-group">
                                    	
                                    			<input aria-describedby="rg-addon" class="form-control" maxlength="12" name="rg" placeholder="RG" required type="text">
                                				<span class="input-group-addon" id="rg-addon"><i class="fa fa-circle-o"></i></span>
                                                
                                    		</div>
                                    	
                                    	</div>                                            
                                    
                                    	<div class="form-group">
                                    	
                                    		<select class="form-control" name="profissao" required>
                                        
                                        		<option selected disabled hidden="hidden" value="">Sou um:</option>
                                            
                                            	<option value="Estudante">Aluno do Insper</option>
                                            
                                            	<option value="Professor">Professor do Insper</option>
                                            
                                            	<option value="Funcionario">Funcionário do Insper</option>
                                        
                                        	</select>
                                              
                                    	</div>
                                            
                                    	<div class="form-group">
                                    	
                                    		<div class="input-group">
                                    	
                                    			<input aria-describedby="id-addon" class="form-control" name="numeroMatricula" placeholder="Nº de Matrícula" required type="text">
                                				<span class="input-group-addon" id="id-addon"><i class="fa fa-circle-o"></i></span>
                                                
                                    		</div>
                                    	
                                    	</div>
                                    
                                    	<div class="form-group">
                                    	
                                    		<button type="submit" id="" class="btn btn-default btn-danger" style="width:100%" disabled="disabled">Próximo</button>
                                    	
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
    
    <!-- User Webcam Access -->
  	<script src="js/webcam-access.js"></script>
  	
  	<!-- Form Masking/Validation -->
  	<script src="js/signup-form-validation.js"></script>
  
  </body>

</html>

    