<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Balance Page</title>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div>
		<div class="jumbotron">
			<h1 class="display-4">
				Your current A/C balance is : <span class="alert alert-primary">$2652500</span>
			</h1>
			<p class="lead">This is a simple example of a home page using
				Bootstrap in a JSP.</p>
			<a href="/" class="btn btn-primary btn-lg">Home</a>
		</div>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>