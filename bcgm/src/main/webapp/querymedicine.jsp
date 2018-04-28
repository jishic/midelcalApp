<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<meta charset="UTF-8">
	<title>medicine</title>
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

	<!-- 可选的Bootstrap主题文件（一般不使用） -->
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>

	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!-- 引用本页面的.css文件 -->
	<link rel="stylesheet" href="./css/querymedicine.css">
</head>
<body>
	<!-- Fixed navbar -->
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="main.html">BCGM</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">药品查询</a></li>
					<li><a href="main.html">返回</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<p class="logo">
<img src="./img/medicinelogo.png" width="150"  class="img-circle ">
</p>
	<div class="container">
		<form action="medicine/search" class="querytext">
			<input type="text" name="medicine" class="queryframe" placeholder="请输入药品名称......">
			<input type="submit"  class="querybtn btn" value="查询">
		</form>
	</div>

	<div class="container sorts">
		<div class="row">
			<div class="col-xs-4"><a href="http://localhost:8080/bcgm/medicine/medicinesort?category=心血管系统用药"><div class="jumbotron sort sort1">
				<h3 style="text-align: center;">心血管系统用药</h3><p>
				以中医药理论为指导,用于预防和治疗疾病并具有康复与保健作用的天然药物</p>
				<span>更多细节&raquo;</span>
			</div></a></div>
			<div class="col-xs-4"><a href="http://localhost:8080/bcgm/medicine/medicinesort?category=消化系统用药"><div class="jumbotron sort">
				<h3 style="text-align: center;">消化系统用药</h3>
				<p class="sortContent">化学合成方法制成或从天然产物提制而成的药物<br><br></p>
				<span>更多细节&raquo;</span>
			</div></a></div>
			<div class="col-xs-4"><a href="http://localhost:8080/bcgm/medicine/medicinesort?category=抗病原微生物药"><div class="jumbotron sort sort3">
				<h3 style="text-align: center;">抗病原微生物药</h3>
				<p class="sortContent">具有营养性、食物性天然药品性质,能调节人体的机能的保健食品<br></p>
				<span>更多细节&raquo;</span>
			</div></a></div>
		</div>
	</div>
</body>
</html>