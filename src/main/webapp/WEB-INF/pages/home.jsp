<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>Spring Security Home Page</title>
</head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.home-cards-p {
	min-height: 5rem;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp" />

	<div>
		<div class="jumbotron">
			<h1 class="display-4">Welcome to Our EasyBank</h1>
			<p class="lead">Your Trusted Banking Partner</p>
			<p>At EasyBank, we're committed to providing you with a secure
				and convenient banking experience. Whether you're saving for the
				future, managing your investments, or planning for a big purchase,
				we're here to help you achieve your financial goals.</p>
			<hr class="my-4">
			<p>Explore our banking services and take advantage of our digital
				tools to simplify your financial life. You can access your accounts,
				make transactions, and track your investments with ease.</p>
			<a class="btn btn-primary btn-lg" href="#" role="button">Learn
				More</a>
		</div>

		<div class="row">
			<div class="col-md-4">
				<div class="card">
					<img src="/images/saving-account.jpg" class="card-img-top"
						alt="Savings Account">
					<div class="card-body">
						<h5 class="card-title">Savings Account</h5>
						<p class="card-text home-cards-p">Start saving for your goals
							with our competitive savings account options.</p>
						<a href="#" class="btn btn-primary">Open Account</a>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card">
					<img src="/images/loans.jpg" class="card-img-top"
						alt="Loan Services">
					<div class="card-body">
						<h5 class="card-title">Loan Services</h5>
						<p class="card-text home-cards-p">Need financial assistance?
							Explore our range of loan products tailored to your needs.</p>
						<a href="#" class="btn btn-primary">Apply Now</a>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="card">
					<img src="/images/mobile-banking.jpg" class="card-img-top"
						alt="Mobile Banking">
					<div class="card-body">
						<h5 class="card-title">Mobile Banking</h5>
						<p class="card-text home-cards-p">Bank on the go with our
							mobile banking app. Manage your accounts anytime, anywhere.</p>
						<a href="#" class="btn btn-primary">Get Started</a>
					</div>
				</div>
			</div>
		</div>
	</div>



	<jsp:include page="footer.jsp" />
</body>
</html>