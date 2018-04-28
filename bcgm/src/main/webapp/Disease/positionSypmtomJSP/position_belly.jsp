<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>position_belly</title>
<link href="../../css/common.css" rel="stylesheet">
</head>
<body>
	<ul class="demo" >
		<c:forEach var="" items="${list}">
            <li>Lorem ipsum dolor sit amet</li>
		</c:forEach>
		<li style="pointer-events: none;">Lorem ipsum dolor sit amet</li>
		<li style="pointer-events: none;">Lorem ipsum dolor sit amet</li>
		<li style="pointer-events: none;">Lorem ipsum dolor sit amet</li>
		<li style="pointer-events: none;">Lorem ipsum dolor sit amet</li>
		<li style="pointer-events: none;">Lorem ipsum dolor sit amet</li>
		<li style="pointer-events: none;">Lorem ipsum dolor sit amet</li>
		<li style="pointer-events: none;">Lorem ipsum dolor sit amet</li>
		<li style="pointer-events: none;">Lorem ipsum dolor sit amet</li>
		<li style="pointer-events: none;">Lorem ipsum dolor sit amet</li>
		<li style="pointer-events: none;">Lorem ipsum dolor sit amet</li>
	</ul>
</body>
<script type="text/javascript">
$(document).ready(function (){
    $(".demo").simsCheckbox({
    		"checkedClass":'btn-info'
    });
});
</script>
</html>