$(document).ready(function(){
	
	$("button").click(function(){
	    window.location.href="profile/edit";
	});
	
	function editUserInfo() {
		var allTextInputs = $(".text-input");
		var allSelectInputs = $(".select-input");
		
		allTextInputs.each(function() {
			$(this).html("<input type='text' class='form-control' placeholder='" + $(this).html() +  "'>");
		});
		
		allSelectInputs.each(function() {
			var html = "<select class='form-control' name='category'>" +
                        	"<option selected disabled hidden='hidden'>Sou um:</option>" +
                            "<option value=''0'>Aluno do Insper</option>" +
                            "<option value='1'>Professor do Insper</option>" +
                            "<option value='2'>Funcionário do Insper</option>" +
                        "</select>";
			$(this).html(html);
		});
		$("button").html("Salvar");
		$("button").off("click");
	}

});