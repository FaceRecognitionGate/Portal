$(document).ready(function(){

navigator.getUserMedia = navigator.getUserMedia || navigator.webkitGetUserMedia || navigator.mozGetUserMedia || navigator.msGetUserMedia || navigator.oGetUserMedia;

	if (navigator.getUserMedia) {
		navigator.getUserMedia({video : true},
		function(stream) {
			var video = document.querySelector("#user-webcam");
			//$("#webcam-alert").alert("close");
			video.src = window.URL.createObjectURL(stream);
		}, function(err) {
			console.log("Erro: " + err.name);
		});
	} else {
		console.log("seu navegador não permite capturar videos");
	}
	
});
