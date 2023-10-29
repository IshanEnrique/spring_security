<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" href="path-to-your-css-file.css">
<!-- Include your CSS file for styling -->
</head>
<body>
	<jsp:include page="header.jsp" />
	<div>
		<h2>Login</h2>
		<form action="login" method="post">
			<!-- Specify the action URL for form submission -->
			<div class="form-group">
				<label for="username">Username:</label> <input type="text"
					name="username" id="username" required>
			</div>
			<div class="form-group">
				<label for="password">Password:</label> <input type="password"
					name="password" id="password" required>
			</div>
			<button type="submit">Login</button>
		</form>
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>
