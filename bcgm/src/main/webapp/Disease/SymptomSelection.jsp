<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>症状查询界面-头部及周身</title>
<link href="../css/common.css" rel="stylesheet">
<link href="../bootstrap3/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="../css/htmleaf-demo.css" />
<link rel="stylesheet" type="text/css" href="../bootstrap3/css/bootstrap.css" />
<link rel="stylesheet" type="text/css" href="../css/build.css" />
<!-- <link rel='stylesheet' type='text/css' href="../css/font-awesome.min.css"/> -->
<link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
</head>
<style type="text/css">
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
				<li><h4
						style="font-weight: 800; padding-left: 37%; color: white;">症状查询</h4></li>
			</ul>
		</div>
	</div>
	</nav>
	<div class="container" style="margin-top: 3%;">
		<div class="row clearfix" style="margin-top: 3%;">
			<div class="col-sm-3 column"></div>
			<form action="b" method="post" role="form">
			<div class="col-sm-4 column">
				<div class="panel panel-default">
					<div class="panel-heading"
						style="font-weight: 800; font-size: 110%;">症状选择列表</div>
					<div class="panel-body" id="symptomContainer">
  					    <c:forEach var="symptom" items="${symptom}">
  							<div >
		                        <input type="checkbox" name="needSymptom" value="${symptom}" class="checkboxCss">
		                        <label class="labelCss">${symptom}</label>
		                    </div>
			            </c:forEach>
					</div>
				</div>
			</div>
			<div class="col-sm-2 column">
				<button type="submit" class="btn btn-default btn-info"
					style="font-size: 140%;">
					<em class="glyphicon glyphicon glyphicon-check"></em>诊断查询
				</button>
			</div>
			</form>
			<div class="col-sm-3 column"></div>
		</div>
	</div>
</body>
<script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="../js/simsCheckbox.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$(".demo").simsCheckbox({
			"checkedClass" : 'btn-info'
		});
	});
</script>
</html>