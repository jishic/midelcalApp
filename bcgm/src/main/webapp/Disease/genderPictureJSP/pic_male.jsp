<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>male</title>
<link href="../css/common.css" rel="stylesheet">

</head>
<body>
	<img class="img-responsive" alt="男" usemap="#malemap"
		src="diseaseImage/male1280.png" />
	<map name="malemap" id="malemap">
	    <form name="picForm1" action="SymptomSelection" method="post" role="form">
		<input type="hidden" name="diseasePosition" value="wholebody"/>
		<a href="javascript:picForm1.submit();"><area shape="poly" coords="310,5,310,90,370,90,370,5" alt="头部及周身"/></a>
		</form>
		<form name="picForm2" action="SymptomSelection" method="post" role="form">
		<input type="hidden" name="diseasePosition" value="wholebody"/>
		<a href="javascript:picForm2.submit();"><area shape="poly" coords="780,5,780,90,840,90,840,5" alt="头部及周身"/></a>
		</form>
		
		<form name="picForm3" action="SymptomSelection" method="post" role="form">
		<input type="hidden" name="diseasePosition" value="arm"/>
		<a href="javascript:picForm3.submit();"><area shape="poly" coords="220,100,220,350,300,350,300,100" alt="手部"/></a>
		</form>
		<form name="picForm4" action="SymptomSelection" method="post" role="form">
		<input type="hidden" name="diseasePosition" value="arm"/>
		<a href="javascript:picForm4.submit();"><area shape="poly" coords="680,100,680,350,750,350,750,100" alt="手部"/></a>
		</form>
		<form name="picForm5" action="SymptomSelection" method="post" role="form">
		<input type="hidden" name="diseasePosition" value="arm"/>
		<a href="javascript:picForm5.submit();"><area shape="poly" coords="860,100,860,350,930,350,930,100" alt="手部"/></a>
		</form>
		
		<form name="picForm6" action="SymptomSelection" method="post" role="form">
		<input type="hidden" name="diseasePosition" value="chest"/>
		<a href="javascript:picForm6.submit();"><area shape="poly" coords="311,100,311,190,410,190,410,100" alt="胸部"/></a>
		</form>
		
		<form name="picForm7" action="SymptomSelection" method="post" role="form">
		<input type="hidden" name="diseasePosition" value="belly"/>
		<a href="javascript:picForm7.submit();"><area shape="poly" coords="311,191,311,291,410,291,410,191" alt="腹部"/></a>
		</form>
		
		<form name="picForm8" action="SymptomSelection" method="post" role="form">
		<input type="hidden" name="diseasePosition" value="back"/>
		<a href="javascript:picForm8.submit();"><area shape="poly" coords="730,100,730,291,890,291,890,100" alt="背部"/></a>
		</form>
		
		<form name="picForm9" action="SymptomSelection" method="post" role="form">
		<input type="hidden" name="diseasePosition" value="leg"/>
		<a href="javascript:picForm9.submit();"><area shape="poly" coords="280,301,280,600,440,600,440,301" alt="腿部"/></a>
		</form>
		<form name="picForm10" action="SymptomSelection" method="post" role="form">
		<input type="hidden" name="diseasePosition" value="leg"/>
		<a href="javascript:picForm10.submit();"><area shape="poly" coords="750,301,750,600,910,600,910,301" alt="腿部"/></a>
		</form>
	</map>
</body>
	<script type="text/javascript">	  
        adjust();  
        var timeout = null;//onresize触发次数过多，设置定时器  
        window.onresize = function () {  
            clearTimeout(timeout);  
            timeout = setTimeout(function () { window.location.reload(); }, 100);//页面大小变化，重新加载页面以刷新MAP  
        }
        //获取MAP中元素属性  
        function adjust() {  
            var map = document.getElementById("CribMap");  
            var element = map.childNodes;  
            var itemNumber = element.length / 2;  
            for (var i = 0; i < itemNumber - 1; i++) {  
                var item = 2 * i + 1;  
                var oldCoords = element[item].coords;  
                var newcoords = adjustPosition(oldCoords);  
                element[item].setAttribute("coords", newcoords);  
            }  
            var test = element;  
        }  
        //调整MAP中坐标  
        function adjustPosition(position) {  
            var pageWidth = document.body.clientWidth;//获取页面宽度  
            var pageHeith = document.body.clientHeight;//获取页面高度  
  
            var imageWidth = 1160;<span style="white-space:pre">    </span>//图片的长宽  
            var imageHeigth = 990;  
  
            var each = position.split(",");  
            //获取每个坐标点  
            for (var i = 0; i < each.length; i++) {  
                each[i] = Math.round(parseInt(each[i]) * pageWidth / imageWidth).toString();//x坐标  
                i++;  
                each[i] = Math.round(parseInt(each[i]) * pageHeith / imageHeigth).toString();//y坐标  
            }  
            //生成新的坐标点  
            var newPosition = "";  
            for (var i = 0; i < each.length; i++) {  
                newPosition += each[i];  
                if (i < each.length - 1) {  
                    newPosition += ",";  
                }  
            }  
            return newPosition;  
        }  
	</script>
</html>