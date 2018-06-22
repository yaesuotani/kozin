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
<title>更新内容入力画面</title>
<link href="/css/commons.css" rel="stylesheet">
</head>
<body>
<p>１箇所以上の項目を変更してください<br>
※IDは変更できません</p>

<c:if test="${not empty errmsg}">
  <p class="error">${fn:escapeXml(errmsg)}</p>
</c:if>

<form:form action="updateConfirm" method="post" modelAttribute="updateForm">
  <fieldset>
    <div>
      <label>ID</label><form:input path="userId" readonly="true" />
    </div>
    <div>
      <label>名前</label><form:input path="newName" />
    </div>
    <div>
      <label>TEL</label><form:input path="newTel" />
    </div>
    <div>
      <label>住所</label><form:input path="newlocation" />
    </div>
    <div>
      <label>学部</label><form:input path="newdepartment" />
    </div>
    <div>
      <label>資格</label><form:input path="newqualification" />
    </div>
    <div>
      <label>長所</label><form:input path="newmerit" />
    </div>
    <div>
      <label>短所</label><form:input path="newdemerit" />
    </div>
    <div>
      <label>希望職種</label><form:input path="newoccupation" />
    </div>
    <div>
      <label>希望業種</label><form:input path="newindustry" />
    </div>
    <div>
      <label>希望勤務地</label><form:input path="newwork_location" />
    </div>
    <div>
      <label>これからやりたいこと</label><form:input path="newfigh" />
    </div>
  </fieldset>
  <div>
    <input type="submit" name="button" value="確認">
    <input type="submit" name="button" value="戻る" onclick="location.href='update'; return false;">
  </div>
</form:form>
<div>
  <a href="menu">メニューに戻る</a>
</div>
</body>
</html>
