s<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>疾病详情界面</title>
<link href="../css/common.css" rel="stylesheet">
<link href="../bootstrap3/css/bootstrap.min.css" rel="stylesheet">
<!-- <link rel='stylesheet' type='text/css' href="../css/font-awesome.min.css"/> -->
<link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="../css/htmleaf-demo.css">
<link rel="stylesheet" type="text/css" href="../css/deseaseDetails.css">
</head>
<body>
	<div class="deseaseDetails">
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
				<li><a href="DiseaseDiagnosisIndex.jsp"><em class="glyphicon glyphicon-chevron-left"></em>返回</a></li>
			</ul>
			<ul>
			    <li><h4 style="font-weight: 800; padding-left: 41%; color: white; ">疾病详情</h4></li>
			</ul>
		</div>	
	</div>
	</nav>
	<div class="container" style="margin-top: 1%;">
			<div class="row clearfix">
				<div class="col-sm-6 column">
					<h1 class="text-center" style="color: #01a3fd; margin-left: 0%; font-size: 240%;">
						<em class="glyphicon glyphicon-plus-sign"></em>${disease.ddq_name}
					</h1>
				</div>
				<div class="col-sm-6 column"></div>
			</div>
			<div class="row clearfix" style="margin-top: 2%;">
				<div class="col-sm-offset-2 col-sm-8 column">
					<div class="panel-group" id="accordion" role="tablist"
						aria-multiselectable="true">
						<div class="panel panel-default">
							<div class="panel-heading" role="tab" id="headingOne">
								<h4 class="panel-title">
									<a role="button" data-toggle="collapse"
										data-parent="#accordion" href="#collapseOne"
										aria-expanded="true" aria-controls="collapseOne"> 疾病概述 </a>
								</h4>
							</div>
							<div id="collapseOne" class="panel-collapse collapse in"
								role="tabpanel" aria-labelledby="headingOne">
								<div class="panel-body">
									<p>${disease.ddq_description}</p>
								</div>
							</div>
						</div>

						<div class="panel panel-default">
							<div class="panel-heading" role="tab" id="headingTwo">
								<h4 class="panel-title">
									<a class="collapsed" role="button" data-toggle="collapse"
										data-parent="#accordion" href="#collapseTwo"
										aria-expanded="false" aria-controls="collapseTwo"> 疾病症状 </a>
								</h4>
							</div>
							<div id="collapseTwo" class="panel-collapse collapse"
								role="tabpanel" aria-labelledby="headingTwo">
								<div class="panel-body">
									<p>${disease.ddq_symptom}</p>
								</div>
							</div>
						</div>

						<div class="panel panel-default">
							<div class="panel-heading" role="tab" id="headingThree">
								<h4 class="panel-title">
									<a class="collapsed" role="button" data-toggle="collapse"
										data-parent="#accordion" href="#collapseThree"
										aria-expanded="false" aria-controls="collapseThree">
										疾病治疗 </a>
								</h4>
							</div>
							<div id="collapseThree" class="panel-collapse collapse"
								role="tabpanel" aria-labelledby="headingThree">
								<div class="panel-body">
									<p>${disease.ddq_cure}</p>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<script type="text/javascript" src="../js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="../bootstrap3/js/bootstrap.min.js"></script>
</html>