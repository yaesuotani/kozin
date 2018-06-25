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
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="assets/img/iconimg.png">

<title>CopyLog</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/bootstrap.css" rel="stylesheet">
<link href="assets/css/bootstrap.css" rel="stylesheet">
<link href="assets/css/main.css" rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="assets/js/hover.zoom.js"></script>
<script src="assets/js/hover.zoom.conf.js"></script>
</head>
<body>
	<div class="navbar navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index">CopyLog</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<li><a href="login">ログイン</a></li>
					<li><a href="menu">メニュー</a></li>
					<li><a href="help">このサイトの説明</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="ww">
		<div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2 centered">
					<p>現在のあなたの情報を表示するよ</p>
					<p>
						あなたのIDと名前を入力してください<br>
						入力しないと表示できません
					</p>

					<c:if test="${not empty errmsg}">
						<p class="error">${fn:escapeXml(errmsg)}</p>
					</c:if>

					<form:form action="list" modelAttribute="selectForm">
						<form class="form-horizontal">
							<div class="form-group">
								<label>ID</label>
								<form:input path="userId" class="form-control" id="ID"
									placeholder="ID" />
							</div>
							<div class="form-group">
								<label>名前</label>
								<form:input path="name" class="form-control" id="name"
									placeholder="name" />
							</div>
							<p>
								<button type="submit" class="btn btn-default">表示</button>
							</p>
						</form>
					</form:form>

				</div>
			</div>
		</div>
	</div>

	<div id="footer"></div>
	<script src="assets/js/bootstrap.min.js"></script>
</body>
</html>
