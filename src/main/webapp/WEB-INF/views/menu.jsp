<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:if test="${empty user}">
	<c:redirect url="/login" />
</c:if>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メニュー画面</title>
</head>
<body>
	<p>${fn:escapeXml(user.userNAME)}さん、こんにちは</p>
	<p>よろしくどうぞ</p>

	<p>
		<a href="select">登録情報表示</a>
	</p>
	<p>
		<a href="update">情報の登録及び更新</a>
	</p>
	<p>
		<a href="delete">退会</a>
	</p>
	<form action="logout" method="post">
		<input type="submit" value="ログアウト">
	</form>
</body>
</html>
