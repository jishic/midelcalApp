<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>自我保健</title>



<script type="text/javascript" src="../Healthcare/js/jquery-2.1.1.min.js"></script>

<link href="../Healthcare/bootstrap3/css/bootstrap.min.css" rel="stylesheet">
<link href="../Healthcare/bootstrap3/css/bootstrap-theme.min.css" rel="stylesheet">
<script type="text/javascript" src="../Healthcare/bootstrap3/js/bootstrap.min.js"></script>

<style type="text/css">
textarea {
	border: 0;
	background-color: transparent;
	outline: medium;
	resize: none;
	font-size: 18px;
	color: #0EA3FD;
	font-style: "微软雅黑";
}

.bj-main {
	position: relative;
	top: 95px;
	border-radius: 18px;
	background: linear-gradient(to top, #F2F2F2, #F5F5F5);
}

#bj-biaoti li{
	cursor: pointer;
}
</style>
<script type="text/javascript">

$(document).ready(function(){
       $("#bj-biaoti li").click(function(){//点击事件
             var v=$(this) ;
             var id = $(v).children("p").text();
             var biaoti = $(v).children("a").text();

             $.ajax({
     			type : "post",
     			async : true,
     			url : "/bcgm/healthcare/getArticleByAid",
     			data : {
     				aid : id
     			},
     			datatype : "text",
     			success : function contentchange(data) {
     				$("#neirong").val(data);
     			}
     		});
             $("#biaoti").text(biaoti);
       })
})


</script>

</head>
<body >
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column ">
				<nav class="navbar navbar-default navbar-fixed-top"
					role="navigation" >
					<div class="navbar-header">
						<a class="navbar-brand" href="http://localhost:8080/bcgm/Healthcare/zwbjIndex.jsp">返回</a>
					</div>
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<span
							style="float: left; margin-left:480px;margin-top:8px; text-align: center;">
						<h4>
							<c:choose>
								<c:when test="${module eq 1}">
							                       饮食与营养
							     </c:when>
								<c:when test="${module eq 2}">
							                        成瘾物质
							    </c:when>
								<c:when test="${module eq 3}">
							                       体型与健康
							    </c:when>
								<c:when test="${module eq 4}">
							                          性保健
							    </c:when>
								<c:when test="${module eq 5}">
							                          性保健
							    </c:when>
								<c:when test="${module eq 6}">
							                        老年保健
							    </c:when>

								<c:when test="${module eq 7}">
							                      儿童保健
							    </c:when>
								<c:when test="${module eq 8}">
							                     体检和筛查
							    </c:when>
								<c:when test="${module eq 10}">
							                      搜索结果
							    </c:when>
							</c:choose>
						</h4>
					</span>
					</div>
				</nav>
			</div>
		</div>
	</div>
	<div class="container">
		<div class="row clearfix bj-main">
			<div class="col-md-4 column" style="padding:28px 20px;">
				<ol id="bj-biaoti">
				<c:if test="${not empty article}">
						<c:forEach var="article" items="${article}">
							<h3>
								<li id="aaa"><a>${article.hTitle}</a> <p hidden="hidden">${article.hAid}</p></li>

							</h3>
						</c:forEach>
					</c:if>

					<c:if test="${empty article}">
					             <h1>没有相关搜索结果</h1>
					</c:if>
				</ol>
			</div>
			<div class="col-md-1 column" style="background-color:white;"></div>
			<div class="col-md-7 column">

				<h3 class="text-center" id="biaoti">
					<c:if test="${not empty article}">
						<c:forEach var="article" items="${article}" begin="0" end="0">
                                      ${article.hTitle}
				        </c:forEach>
					</c:if>
				</h3>
				<textarea rows="18" cols="70" readonly="readonly" id="neirong">
				<c:if test="${not empty article}">
				        <c:forEach var="article" items="${article}" begin="0" end="0" >
                                      ${article.hContent}
				         </c:forEach>
				     </c:if>
                </textarea>

			</div>
		</div>
	</div>
	</div>
	</div>
</body>
</html>