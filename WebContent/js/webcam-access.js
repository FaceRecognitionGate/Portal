$(document).ready(function(){

	navigator.getUserMedia = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia || navigator.msGetUserMedia || navigator.oGetUserMedia;

	var video = document.getElementById('video');
	if (navigator.getUserMedia) {
		navigator.getUserMedia({video : true},
		function(stream) {
			var video = document.querySelector("#video");
			
			//$("#webcam-alert").alert("close");
			video.src = window.URL.createObjectURL(stream);
			video.play();
		}, function(err) {
			console.log("Erro: " + err.name);
		});
	} else {
		console.log("seu navegador não permite capturar videos");
	}
	
	var canvas = document.getElementById('canvas');
	var video = document.getElementById('video');
	
	document.getElementById("snap").addEventListener("click", function() {
		
		//$.post('fotossalvar.php', {imagem:canvas.toDataURL()}, function(data){},'json');
		var images = [];
		
		for (i = 0; i < 30; i++) { 
			canvas.getContext('2d').drawImage(video, 0, 0, 640, 480);
			var data = canvas.toDataURL();
			images.push(data);	
		}
		
		var url = "http://localhost:8080/Portal/imageUpload";
	    $.ajax({
	        url: url,
	        type: 'POST',
	        data: data,
	        async: false,
	        cache: false,
	        contentType: false,
	        processData: false,
	        success: function (status) {
	          window.alert("Sucesso")
	        }
	      });
	});
});
