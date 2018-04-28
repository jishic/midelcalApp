<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>自我保健主页</title>



<script type="text/javascript" src="../Healthcare/js/jquery-2.1.1.min.js"></script>
<link href="../Healthcare/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
<link href="../Healthcare/bootstrap3/css/bootstrap-theme.min.css" rel="stylesheet">
<script type="text/javascript" src="../Healthcare/bootstrap3/js/bootstrap.min.js"></script>

<style type="text/css">
.button1:hover {
	background-color: #fff;
	color: #1AAB8A;
}

.button1:before, button1:after {
	content: '';
	position: absolute;
	top: 0;
	right: 0;
	height: 2px;
	width: 0;
	background-color: #1AAB8A;
	transition: 400ms ease all;
}

.button1:after {
	right: inherit;
	top: inherit;
	left: 0;
	bottom: 0;
}

.button1:hover:before, button1:hover:after {
	width: 100%;
	transition: 800ms ease all;
}
</style>

</head>
<body>

	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column ">
				<nav class="navbar navbar-default navbar-fixed-top"
					role="navigation">
				<div class="navbar-header">
					<a class="navbar-brand" href="http://localhost:8080/bcgm/index.jsp">返回</a>
				</div>
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<span
						style="float: left; margin-left: 530px; margin-top: 8px; text-align: center;">
						<h4>自我保健</h4>
					</span>
				</div>
				</nav>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="row clearfix">
					<div class="col-md-12 column"
						style="padding-left: 300px; margin-top: 60px;">
						<form class="navbar-form navbar-left" role="search" action="/bcgm/healthcare/searchArticle">
							<div class="form-group">
								<input type="text" class="form-control" style="width: 400px;"  name="word"/>
							</div>
							<button type="submit" class="btn btn-default">搜索</button>
						</form>
					</div>
				</div>
				<hr style="margin-top: 8px;">
				<div class="row clearfix">
					<div class="col-md-3 column button1">
						<a href="/bcgm/healthcare/moduleArticle?id=3"><img alt="体型与健康" src="img/tixing.png"
							style="height: 180px; width: 250px;"></a>
						<h3>体型与健康</h3>
					</div>
					<div class="col-md-3 column button1">
						<a href="/bcgm/healthcare/moduleArticle?id=6"><img alt="老年保健" src="img/laonian.jpg"
							style="height: 180px; width: 250px;"></a>
						<h3>老年保健</h3>
					</div>
					<div class="col-md-3 column button1">
						<a href="/bcgm/healthcare/moduleArticle?id=7"><img alt="儿童保健" src="img/ertong.jpg"
							style="height: 180px; width: 250px;"></a>
						<h3>儿童保健</h3>
					</div>
					<div class="col-md-3 column button1">
						<a href="/bcgm/healthcare/moduleArticle?id=5"><img alt="女性保健" src="img/nvxing.jpg"
							style="height: 180px; width: 250px;"></a>
						<h3>女性保健</h3>
					</div>

				</div>
				<div class="row clearfix">
					<div class="col-md-3 column button1">
						<a href="/bcgm/healthcare/moduleArticle?id=1"><img alt="饮食与营养" src="img/yinshi.jpg"
							style="height: 180px; width: 250px;"></a>
						<h3>饮食与营养</h3>
					</div>
					<div class="col-md-3 column button1">
						<a href="/bcgm/healthcare/moduleArticle?id=2"><img alt="成瘾物质" src="img/yan.jpg"
							style="height: 180px; width: 250px;"></a>
						<h3>成瘾物质</h3>
					</div>
					<div class="col-md-3 column button1">
						<a href="/bcgm/healthcare/moduleArticle?id=4"><img alt="性保健" src="img/xing.jpg"
							style="height: 180px; width: 250px;"></a>
						<h3>性保健</h3>
					</div>

					<div class="col-md-3 column button1">
						<a href="/bcgm/healthcare/moduleArticle?id=8"><img alt="体检与筛查" src="img/tijian.jpg"
							style="height: 180px; width: 250px;"></a>
						<h3>体检与筛查</h3>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>