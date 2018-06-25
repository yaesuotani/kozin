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
					<p>あなた情報は無くなります</p>
					<p>本当に退会しますか？</p>
					<form:form action="delete" method="post"
						modelAttribute="deleteForm">
						<form class="form-horizontal">
							<div class="form-group">

								<label>あなたのID</label>
								<form:input path="userId" readonly="true" class="form-control"
									id="ID" placeholder="ID" />

							</div>
							<p>
								<button type="submit" class="btn btn-default">退会する</button>

								<button type="submit" class="btn btn-default"
									onclick="location.href='delete'; return false;">考えなおす</button>
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
