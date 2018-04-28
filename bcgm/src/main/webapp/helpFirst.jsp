<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>HelpFirst</title>
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <meta charset="UTF-8">


 <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
 <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
      <!--[if lt IE 9]>
         <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
         <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
       <![endif]-->
       <!-- 新 Bootstrap 核心 CSS 文件 -->
       <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

       <!-- 可选的Bootstrap主题文件（一般不使用） -->
       <script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
       <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
       <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>

       <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
       <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

       <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" type="text/css">

      <style type="text/css">
          body,
          html {
            background-color: #01A3FD;
          }
      </style>


     </head>
     <body bgcolor="#202020">
      <div class="container">
        <div class="row clearfix">
         <div class="col-md-12 column">
         <ul class="breadcrumb">
          <li>
            <a href="http://localhost:8080/bcgm/index.jsp">返回</a>
          </li>
          
          <li class="active">
            急救板块
          </li>
        </ul>
       </div>
     </div>
     <div class="row clearfix">
       <div class="col-md-4 column">
        <div class="jumbotron">
         <h2>
          疾病急救
        </h2>
        <ul>
          <li>
            心肺病
          </li>
          <li>
            哮喘
          </li>
          <li>
            溺水
          </li>
          <li>
            窒息
          </li>
          <li>
            烧伤
          </li>
          <li>
            休克
          </li>

          <li>
            ......................
          </li>
          <br>
        </ul>
        <p>
          <a class="btn btn-primary btn-large" href="JiJiu/all_ill.action">点击进入</a>
        </p>
      </div>
    </div>
    <div class="col-md-4 column">
     <div class="jumbotron">
      <h2>
        急救技巧
     </h2>
     <ul>
          <li>
            心肺复苏术
          </li>
          <li>
            人工呼吸
          </li>
          <li>
            热敷
          </li>
          <li>
            冷敷
          </li>
          <li>
            烧伤处理
          </li>
          <li>
            骨折处理
          </li>
           
          <li>
            ......................
          </li>
          <br>
        </ul>
     <p>
       <a class="btn btn-primary btn-large" href="JiJiu/all_skill.action">点击进入</a>
     </p>
   </div>
 </div>
<div class="col-md-4 column">
     <div class="jumbotron">
      <h2>
        紧急送医
     </h2>
     <ul>
          <li>
            医院电话
          </li>
          <li>
            附近医院
          </li>
           
          <li>
            ......................
          </li>
          <br>
          <br>
          <br>
          <br>
          <br>
        </ul>
     <p>
       <a class="btn btn-primary btn-large" href="helpright.jsp">点击进入</a>
     </p>
   </div>
0 </div>

</div>
</div>
</body>
</html>