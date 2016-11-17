function readURL(input) {
        	if (input.files && input.files[0]) {
            	
        		var reader = new FileReader();
        		
        		
                
                reader.onload = function (e) {
              		$('#profileimg').attr('src', e.target.result);
              		var cw = $('#profileimg').width();
            		$('#profileimg').css({'height':cw+'px'});
            		$('button').removeAttr('style');
            		$('button').css({'width':'100%'});
                }
                
                reader.readAsDataURL(input.files[0]);
            }
        }
    
        $("#imgInp").change(function(){
            readURL(this);
        });