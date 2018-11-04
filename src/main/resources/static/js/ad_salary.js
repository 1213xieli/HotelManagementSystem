$(document).ready(function(){
	getConfig();
	$("#showConfig").click(function(){
		changeTab();
	});
	$("#alterConfig").click(function(){
		changeTab();
	});
	$("#alterConfigBtn").click(function(){
		alterConfig();
	})
})

var config;

//判断字符串是否为空 空返回1 非空返回0
function isEmptyString(str){
	if(str=='null'||str=='')
		return 1;
	return 0;
}


function getConfig(){
	$.ajax({
		type:"POST",
		url:"../config/updateConfig.do",
		dataType:"JSON",
		data:{},
		success:function(data){
			if(code=="0"){
				config=data.config;
				var htmlStr="<tr><td>经理</td><td>"+config.managesalary+"</td><td>"+config.manage+"</td></tr>"+
				"<tr><td>经理</td><td>"+config.staffsalary+"</td><td>"+config.staff+"</td></tr>"+
				"<tr><td>经理</td><td>"+config.cleanersalary+"</td><td>"+config.cleaner+"</td></tr>";
				$("#configList").append(htmlStr);
				$("#inputMS").val(config.managesalary);
				$("#inputSS").val(config.staffsalary);
				$("#inputCS").val(config.cleanersalary);
				$("#inputM").val(config.manage);
				$("#inputS").val(config.staff);
				$("#inputC").val(config.cleaner);
			}
			else{
				alert("获取配置错误");
			}

		},
		error:function(){
			alert("获取配置发生错误")
		}

	});
}

function changeTab(){
	var info=$("#showConfigDiv").css("display");
	var alter=$("#alterConfigDiv").css("display");
	if(info=="block"){
		$("#showConfigDiv").css("display","none");
		$("#alterConfigDiv").fadeIn();	
	}
	else{
		$("#alterConfigDiv").css("display","none")
		$("#showConfigDiv").fadeIn();
	}
}

function alterConfig(){
	if(isEmptyString($("#inputMS").val())||isEmptyString($("#inputM").val())||isEmptyString($("#inputSS").val())||isEmptyString($("#inputS").val())||isEmptyString($("#inputCS").val())||isEmptyString($("#inputC").val()))
		alert("请填写全内容");
	else{
		$.ajax({
			type:"POST",
			url:"../config/updateConfig.do",
			dataType:"JSON",
			data:{
				"managesalary":$("#inputMS").val(),
				"staffsalary":$("#inputSS").val(),
				"cleanersalary":$("#inputCS").val(),
				"manage":$("#inputM").val(),
				"staff":$("#inputS").val(),
				"cleaner":$("#inputC").val()
			},
			success:function(data){
				if(code=="0"){
					alert("修改成功");
					window.location.reload();
				}
				else{
					alert("修改配置错误");
				}

			},
			error:function(){
				alert("修改配置发生错误")
			}

		});

	}
}