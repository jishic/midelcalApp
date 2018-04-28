<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<title>身体机能检测</title>
<meta name="format-detection" content="telephone=no">
<meta http-equiv="Content-Type" contentType="text/html; charset=utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />

<!-- Styles -->
<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="css/prettyPhoto.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="css/owl.carousel.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="css/owl.theme.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="css/animate.min.css"
	media="screen" />
<link rel="stylesheet" type="text/css" href="css/style.css"
	media="screen" />

<!-- Fonts -->
<link href='http://fonts.useso.com/css?family=Dosis' rel='stylesheet'
	type='text/css'>
<link href='http://fonts.useso.com/css?family=Open+Sans:400,800'
	rel='stylesheet' type='text/css'>

<!-- Favicon -->
<link rel="shortcut icon" type="image/x-icon" href="images/favicon.ico">
<script type="text/javascript">
	function pressure() {
		var data = document.getElementById("pre");
		var msg = document.getElementById("message1");
		if (80 < data.value && data.value < 120) {
			msg.value = " ";
			msg.value = "若您填写的是舒张压力，则您的血压处于正常状态，请您继续保持良好的生活习惯。";
		} else if (120 < data.value && data.value < 139) {
			msg.value = " ";
			msg.value = "若您填写的是舒张压力，则您的血压处于一个高值。我们给出您以下意见：1.多吃降压的食物如：芹菜、菠菜、海带、萝卜等；多吃一些素食和粗粮杂粮，新鲜蔬果，瘦肉，鱼。少吃白糖，咖啡、辛辣油腻的食物、浓茶2.降低食盐食用量3.戒烟、戒酒4.多饮用泉水，深井水、天然矿泉水等含有钙离子和镁离子硬水；5.三餐饮食定时、定量。";
		} else if (data.value > 140) {
			msg.value = " ";
			msg.value = "若您填写的是舒张压力，则您很有可能处于高血压状态。建议您尽快前往医院进行系统的测量，进行药物控制。";
		}
	}
	function fat() {
		var data0 = document.getElementById("fat1");
		var data1 = document.getElementById("fat2");
		var data2 = document.getElementById("fat3");
		var msg = document.getElementById("message3")
		if (2.8 < data0.value && data0.value < 5.17 && 0.56 < data1.value && data1.value  < 1.7
				&& 2.8 < data2.value && data2.value < 5.17) {
			msg.value = " ";
			msg.value = "临床上主要看的是总胆固醇：2.8～5 .17mmol/L，甘油三酯：0 .56～1.7mmol/L，　胆固醇脂：2 .8～5.17mmol/L这三项,您输入的数据符合这个标准，请继续保持";
		} else {
			msg.value = " ";
			msg.value = "您的血脂数值已经不在正常标准范围，我们给出以下建议：定要注意饮食的均衡，不要吃过多的淀粉类的东西。其次不要吃过多的脂肪，尤其是饱和脂肪酸特别多的东西，比如肥肉、内脏这些食品、含胆固醇比较高的食品，要尽量减一些。另外需要保持良好的心情，适当进行锻炼，减肥等";
		}
	}
	function suger() {
		var data = document.getElementById("suger");
		var msg = document.getElementById("message2");
		if(data.value < 3.9){
			msg.value = " ";
			msg.value = "您的血糖含量偏低，";
		}
		if (3.9 < data.value && data.value < 11.1) {
			msg.value = " ";
			msg.value = "恭喜您，您的血糖在正常范围之内，请继续保持";
		} else if (data.value > 11.1) {
			msg.value = " ";
			msg.value = "如果您的数据真实，您已经处于高血糖状态，请保持良好的生活习惯：血糖偏高者需要终身治疗,不同的阶段需要不同的治疗,日常还要讲究饮食习惯,若无相关知识无法与医生很好地配合治疗,如吃药要了解药性,多接受此方面的健康教育,至少能与医生一起帮助控制因高血糖引起的各种并发症";
		}
	}
	function wh() {
		var data = document.getElementById("wh1");
		var data0 = document.getElementById("wh2");
		var data1 = document.getElementById("wh3");
		var msg = document.getElementById("message4");
		if (data.value == "男") {
			var T = (data1.value - 100) * 0.9;
			msg.value = " ";
			msg.value = "您的理想体重为：" + T + "kg"
					+ "                                       ";
			if (T - 5 < data0.value && data0.value < T + 10) {
				msg.value = " ";
				msg.value = "您身体的综合情况正常，请继续保持!";
			} else if (data0.value < T - 5) {
				msg.value = " ";
				msg.value = "您身体的综合情况偏瘦，请适量增加脂肪和蛋白质类食物!";
			} else if (T + 10 < data0.value) {
				msg.value = " ";
				msg.value = "您身体的综合情况偏胖，请适量减少脂肪和蛋白质类食物!";
			}
		}
		else if (data.value == "女") {
			var T = (data1.value - 100) * 0.9 - 2.5;
			msg.value = " ";
			msg.value = "您的理想体重为：" + T + "kg"
					+ "                                       ";
			if (T - 5 < data0.value && data0.value < T + 10) {
				msg.value = " ";
				msg.value = "您身体的综合情况正常，请继续保持!";
			} else if (data0.value < T - 5) {
				msg.value = " ";
				msg.value = "您身体的综合情况偏瘦，请适量增加脂肪和蛋白质类食物!";
			} else if (T + 10 < data0.value) {
				msg.value = " ";
				msg.value = "您身体的综合情况偏胖，请适量减少脂肪和蛋白质类食物!";
			}
		}
	}
</script>
</head>
<body>
	<header id="header">
		<div id="logo" class="text-center animated" data-animation="fadeInUp"
			data-animation-delay="400">
			<a href="index.html"><img src="images/logo.png" alt="Logo"></a>
		</div>
		<div id="slideshow">
			<ul class="rslides">
				<li style="background-image: url(images/slide_img_1.jpg);"><img
					src="images/slide_img_1.jpg" alt="">
					<div class="slideshow-caption">
						<h1>
							我们 <span class="highlight">关心</span> 您的健康
						</h1>
						<h3>如果对我们的服务满意，请为我们点赞</h3>
					</div></li>
				<li style="background-image: url(images/slide_img_2.jpg);"><img
					src="images/slide_img_2.jpg" alt="">
					<div class="slideshow-caption">
						<h1>
							<span class="highlight">您的健康</span>，我们的牵挂
						</h1>
						<h3>如果对我们的服务满意，请为我们点赞</h3>
					</div></li>
				<li style="background-image: url(images/slide_img_3.jpg);"><img
					src="images/slide_img_3.jpg" alt="">
					<div class="slideshow-caption">
						<h1>
							我们为您提供 <span class="highlight">专业的</span> 健康治疗方案
						</h1>
						<h3>如果对我们的服务满意，请为我们点赞</h3>
					</div></li>
			</ul>
		</div>
	</header>

	<nav id="navigation">
		<div class="nav-container">
			<ul>
				<li><a class="active" href="#welcome">Welcome</a></li>
				<li><a href="#about">关于<span class="extrabold">我们</span></a></li>
				<li><a href="#special-gallery">血压<span class="extrabold">检测</span></a></li>
				<li><a href="#doctors">血糖<span class="extrabold">检测</span></a></li>
				<li><a href="#branches">血脂<span class="extrabold">检测</span></a></li>
				<li><a href="#price">身高/体重</a></li>
				<li><a href="#contact">联系<span class="extrabold">我们</span></a></li>
			</ul>
		</div>
	</nav>

	<nav id="mobile-navigation">
		<div class="mobile-nav-container">
			<div id="menu-toggle">
				<i class="fa fa-bars"></i>
			</div>
			<ul class="inactive">
				<li><a class="active" href="#welcome">返回</a></li>
				<li><a href="#about">关于 <span class="extrabold">我们</span></a></li>
				<li><a href="#special-gallery">血压 <span class="extrabold">检测</span></a></li>
				<li><a href="#doctors">血糖 <span class="extrabold">检测</span></a></li>
				<li><a href="#branches">血脂<span class="extrabold">检测</span></a></li>
				<li><a href="#price">身高/体重</a></li>
				<li><a href="#blog">Blog</a></li>
				<li><a href="#contact">联系 <span class="extrabold">我们</span></a></li>
			</ul>
		</div>
	</nav>

	<a href="#" class="scrollup"> <i class="fa fa-angle-double-up"></i>
	</a>

	<section id="welcome" class="welcome section">
		<div class="container">
			<div class="row">
				<div class="section-title animated" data-animation="fadeInUp"
					data-animation-delay="700">
					<h2>
						<span class="extrabold">欢迎使用</span> 本草纲目
					</h2>
					<div class="section-title-line animated" data-animation="fadeInUp"
						data-animation-delay="900">
						<div class="section-title-icon">
							<img src="images/heart_icon.png" alt="">
						</div>
						<hr>
					</div>
				</div>
				<div class="col-md-6">
					<h3 class="without-margin">
						<span class="extrabold">功能</span>
					</h3>
					<h3>简介</h3>
					<p>我们将为您提供最专业的身体机能检测，帮助您时刻了解自己的血压、血糖、血脂，保持身体的健康状态！</p>
				</div>
				<div class="col-md-6">
					<div class="welcome-image text-center">
						<img src="images/welcome-img.png" alt="">
					</div>
				</div>
			</div>
		</div>
	</section>


	<section id="about" class="about section grey section-without-pb">
		<div class="container-fluid">
			<div class="row">
				<div class="section-title animated" data-animation="fadeInUp"
					data-animation-delay="700">
					<h2>
						<span class="extrabold">关于</span> 我们
					</h2>
					<div class="section-title-line">
						<div class="section-title-icon">
							<img src="images/heart_icon.png" alt="">
						</div>
						<hr>
					</div>
				</div>
				<div class="col-md-6 side-image-left">
					<div class="image-slider owl-carousel animated"
						data-animation="fadeInLeft" data-animation-delay="1000">
						<div class="swiper-slide">
							<img src="images/about_image_1.jpg" alt="">
						</div>
						<div class="swiper-slide">
							<img src="images/about_image_2.jpg" alt="">
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="tab-set animated" data-animation="fadeInRight"
						data-animation-delay="1000">
						<ul class="tabs-titles">
							<li>模块任务</li>
							<li>模块价值</li>
							<li>模块目标</li>
						</ul>
						<div class="tab-content">
							<p>为用户提供即时的身体机能数值测量</p>
						</div>
						<div class="tab-content">
							<p>提供血糖，血压等数据测量和判断</p>
						</div>
						<div class="tab-content">
							<p>为用户身体机能数值正常保驾护航</p>
						</div>
					</div>

					<div class="accordion animated" data-animation="fadeInRight"
						data-animation-delay="1000">
						<div class="acc-item">
							<div class="acc-head current">模块分区</div>
							<div class="acc-content">
								<p>血糖血压血脂等数值测量</p>
							</div>
						</div>
						<div class="acc-item">
							<div class="acc-head">测量数值</div>
							<div class="acc-content">
								<p>提供各项数值测量的即时服务</p>
							</div>
						</div>

					</div>
				</div>
			</div>
		</div>
	</section>

	<section id="doctors" class="doctors section grey">
		<div class="container">
			<div class="row">
				<div class="section-title animated" data-animation="fadeInUp"
					data-animation-delay="700">
					<h2>
						<span class="extrabold">血压</span>检测
					</h2>
					<div class="section-title-line">
						<div class="section-title-icon">
							<img src="images/heart_icon.png" alt="">
						</div>
						<hr>
					</div>
				</div>
				<div class="col-md-4 col-sm-6">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="1000" style="float: left">
						<div class="doctor-face-outer">
							<img class="img-circle" src="images/gallery_img_1.jpg" alt="">
						</div>

					</div>
				</div>
				<div class="col-md-4 col-sm-10">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="2000">
						<h3>请输入您的血压</h3>
						<div class="form-group">
							<textarea tabindex="5" class="form-control" id="pre"
								name="your_message" id="your_message" rows="6"
								placeholder="正常值应在80-140之间"></textarea>
						</div>
						<div class="button">
							<input type="hidden" id="sendContac" name="sendContact"
								value="send" />
							<button tabindex="5" type="submit" name="submit" id="pre"
								onclick="pressure()">获取结果</button>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-sm-10">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="3000">
						<textarea tabindex="5" class="form-control" name="your_message"
							id="message1" rows="22" placeholder="检测结果"></textarea>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section id="doctors" class="doctors section grey">
		<div class="container">
			<div class="row">
				<div class="section-title animated" data-animation="fadeInUp"
					data-animation-delay="700">
					<h2>
						<span class="extrabold">血糖</span>检测
					</h2>
					<div class="section-title-line">
						<div class="section-title-icon">
							<img src="images/heart_icon.png" alt="">
						</div>
						<hr>
					</div>
				</div>
				<div class="col-md-4 col-sm-6">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="1000" style="float: left">
						<div class="doctor-face-outer">
							<img class="img-circle" src="images/doctor_img_1.jpg" alt="">
						</div>
						<h4>张医生</h4>
						<h6>主任医师</h6>
						<div class="button">
							<a href="">专业医生，在线咨询</a>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-sm-10">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="2000">
						<h3>请输入您的血糖</h3>
						<div class="form-group">
							<textarea tabindex="5" class="form-control" id="suger"
								name="your_message" id="your_message" rows="14"
								placeholder="正常值应在3.9-6.1之间"></textarea>
						</div>
						<div class="button">
							<input type="hidden" id="sendContac" name="sendContact"
								value="send" />
							<button tabindex="5" type="submit" name="submit" id="suger"
								onclick="suger()">获取结果</button>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-sm-10">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="3000">
						<textarea tabindex="5" class="form-control" name="your_message"
							id="message2" rows="22" placeholder="检测结果"></textarea>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section id="doctors" class="doctors section grey">
		<div class="container">
			<div class="row">
				<div class="section-title animated" data-animation="fadeInUp"
					data-animation-delay="700">
					<h2>
						<span class="extrabold">血脂</span>检测
					</h2>
					<div class="section-title-line">
						<div class="section-title-icon">
							<img src="images/heart_icon.png" alt="">
						</div>
						<hr>
					</div>
				</div>
				<div class="col-md-4 col-sm-6">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="1000" style="float: left">
						<div class="doctor-face-outer">
							<img class="img-circle" src="images/gallery_img_2.jpg" alt="">
						</div>

					</div>
				</div>
				<div class="col-md-4 col-sm-10">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="2000">
						<h3>请输入您的血脂</h3>
						<div class="form-group">
							<textarea tabindex="5" class="form-control" name="your_message"
								id="fat1" rows="1" placeholder="胆固醇：2.8-5.1"></textarea>
						</div>
						<div class="form-group">
							<textarea tabindex="5" class="form-control" name="your_message"
								id="fat2" rows="1" placeholder="甘油三脂：0.6-1.7"></textarea>
						</div>
						<div class="form-group">
							<textarea tabindex="5" class="form-control" name="your_message"
								id="fat3" rows="1" placeholder="胆固醇酯：2.8-5.1"></textarea>
						</div>
						<div class="button">
							<input type="hidden" id="sendContac" name="sendContact"
								value="send" />
							<button tabindex="5" type="submit" name="submit" id="submit"
								onclick="fat()">获取结果</button>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-sm-10">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="3000">
						<textarea tabindex="5" class="form-control" name="your_message"
							id="message3" rows="22" placeholder="检测结果"></textarea>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section id="doctors" class="doctors section grey">
		<div class="container">
			<div class="row">
				<div class="section-title animated" data-animation="fadeInUp"
					data-animation-delay="700">
					<h2>
						<span class="extrabold">身高体重</span>检测
					</h2>
					<div class="section-title-line">
						<div class="section-title-icon">
							<img src="images/heart_icon.png" alt="">
						</div>
						<hr>
					</div>
				</div>
				<div class="col-md-4 col-sm-6">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="1000" style="float: left">
						<div class="doctor-face-outer">
							<img src="images/gallery_img_3.jpg" alt="">
						</div>

					</div>
				</div>
				<div class="col-md-4 col-sm-10">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="2000">
						<h4>请输入您的身高</h4>
						<div class="form-group">
							<textarea tabindex="5" class="form-control" name="your_message"
								id="wh1" rows="1" placeholder="您的性别"></textarea>
						</div>
						<div class="form-group">
							<textarea tabindex="5" class="form-control" name="your_message"
								id="wh2" rows="1" placeholder="您的体重/kg"></textarea>
						</div>
						<div class="form-group">
							<textarea tabindex="5" class="form-control" name="your_message"
								id="wh3" rows="1" placeholder="您的身高/cm"></textarea>
						</div>
						<div class="button">
							<input type="hidden" id="sendContac" name="sendContact"
								value="send" />

							<button tabindex="5" type="submit" name="submit" id="submit"
								onclick="wh()">计算结果</button>
						</div>
					</div>
				</div>
				<div class="col-md-4 col-sm-10">
					<div class="doctor-face text-center animated" data-animation="tada"
						data-animation-delay="3000">
						<textarea tabindex="5" class="form-control" name="your_message"
							id="message4" rows="22" placeholder="检测结果"></textarea>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section id="contact" class="contact section grey">
		<div class="container">
			<div class="row">
				<div class="section-title animated" data-animation="fadeInUp"
					data-animation-delay="700">
					<h2>
						<span class="extrabold">联系</span> 我们
					</h2>
					<div class="section-title-line">
						<div class="section-title-icon">
							<img src="images/heart_icon.png" alt="">
						</div>
						<hr>
					</div>
				</div>


				<div class="col-sm-12">
					<ul class="contact-details">
						<li><i class="fa fa-map-marker"></i> HFUT_RJXY</li>
						<li><i class="fa fa-phone"></i> 123-456-78910</li>
						<li><i class="fa fa-envelope-o"></i> rjxy@hfut.com</li>
					</ul>
				</div>

			</div>
		</div>
	</section>


	<footer id="footer">
		<div class="footer-container">
			<ul class="socials">
				<li class="facebook"><a href="#" class="circle-icon"><i
						class="fa fa-facebook"></i></a></li>
				<li class="twitter"><a href="#" class="circle-icon"><i
						class="fa fa-twitter"></i></a></li>
				<li class="share-alt"><a href="#" class="circle-icon"><i
						class="fa fa-share-alt"></i></a></li>
			</ul>
			<ul class="footer-copyright">
				<li>本草纲目 <i class="fa fa-coffee"></i> Collect from <a
					href="http://www.cssmoban.com/" title="ç½é¡µæ¨¡æ¿"
					target="_blank">斛兵塘小组</a> - More Templates <a
					href="http://www.cssmoban.com/" target="_blank"
					title="æ¨¡æ¿ä¹å®¶"></a></li>
			</ul>
		</div>
	</footer>


	<script type="text/javascript" src="js/jquery-2.1.0.min.js?ver=1"></script>
	<script src="js/jquery.easing.js"></script>
	<script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
	<script type="text/javascript" src="js/jquery.tools.min.js"></script>
	<script type="text/javascript" src="js/owl.carousel.min.js"></script>
	<script type="text/javascript" src="js/jquery.nav.js"></script>
	<script type="text/javascript" src="js/jquery.scrollTo.js"></script>
	<script type="text/javascript" src="js/jquery.sticky.js"></script>
	<script type="text/javascript" src="js/jquery.appear.js"></script>
	<script type="text/javascript" src="js/responsiveslides.min.js"></script>
	<script type="text/javascript" src="js/verge.min.js"></script>
	<script type="text/javascript" src="js/custom.js"></script>
</body>

</html>