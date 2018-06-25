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
			<div class="table-responsive">
				<p>現在のあなたの情報を表示します</p>
				<table class="table table-striped table-bordered">
					<caption>登録情報</caption>
					<thead>
						<tr>
							<th>ID</th>
							<th>名前</th>
							<th>電話番号</th>
							<th>住所</th>
							<th>学部</th>
							<th>資格</th>
							<th>長所</th>
							<th>短所</th>
							<th>希望業種</th>
							<th>希望勤務地</th>
							<th>これからやりたいこと</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${userlist}" var="user">
							<tr>
								<th scope="row">${fn:escapeXml(user.userId)}</th>
								<td>${fn:escapeXml(user.userName)}</td>
								<td>${fn:escapeXml(user.telephone)}</td>
								<td>${fn:escapeXml(user.location)}</td>
								<td>${fn:escapeXml(user.department)}</td>
								<td>${fn:escapeXml(user.qualification)}</td>
								<td>${fn:escapeXml(user.merit)}</td>
								<td>${fn:escapeXml(user.demerit)}</td>
								<td>${fn:escapeXml(user.industry)}</td>
								<td>${fn:escapeXml(user.work_location)}</td>
								<td>${fn:escapeXml(user.fight)}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

			</div>
			<br> <br>
			<div>
				<p>
					<a href="menu"><button type="button"
							class="btn btn-default">メニューに戻る</button></a>
				</p>
			</div>
		</div>
	</div>

	<div id="footer"></div>
	<script src="assets/js/bootstrap.min.js"></script>
</body>
</html>
