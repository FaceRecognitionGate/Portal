$(document).ready(function(){	  
	
	/* Mask for [rg] -> auto-complete with dots and dashes
	 * P.S.: masking plug-in already validates masked fields
	 */
	$('input[name="rg"]').mask('00.000.000-0', {reverse: true});
  
	
	/* Form validation
	 * 	Functions: 
	 *		isValid: checks [first-name], [last-name], [email], [gender], [category], [id] for correct values depending on the rule
	 * 		passwordMatches: compare [password] and [confirm-password]
	 */
	function isValid(input) {
		
		var result = false;
		var validFields = [];
		var name = input.attr('name');
		var value = input.val();
		
		if(name == 'first-name' || name == 'last-name') {
			result = /^[a-zA-ZàèìòùÀÈÌÒÙáéíóúýÁÉÍÓÚÝâêîôûÂÊÎÔÛãñõÃÑÕçÇ]+$/.test(value);
		} else if(name == 'email') {
			result = /^[-a-z0-9~!$%^&*_=+}{\'?]+(\.[-a-z0-9~!$%^&*_=+}{\'?]+)*@([a-z0-9_][-a-z0-9_]*(\.[-a-z0-9_]+)*\.(aero|arpa|biz|com|coop|edu|gov|info|int|mil|museum|name|net|org|pro|travel|mobi|[a-z][a-z])|([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}))(:[0-9]{1,5})?$/i.test(value);
		} else if(name == 'password') {
			result = true && value != "";
		} else if(name == 'confirm-password') {
			result = value == $('input[name="password"]').val() && value != "";
		} else if(name == 'gender' || name == 'category') {
			result = value == 0 || value == 1 || value == 2;
		} else if(name == 'id') {
			result = /^[0-9]+$/.test(value) && value.length <= 8;
		} else if(name == 'rg') {
			result = value.length == 12;
		}
		
		return result;

	}
	
	var validFields = [];
	$('input, select').not(':input[type=submit]').each(function() {
		 
		$(this).blur(function() {
			if(isValid($(this))) {
				$(this).parent().addClass('has-success'); $(this).parent().removeClass('has-error');
				$(this).siblings().html('<i class="fa fa-check"></i>');
				if(validFields.indexOf($(this).attr('name')) == -1) {
					validFields.push($(this).attr('name'));
					console.log('Pushed valid field ' + $(this).attr('name'));
					console.log(validFields);
				}
			} else {
				$(this).parent().addClass('has-error'); $(this).parent().removeClass('has-success');
				$(this).siblings().html('<i class="fa fa-times"></i>');
				if(validFields.indexOf($(this).attr('name')) > -1) {
					validFields.remove($(this).attr('name'));
					console.log('Removed invalid field ' + $(this).attr('name'));
					console.log(validFields);
				}
			}

			if(validFields.length == 8) {
				$('button').removeAttr('disabled');
			} else {
				$('button').attr('disabled','disabled');
			}
		});
		
	});
  
	Array.prototype.remove = function() {
	    var what, a = arguments, L = a.length, ax;
	    while (L && this.length) {
	        what = a[--L];
	        while ((ax = this.indexOf(what)) !== -1) {
	            this.splice(ax, 1);
	        }
	    }
	    return this;
	};

});