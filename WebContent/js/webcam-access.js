$(document).ready(function(){

	var video = document.querySelector("#user-webcam");
      
	navigator.mediaDevices.getUserMedia({video: true}).then(handleVideo);
	
	function handleVideo(stream) {
		video.src = window.URL.createObjectURL(stream);
		$("#webcam-alert").alert("close");
		//$('button').removeAttr('disabled');
	}
 
	function videoError(e) {}

});