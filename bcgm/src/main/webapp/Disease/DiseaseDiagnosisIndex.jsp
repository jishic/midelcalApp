<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>疾病诊断首页</title>
<link href="../css/common.css" rel="stylesheet">
<link href="../bootstrap3/css/bootstrap.min.css" rel="stylesheet">
<link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
</head>
<style type="text/css">
.col-center-block { //
	绝对居中 float: none;
	display: block;
	margin-left: auto;
	margin-right: auto;
}

.pictureSwitching li:hover {
	cursor: pointer;
}

.pictureCurrent {
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
				<li><a href="http://localhost:8080/bcgm/index.jsp"><em class="glyphicon glyphicon-chevron-left"></em>返回</a></li>
			</ul>
			<ul>
			    <li><h4 style="font-weight: 800; padding-left: 41%; color: white;">疾病诊断</h4></li>
			</ul>
		</div>	
	</div>
	</nav>
	<div class="container" style="margin-top: 4.1%;">
		<div class="row clearfix">
			<div class="col-sm-6 column">
				<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span><span
							class="icon-bar"></span><span class="icon-bar"></span><span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="#">疾病搜索</a>
				</div>
				<div>
					<form action="blurSelect" method="post" class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<div class="col-xs-10 column">
								<input type="text" class="form-control" name="blurName"
									style="width: 140%;" />
							</div>
							<div class="col-sm-2 column">
								<button type="submit" class="btn btn-default" style="margin-left: 500%;">查询</button>
							</div>
						</div>
					</form>
				</div>
				</nav>
			</div>
			<div class="col-sm-5 column" style="text-align: center;">
				<ul class="pagination pagination-lg pictureSwitching"
					style="margin-top: 2%; font-weight: 800; margin: 0.6% auto;">
					<li data-id="malePic"><a class="pictureCurrent">男性</a></li>
					<li data-id="femalePic"><a>女性</a></li>
					<li data-id="childPic"><a>儿童</a></li>
				</ul>
			</div>
			<div class="col-sm-1 column text-center" style="margin-top: 1%;">
			</div>
		</div>
		<div class="row clearfix" id="pictureContainer">
			<div class="col-sm-12 column" id="genderPicture"></div>
		</div>
	</div>
</body>
<script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$(".pictureSwitching").on("click", "li", function() {
			var sId = $(this).data("id"); //获取data-id的值
			window.location.hash = sId; //设置锚点
			loadInner(sId);
		});
		function loadInner(sId) {
			var sId = window.location.hash;
			var pathn, i;
			switch (sId) {
			case "#malePic":
				pathn = "genderPictureJSP/pic_male.jsp";
				i = 0;
				break;
			case "#femalePic":
				pathn = "genderPictureJSP/pic_female.jsp";
				i = 1;
				break;
			case "#childPic":
				pathn = "genderPictureJSP/pic_child.jsp";
				i = 2;
				break;
			default:
				pathn = "genderPictureJSP/pic_male.jsp";
				i = 0;
				break;
			}
			$("#genderPicture").load(pathn); //加载相对应的内容
			$('.pictureCurrent').removeClass('pictureCurrent');
			$(".pictureSwitching a").eq(i).addClass("pictureCurrent");
		}
		var sId = window.location.hash;
		loadInner(sId);
	});
</script>
</html>