<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="">
<!--<![endif]-->
<head>
  <meta charset="utf-8">
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>本草纲目</title>
  <link rel="stylesheet" href="http://localhost:8080/bcgm/css/bootstrap.min.css">
  <link rel="stylesheet" href="http://localhost:8080/bcgm/css/flexslider.css">
  <link rel="stylesheet" href="http://localhost:8080/bcgm/css/jquery.fancybox.css">
  <link rel="stylesheet" href="http://localhost:8080/bcgm/css/main.css">
  <link rel="stylesheet" href="http://localhost:8080/bcgm/css/responsive.css">
  <link rel="stylesheet" href="http://localhost:8080/bcgm/css/animate.min.css">
  <link rel="stylesheet" href="http://localhost:8080/bcgm/css/font-icon.css">

</head>

<body>
  <!-- header section -->
  <section class="banner" role="banner">
<!-- header navigation
  <header id="header">
    <div class="header-content clearfix"> <a class="logo" href="index.html"><img src="images/logo.png" alt=""></a>
      <nav class="navigation" role="navigation">
        <ul class="primary-nav">
          <li><a href="about.html">About me</a></li>
          <li><a href="contact.html">Contact</a></li>
      <li><a href="#">External Link</a></li>
        </ul>
      </nav>
      <a href="#" class="nav-toggle">Menu<span></span></a> </div>
      </header>
      header navigation -->
    </section>
    <!-- header section -->
    <!-- text banner section -->
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
          <a class="navbar-brand" href="#">Our logo</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li class="active"><a href="#">Home</a></li>
            <li><a href="login.html">login</a></li>
            <li><a href="signup.html">register</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>

    <section>

    </section>
  </section>
  <!-- Text banner section --> 
  <!-- portfolio section -->
  <section id="works" class="works section no-padding">
    <div class="container-fluid">
      <div class="row no-gutter">
        <div class="col-lg-4 col-md-6 col-sm-6 work"> 
        <a href="bingli.html" class="work-box"> <img src="images/1.png" alt="">
          <div class="overlay">
            <div class="overlay-caption">
              <h3 style="font-family: STHupo;color: white;font-size:50px;">本草纲目</h3>
              <p><i class="fa fa-search-plus fa-2x"></i></p>
            </div>
          </div>
          <!-- overlay  -->
        </a> 
       <!--  <div class="container-fluid" style="padding-right:0px;padding-left:0px;">
         <div id="carouseling" class="carousel slide" data-ride="carousel">
           图片下部分的几个小圆点
           <ol class="carousel-indicators">
             <li data-target="#carouseling" data-slide-to="0" class="active"></li>
             <li data-target="#carouseling" data-slide-to="1"></li>
             <li data-target="#carouseling" data-slide-to="2"></li>
             <li data-target="#carouseling" data-slide-to="3"></li>
           </ol>
           图片
           <div class="carousel-inner">
             <div class="item active"><img src="./c0.jpg" alt="1"></div>
             <div class="item"><img src="c1.jpg"   alt="2" class="img-responsive"></div>
             <div class="item"><img   src="c2.jpg"  alt="3"  class="img-responsive"></div>
             <div class="item"><img src="c3.jpg"  alt="4"  class="img-responsive"></div>
           </div>
            左按钮
         <a class="left carousel-control" href="#carouseling" data-slide="prev">
           <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
         </a>
         右按钮
         <a class="right carousel-control" href="#carouseling" data-slide="next">
           <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
           <span class="sr-only">Next</span>
         </a>
         </div>
       </div> -->
        </div>
       <!--  <div class="col-lg-4 col-md-6 col-sm-6 work"> <a href="images/work-2.jpg" class="work-box"> <img src="images/work-2.jpg" alt="">
         <div class="overlay">
           <div class="overlay-caption">
             <h5>Project Name</h5>
             <p><i class="fa fa-search-plus fa-2x"></i></p>
           </div>
         </div>
         overlay 
       </a> </div> -->
       <!--  <div class="col-lg-4 col-md-6 col-sm-6 work"> <a href="images/work-3.jpg" class="work-box"> <img src="images/work-3.jpg" alt="">
         <div class="overlay">
           <div class="overlay-caption">
             <h5>Project Name</h5>
             <p><i class="fa fa-search-plus fa-2x"></i></p>
           </div>
         </div> 
         overlay 
       </a> </div> -->
       <div class="col-lg-4 col-md-6 col-sm-6 work"> <a href="http://localhost:8080/bcgm/Healthcare/zwbjIndex.jsp" class="work-box"> <img src="images/2.png" alt="">
        <div class="overlay">
          <div class="overlay-caption">
            <h3 style="font-family: STHupo;color: white;font-size:50px;">自我保健</h3>
            <p><i class="fa fa-search-plus fa-2x"></i></p>
          </div>
        </div>
        <!-- overlay --> 
      </a> </div>
      <div class="col-lg-4 col-md-6 col-sm-6 work"> <a href="http://localhost:8080/bcgm/Disease/DiseaseDiagnosisIndex.jsp" class="work-box"> <img src="images/3.png" alt="">
        <div class="overlay">
          <div class="overlay-caption">
            <h3 style="font-family: STHupo;color: white;font-size:50px;">疾病诊断</h3>
            <p><i class="fa fa-search-plus fa-2x"></i></p>
          </div>
        </div>
        <!-- overlay --> 
      </a> </div>
      <div class="container-fluid">
        <div class="row no-gutter">

          <div class="col-lg-4 col-md-6 col-sm-6 work"> <a href="http://localhost:8080/bcgm/NewFile.jsp" class="work-box"> <img src="images/4.png" alt="">
            <div class="overlay">
              <div class="overlay-caption">
                <h3 style="font-family: STHupo;color: white;font-size:50px;">身体机能检测</h3>
                <p><i class="fa fa-search-plus fa-2x"></i></p>
              </div>
            </div>
            <!-- overlay --> 
          </a> </div>
          <div class="col-lg-4 col-md-6 col-sm-6 work"> <a href="http://localhost:8080/bcgm/querymedicine.jsp" class="work-box"> <img src="images/5.png" alt="">
            <div class="overlay">
              <div class="overlay-caption">
                <h3 style="font-family: STHupo;color: white;font-size:50px;">药品</h3>
                <p><i class="fa fa-search-plus fa-2x"></i></p>
              </div>
            </div>
            <!-- overlay --> 
          </a> </div>
          <div class="col-lg-4 col-md-6 col-sm-6 work"> <a href="http://localhost:8080/bcgm/helpFirst.jsp" class="work-box"> <img src="images/6.png" alt="">
            <div class="overlay">
              <div class="overlay-caption">
                <h3 style="font-family: STHupo;color: white;font-size:50px;">急救</h3>
                <p><i class="fa fa-search-plus fa-2x"></i></p>
              </div>
            </div>
            <!-- overlay --> 
          </a> </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- portfolio section 
  footer
<footer class="section footer">
  <div class="footer-bottom">
    <div class="container">
      <div class="col-md-12">
        <p>
        <ul class="footer-share">
          <li><a href="#"><i class="fa fa-facebook"></i></a></li>
          <li><a href="#"><i class="fa fa-twitter"></i></a></li>
          <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
          <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
          <li><a href="#"><i class="fa fa-pinterest-p"></i></a></li>
          <li><a href="#"><i class="fa fa-vimeo"></i></a></li>
        </ul>
        </p>
        <p>© 2015 All rights reserved. All Rights Reserved<br>
          More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
      </div>
    </div>
  </div>
</footer> -->
<!-- footer --> 
<!-- JS FILES --> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/jquery.flexslider-min.js"></script> 
<script src="js/jquery.fancybox.pack.js"></script> 
<script src="js/jquery.waypoints.min.js"></script> 
<script src="js/retina.min.js"></script> 
<script src="js/modernizr.js"></script> 
<script src="js/main.js"></script>
</body>
</html>

     