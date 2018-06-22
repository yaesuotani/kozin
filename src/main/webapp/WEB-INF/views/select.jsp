<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索画面</title>
<link href="/css/commons.css" rel="stylesheet">
</head>
<body>
	<p>あなたのIDと名前を入力してね</p>

	<c:if test="${not empty errmsg}">
		<p class="error">${fn:escapeXml(errmsg)}</p>
	</c:if>

	<form:form action="list" modelAttribute="selectForm">
		<div>
			<label>ID</label>
			<form:input path="userId" />
		</div>
		<div>
			<label>名前</label>
			<form:input path="name" />
		</div>
		<input type="submit" value="検索">
	</form:form>
	<div>
		<a href="menu">ユーザーメニューに戻る</a>
	</div>
</body>
</html>
