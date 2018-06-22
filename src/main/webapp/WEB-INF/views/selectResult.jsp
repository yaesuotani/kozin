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
<title>登録情報一覧</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="table-responsive">
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
						<th>希望職種</th>
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
							<td>${fn:escapeXml(user.occupations)}</td>
							<td>${fn:escapeXml(user.industry)}</td>
							<td>${fn:escapeXml(user.work_location)}</td>
							<td>${fn:escapeXml(user.fight)}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div>
				<p>
					<a href="menu"><button type="button" class="btn btn-success btn-sm">メニューに戻る</button></a>
				</p>
			</div>
		</div>
	</div>
</body>
</html>
