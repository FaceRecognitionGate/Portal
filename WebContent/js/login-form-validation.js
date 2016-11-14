$(document).ready(function() {
	
	//Default Login button to 'disable'
	$('button').attr('disabled','disabled');
	
	function isValid(input) {
		
		var result = false;
		var name = input.attr('name');
		var value = input.val();
		
		if(name == 'email') {
			result = /^[-a-z0-9~!$%^&*_=+}{\'?]+(\.[-a-z0-9~!$%^&*_=+}{\'?]+)*@([a-z0-9_][-a-z0-9_]*(\.[-a-z0-9_]+)*\.(aero|arpa|biz|com|coop|edu|gov|info|int|mil|museum|name|net|org|pro|travel|mobi|[a-z][a-z])|([0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}))(:[0-9]{1,5})?$/i.test(value);
		} else if(name == 'password') {
			result = value != "";
		}
		
		return result;
	}
	
	var validFields = [];
	$('input, select').not(':input[type=submit]').each(function() {
		 
		$(this).keydown(function() {
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

			if(validFields.length == 2) {
				$('button').removeAttr('disabled');
				toggleFormSubmit(true);
			} else {
				$('button').attr('disabled','disabled');
				toggleFormSubmit(false);
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
	
	function toggleFormSubmit(canSubmit) {
		if(canSubmit) {
			$('form input').on('keypress', function(e) {
			    return true;
			});
		} else {
			$('form input').on('keypress', function(e) {
				return e.which !== 13;
			});
		}
	}
	
});