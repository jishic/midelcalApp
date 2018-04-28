<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>症状查询界面</title>
<link href="../css/common.css" rel="stylesheet">
<script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
<link href="../bootstrap3/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="../css/htmleaf-demo.css" />
<link rel='stylesheet' type='text/css' href="../css/simsCheckbox.css" />
<!-- <link rel='stylesheet' type='text/css' href="../css/font-awesome.min.css"/> -->
<link
	href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css"
	rel="stylesheet">
<script type="text/javascript" src="../js/simsCheckbox.js"></script>
</head>
<style>
.table input, label:hover {
	cursor: pointer;
}

#menuSideBar li a {
	color: #4F4F4F;
}

#menuSideBar .positionCurrent {
	background-color: red;
	color: white;
}

.symptomSwitching a:hover {
	background: -webkit-linear-gradient(#00CACA, #00E3E3);
	background: -o-linear-gradient(#00CACA, #00E3E3);
	background: -moz-linear-gradient(#00CACA, #00E3E3);
	background: linear-gradient(#00CACA, #00E3E3);
}
</style>
<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<span class="navbar-brand">BCGM</span>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li><a href="DiseaseDiagnosisIndex.jsp"><em
						class="glyphicon glyphicon-chevron-left"></em>返回</a></li>
			</ul>
			<ul>
				<li><h4 style="font-weight: 800; padding-left: 41%; color: white;">症状查询</h4></li>
			</ul>
		</div>
	</div>
	</nav>
	<div class="container" style="margin-top: 3%;">
		<div class="row clearfix" style="margin-top: 3%;">
			<div class="col-sm-2 column"></div>
			<div class="col-sm-2 column">
				<div class="well menuSideBar" style="padding: 8px 0px;">
					<p
						style="font-weight: 600; font-family: 黑体; font-size: 135%; margin-left: 11%;">
						<a style="text-decoration: none;">部位选择</a>
					</p>
					<ul id="menuSideBar" class="nav nav-list symptomSwitching"
						style="font-size: 160%; width: auto; height: 200%;">
						<li data-id="bodyPos"><a href="#">全身</a></li>
						<li data-id="headPos"><a href="#">头部</a></li>
						<li data-id="armPos"><a href="#">手部</a></li>
						<li data-id="chestPos"><a href="#">胸部</a></li>
						<li data-id="bellyPos"><a href="#">腹部</a></li>
						<li data-id="backPos"><a href="#">背部</a></li>
						<li data-id="legPos"><a href="#">腿部</a></li>
					</ul>
				</div>
			</div>
			<div class="col-sm-4 column">
				<div class="panel panel-default">
					<div class="panel-heading" style="font-weight: 800; font-size: 110%;">症状选择列表</div>
					<div class="panel-body" id="symptomContainer"></div>
				</div>
			</div>
			<div class="col-sm-2 column">
				<button type="button" class="btn btn-default btn-info"
					style="font-size: 140%;">
					<em class="glyphicon glyphicon glyphicon-check"></em>诊断查询
				</button>
			</div>
			<div class="col-sm-2 column"></div>
		</div>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		$(".symptomSwitching").on("click", "li", function() {
			var sId = $(this).data("id"); //获取data-id的值
			window.location.hash = sId; //设置锚点
			loadInner(sId);
		});
		function loadInner(sId) {
			var sId = window.location.hash;
			var pathn, i;
			switch (sId) {
			case "#bodyPos":
				pathn = "positionSypmtomJSP/position_wholebody.jsp";
				i = 0;
				break;
			case "#headPos":
				pathn = "positionSypmtomJSP/position_head.jsp";
				i = 1;
				break;
			case "#armPos":
				pathn = "positionSypmtomJSP/position_arm.jsp";
				i = 2;
				break;
			case "#chestPos":
				pathn = "positionSypmtomJSP/position_chest.jsp";
				i = 3;
				break;
			case "#bellyPos":
				pathn = "positionSypmtomJSP/position_belly.jsp";
				i = 4;
				break;
			case "#backPos":
				pathn = "positionSypmtomJSP/position_back.jsp";
				i = 5;
				break;
			case "#legPos":
				pathn = "positionSypmtomJSP/position_leg.jsp";
				i = 6;
				break;
			default:
				pathn = "positionSypmtomJSP/position_wholebody.jsp";
				i = 0;
				break;
			}
			$("#symptomContainer").load(pathn); //加载相对应的内容
			//$('.positionCurrent').removeClass('positionCurrent');  
			//$(".symptomSwitching li").eq(i).addClass("positionCurrent");
		}
		var sId = window.location.hash;
		loadInner(sId);
	});
</script>
</html>