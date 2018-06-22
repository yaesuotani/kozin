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
<title>新規会員登録</title>
</head>
<body>
	<p>
		登録情報を入力してください<br> <span class="required"></span>
	</p>

	<c:if test="${not empty errmsg}">
		<p class="error">${fn:escapeXml(errmsg)}</p>
	</c:if>

	<form:form action="registerConfirm" method="post"
		modelAttribute="registerForm">
		<div>
			<label>ID</label>
			<form:input path="userId" />
		</div>
		<div>
			<label>お名前</label>
			<form:input path="name" />
		</div>
		<div>
			<label>パスワード</label>
			<form:password path="password" showPassword="true" />
		</div>
		<input type="submit" value="確認">
	</form:form>
	<div>
		<a href="index">TOP PAGEに戻る</a>
	</div>
</body>
</html>
