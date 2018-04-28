<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>position_wholebody</title>
<link href="../../css/common.css" rel="stylesheet">
</head>
<body>
	<ul class="demo" >
       <c:forEach var="blurDisease" items="${blurDisease}">
			<li>
	            <form action="selectName" method="post" role="form">
					<input type="hidden" name="DiseaseName" value="${blurDisease}"/><td style="text-align: center;">${blurDisease}<button type="submit" class="btn btn-info" style="margin-left: 5%;">查看详情</button></td>
				</form>
			</li>
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
	<!-- 
	<table class="table table-hover" style="font-size: 200%;">
		<tbody>
			<tr>
				<td><input type="checkbox" name="cb" id="checkbox1"
					value="love"> <label for="checkbox1" class="font-bolder">
						1111111111111 </label></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="cb" id="checkbox2"
					value="love"> <label for="checkbox2" class="font-bolder">
						11111111111111111 </label></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="cb" id="checkbox3"
					value="love"> <label for="checkbox3" class="font-bolder">
						111111111111111111 </label></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="cb" id="checkbox4"
					value="love"> <label for="checkbox4" class="font-bolder">
						111111111111111111 </label></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="cb" id="checkbox5"
					value="love"> <label for="checkbox5" class="font-bolder">
						111111111111111111 </label></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="cb" id="checkbox6"
					value="love"> <label for="checkbox6" class="font-bolder">
						111111111111111111 </label></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="cb" id="checkbox7"
					value="love"> <label for="checkbox7" class="font-bolder">
						111111111111111111 </label></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="cb" id="checkbox8"
					value="love"> <label for="checkbox8" class="font-bolder">
						111111111111111111 </label></td>
			</tr>
			<tr>
				<td><input type="checkbox" name="cb" id="checkbox9"
					value="love"> <label for="checkbox9" class="font-bolder">
						111111111111111111 </label></td>
			</tr>
		</tbody>
	</table>
	 -->
</body>
<script type="text/javascript">
$(document).ready(function (){
    $(".demo").simsCheckbox({
    		"checkedClass":'btn-info'
    });
});
</script>
</html>