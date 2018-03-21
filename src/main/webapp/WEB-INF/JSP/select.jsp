<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 查询 -->
	<form action="select" method="post">
		BM:<select name="dept.did">
			<option value="">--qqqq--</option>
			<c:forEach items="${dl}" var="dept">
				<option value="${dept['did']}"
					${empBack.dept.did==dept.did?"selected":"" }>${dept.dname}</option>
			</c:forEach>
		</select> XM:<input type="text" value="${empBack.ename}" name="ename">
		<input type="submit" value="查询">
	</form>
	<!-- 添加 -->
	<form action="insert" method="post">
		XM:<input type="text" name="ename"> BM:<select name="did">
			<option value="">--kkkk--</option>
			<c:forEach items="${dl}" var="d">
				<option value="${d['did']}">${d.dname}</option>
			</c:forEach>
		</select> <input type="submit" value="添加">
	</form>
	<table cellspacing="0">
		<tr>
			<td>id</td>
			<td>姓名</td>
			<td>部门</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${el}" var="e">
			<tr>
				<td>${e.eid}</td>
				<td>${e.ename}</td>
				<td>${e.dept.dname}</td>
				<td><a href="delete?eid=${e.eid}">删除</a></td>
				<td><a href="update?eid=${e.eid}">修改</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>