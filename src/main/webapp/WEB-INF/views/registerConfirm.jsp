<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録確認画面</title>
</head>
<body>
<p>この内容で会員登録いたしますか？</p>

<c:if test="${not empty errmsg}">
  <p class="error">${fn:escapeXml(errmsg)}</p>
</c:if>

<form:form action="register" method="post" modelAttribute="registerForm">
    <div>
      <label>ID</label><form:input path="userId" readonly="true" />
    </div>
    <div>
      <label>お名前</label><form:input path="name" readonly="true" />
    </div>
    <div>
      <label>パスワード(再入力)</label><form:password path="confirmPassword" />
    </div>
  <div>
    <input type="submit" name="button" value="登録">
    <input type="submit" name="button" value="戻る" onclick="location.href='registerBack'; return false;">
  </div>
</form:form>
<div>
  <a href="menu">メニューに戻る</a>
</div>
</body>
</html>
