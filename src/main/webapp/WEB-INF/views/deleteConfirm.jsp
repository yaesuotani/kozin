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
<title>削除確認画面</title>
<link href="/css/commons.css" rel="stylesheet">
</head>
<body>
<p>あなた情報は無くなります</p>
<p>本当に退会しますか？</p>
<form:form action="delete" method="post" modelAttribute="deleteForm">
  <fieldset>
    <div>
      <label>ID</label><form:input path="userId" readonly="true" />
    </div>
    <div>
    </div>
  </fieldset>
  <div>
    <input type="submit" name="button" value="退会する">
    <input type="submit" name="button" value="もう一度考えなす" onclick="location.href='delete'; return false;">
  </div>
</form:form>

</body>
</html>
