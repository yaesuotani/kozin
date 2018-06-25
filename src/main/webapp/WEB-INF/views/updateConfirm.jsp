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

					<p>
						この内容で変更します<br> よろしいですか？
					</p>

					<form:form action="update" method="post"
						modelAttribute="updateForm">
						<legend>変更後</legend>

						<div class="form-group">
							<label>ID</label>
							<form:input path="userId" readonly="true" class="form-control"
								id="ID" placeholder="ID" />
						</div>
						<div class="form-group">
							<label>名前</label>
							<form:input path="newName" readonly="true" class="form-control"
								id="name" placeholder="名前" />
						</div>
						<div class="form-group">
							<label>TEL</label>
							<form:input path="newTel" readonly="true" class="form-control"
								id="tel" placeholder="TEL" />
						</div>
						<div class="form-group">
							<label>住所</label>
							<form:input path="newlocation" readonly="true"
								class="form-control" id="lo" placeholder="住所" />
						</div>
						<div class="form-group">
							<label>学部</label>
							<form:input path="newdepartment" readonly="true"
								class="form-control" id="ga" placeholder="学部" />
						</div>
						<div class="form-group">
							<label>資格</label>
							<form:input path="newqualification" readonly="true"
								class="form-control" id="si" placeholder="資格" />
						</div>
						<div class="form-group">
							<label>長所</label>
							<form:input path="newmerit" readonly="true" class="form-control"
								id="me" placeholder="長所" />
						</div>
						<div class="form-group">
							<label>短所</label>
							<form:input path="newdemerit" readonly="true"
								class="form-control" id="dm" placeholder="短所" />
						</div>

						<div class="form-group">
							<label>希望業種</label>
							<form:input path="newindustry" readonly="true"
								class="form-control" id="gy" placeholder="希望業種" />
						</div>
						<div class="form-group">
							<label>希望勤務地</label>
							<form:input path="newwork_location" readonly="true"
								class="form-control" id="wl" placeholder="希望勤務地" />
						</div>
						<div class="form-group">
							<label>これからやりたいこと</label>
							<form:input path="newfight" readonly="true" class="form-control"
								id="ya" placeholder="これからやりたいこと" />
						</div>

						<div>
							<p>
								<button type="submit" class="btn btn-default">変更</button>
								<button type="submit" class="btn btn-default"
									onclick="location.href='updateInputBack'; return false;">戻る</button>
							</p>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
	<div id="footer"></div>
	<script src="assets/js/bootstrap.min.js"></script>
</body>
</html>
