	var str00="https://api.6uzi.com/?url=";  //接口0
    var str01="https://660e.com/?url=";  //接口1
	var str02="http://jx.618g.com/?url=";  //接口2
	var str="https://660e.com/?url=";  //默认接口为1
	var movieLink="https://www.iqiyi.com/v_19rrcuke28.html";
	var movie =""
		
		
	function test(){
		
		 movie = $("#movie").val();  //获取地址值
									
		if(movie==""||movie==null){
				alert("对不起,你输入的值为空，请重新输入" );
										
		}else{								
				movieLink=movie
				var kkstr=str+movie;
				document.getElementById("mm").src =kkstr; 				
		}																	
	}
	
	function bofang0(){	
		console.info("欢迎观看")
		var kkstr=str00+movieLink;
		document.getElementById("mm").src = kkstr;  //赋值	
	}


function bofang01(){	
	console.info("欢迎观看")
	var kkstr=str01+movieLink;
	document.getElementById("mm").src = kkstr;  //赋值	
}

function bofang02(){
	console.info("欢迎观看")
	var kkstr=str02+movieLink;
	document.getElementById("mm").src = kkstr;  //赋值	
}


function morenbofang(){ 
	var moren= "https://www.iqiyi.com/v_19rrcuke28.html";
	document.getElementById("mm").src =str01+moren;
 
  
}
window.onload =morenbofang


//<!--<li><a target="_blank" href="https://www.nxflv.com/?type=demo">诺讯视频智能解析 - 接口测试系统</a></li>
//<li><a target="_blank" href="http://www.41478.net?url=https://www.iqiyi.com/v_19rsjr50nw.html#"">视频云网解析</a></li>
//<li><a target="_blank" href="http://www.polyv.net/vod/">保利威视频播放解决方案</a></li>
// <li><a target="_blank" href="https://660e.com/">vip视频解析吧</a></li>
// <li><a target="_blank" href="https://api.6uzi.com/?url=https://www.iqiyi.com/v_19rsjr50nw.html#">918视频播放解决方案</a></li>
//<li><a target="_blank" href="https://api.6uzi.com/?url=https://www.iqiyi.com/v_19rsjr50nw.html#">视频vip接口</a></li>
// -->



