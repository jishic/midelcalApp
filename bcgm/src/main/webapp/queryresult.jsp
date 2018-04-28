<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>Medicine Result</title>
	<!-- 新 Bootstrap 核心 CSS 文件 -->
	<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

	<!-- 可选的Bootstrap主题文件（一般不使用） -->
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>

	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>

	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<!-- 引用本页面的.css文件 -->
	<link rel="stylesheet" href="./css/queryresult.css">
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
				<a class="navbar-brand" href="#">BCGM</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">查询结果</a></li>
					<li><a href="#contact">返回</a></li>
				</ul>
			</div>
		</div>
	</nav>
	<div class="container main">
			<h2>药品名称：${meditable.medicine}</h2>
			<h4>药品类别：${meditable.category}</h4>
			<hr>
			<h4>药品用法用量</h4>
			<textarea class="form-control" rows="4">
				${meditable.dosage}
			</textarea>
			<hr>
			<h4>药品机理</h4>
			<textarea class="form-control" rows="4">
				${meditable.function}
			</textarea>
			<hr>
			<h4>药品成分</h4>
			<textarea class="form-control" rows="4">
				${meditable.ingrement}
			</textarea>
			<hr> 
			<h4>药品适应症</h4>
			<textarea class="form-control" rows="4">
				${meditable.adaptation}
			</textarea>
			<hr>
			<h4>药品副作用</h4>
			<textarea class="form-control" rows="4">
				${meditable.sideeffect}
			</textarea>
			<hr>
			<h4>药品注意事项</h4>
			<textarea class="form-control" rows="4">
				${meditable.attention}
			</textarea>
			<hr>
	</div>
</body>
</html>