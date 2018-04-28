<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>helpleft</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta charset="UTF-8">


	
     <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

     <script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>

     <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>

     <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
     <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css">

      <style type="text/css">
          body,
          html {
            background-color: #01A3FD;
          }
      </style>
 </head>
  <body>
 	<div class="container">
 		<div class="row clearfix">
 			<div class="col-md-12 column">
 				<ul class="breadcrumb">
 					<li>
 						<a href="../helpFirst.jsp">返回</a>
 					</li>
 					
 					<li class="active">
 						疾病急救
 					</li>
 				</ul>
 				<nav class="navbar navbar-default" role="navigation">
 					<div class="navbar-header">
 						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">疾病名</a>
 					</div>

 					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
 						<ul class="nav navbar-nav">
 							<li class="active">
 								<a href="#">查询列</a>
 							</li>
 							
 						</ul>
 						<form class="navbar-form navbar-right" role="search" action="title_ill.action">
 							<div class="form-group">
 								<input type="text" class="form-control" name="search"/>
 							</div> <button type="submit" class="btn btn-default">搜索疾病</button>
 						</form>
 						
 					</div>

 				</nav>
 				<div class="panel-group" id="panel-345647">
 				    <%! int i=1;  %>
 				    <c:forEach var="aaa"  items="${list}">
 				         <div class="panel panel-default">
                        <div class="panel-heading">
                            <a class="panel-title" data-toggle="collapse" data-parent="#panel-345647" href="#panel-element-<%=i%>">${aaa.title} </a>
                        </div>
                        
                        <div id="panel-element-<%=i%>" class="panel-collapse collapse">
                            <div class="panel-body">
                               ${aaa.description}
                            </div>
                        </div>
                        <% i+=1; %>
                    </div>
                    
 				    </c:forEach>
                    
                  

 				</div>
 			</div>
 		</div>
 	</div>
 </body>
 </html>