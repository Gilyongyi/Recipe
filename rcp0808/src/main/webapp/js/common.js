function getWeather(){
	$.getJSON('http://api.openweathermap.org/data/2.5/weather?lat=37.541&lon=126.986&appid=a0ccb666270bab97723eace09ed1b61c',
            function(result) {
//			alert(result.weather[0].main);
    });
}

function wrapWindowByMask() {
	//화면의 높이와 너비를 구한다.
	var maskHeight = $(document).height();
	var maskWidth = $(window).width();
	
	//마스크의 높이와 너비를 화면 것으로 만들어 전체 화면을 채운다.
	$('#mask').css({
		'width' : maskWidth,
		'height' : maskHeight
	});
	//마스크의 투명도 처리
	$('#mask').fadeTo("slow", 0.8);
}

$(document).ready(function() {
	//wrapWindowByMask();
	//불투명 배경 띄우기
	$('.openMask').click(function(e) {
		e.preventDefault();
		wrapWindowByMask();
	});
});


$('#userInfoEditBtn').on('click', function(){
	$('#editUserInfo-pop-up-banner').bPopup();
});


//signUpBtn 팝업 , 불투명 배경 띄우기
$('#signUpBtn').on('click', function(){
	$('#signup-pop-up-banner').bPopup();
});

//loginBtn팝업 , 불투명 배경 띄우기
$('#loginBtn').on('click', function(){
	$('#login-pop-up-banner').bPopup();
});


$('#mask').on('click', function(){
	btnexit();
});

function btnexit() {
	$('#signUpBox').hide();
	$('#userInfoEditBox').hide();
	$('#mask').hide();
};