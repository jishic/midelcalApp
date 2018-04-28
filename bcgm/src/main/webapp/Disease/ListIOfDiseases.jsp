<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>疾病查询列表界面</title>
<link href="../css/common.css" rel="stylesheet">
<link href="../bootstrap3/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="../css/htmleaf-demo.css">
</head>
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
				<li><a href="#contact"><em class="glyphicon glyphicon-chevron-left"></em>返回</a></li>
			</ul>
			<ul>
			    <li><h4 style="font-weight: 800; padding-left: 41%; color: white; ">疾病列表</h4></li>
			</ul>
		</div>	
	</div>
	</nav>
	<div class="container" style="margin-top: 3%;">
		<div class="row clearfix">
			<div class="col-sm-2 column"></div>
			<div class="col-sm-8 column" style="font-size: 160%;">
				<table class="table table-striped table-fixed-head" data-table-fixed-head-trigger="20" data-table-fixed-head-top="50" style="margin-top: 4%;">
					<thead>
						<tr>
							<td style="text-align: center;">以下为疾病搜索结果：</td>
						</tr>
					</thead>
					<tbody>
					    <c:forEach var="blurDisease" items="${blurDisease}">
						    <tr>
							    <form action="selectName" method="post" role="form">
							    <input type="hidden" name="DiseaseName" value="${blurDisease}"/><td style="text-align: center;">${blurDisease}<button type="submit" class="btn btn-info" style="margin-left: 5%;">查看详情</button></td>
							    </form>
						    </tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<div class="col-sm-2 column"></div>
		</div>
	</div>
</body>
<script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
</html>