$(function(){
	$('form').submit(function(){
		alert('regist submit');
		if(!checkForm()) return false;
		return true;
	});
});

function checkForm(){
	return true;
}