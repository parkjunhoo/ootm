<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="icon" href="/ootm/images/favicon.ico">
<link rel="stylesheet" href="../css/all.css" />
<link rel="stylesheet" type="text/css"
	href="/ootm/component/header/header.css" />
<link rel="stylesheet" type="text/css"
	href="/ootm/component/footer/footer.css" />
<style type="text/css">
/* 네비게이터 박스 css */
.page-container {
	margin-top: 80px;
}

.page-navigation {
	float: left;
	margin-top: 52px;
	width: 250px;
}

.page-navigation ul li {
	font-size: 16px;
	padding-bottom: 15px;
}

.page-navigation ul li a {
	position: relative;
}

.page-navigation ul .current {
	font-weight: 700;
}

.page-navigation li a:after {
	background-color: #222;
	content: '';
	position: absolute;
	bottom: -5px;
	left: 0;
	width: 0;
	height: 1px;
	transition: width 0.25s ease-out;
}

.page-navigation li a:hover:after {
	width: 100%;
}

/* 컨텐츠 박스 */
.page-content {
	float: right;
	width: calc(100% - 250px);
	min-height: 40vh;
}

.page-content .section-title {
	margin-top: 0;
	margin-bottom: 50px;
	border-top: 2px solid #222;
	padding-top: 50px;
	position: relative;
}

h4 {
	font-size: 18px;
}
/* 주문내역이 없습니다. */
.page-content .section {
	margin-bottom: 50px;
}

.empty-list {
	border-top: 1px solid #dcdcdc;
	padding-top: 50px;
	font-size: 15px;
	color: #aaa;
}

/* 푸터고정 */
.footer {
	clear: both;
}
</style>
</head>
<body>
		<header-component logoDark="true" logoHoverDark="true"
			mTextColor="black" bgHoverColor="#F9F9F9"></header-component>

	<div class="all-margin">
		<div class="page-header">
			<h2>My Page</h2>
		</div>

		<div class="page-container mypage" data-page-title="orders">
			<!-- 왼쪽 -->
			<div class="page-navigation">
				<ul>
					<li data-page-target="dashboard"><a href="./mypage_main.jsp">마이페이지</a></li>
					<li data-page-target="orders"><a href="./mypage_orderlist.jsp">주문내역</a></li>
					<li data-page-target="wishlist"><a
						href="./mypage_wishlist.jsp">위시리스트</a></li>
					<li data-page-target="coupons"><a href="./mypage_coupon.jsp">쿠폰</a></li>
					<li data-page-target="points"><a href="./mypage_reserve.jsp">적립금</a></li>
					<li data-page-target="balance"><a href="./mypage_deposit.jsp">예치금</a></li>
					<li data-page-target="support" class="current"><a
						href="./mypage_inquiry.jsp">문의내역</a></li>
				</ul>
			</div>
			<div class="page-content">
				<div class="section-title">
					<h4>서소영님의 문의 내역입니다.</h4>
				</div>

				<div class="section page-list table-list">
					<div class="empty-list">문의 내역이 없습니다.</div>
				</div>
			</div>
		</div>
	</div>
	<div class="footer">
		<footer-component />
	</div>
	<script src="/ootm/component/header/header.js"></script>
	<script src="/ootm/component/footer/footer.js"></script>
</body>
</html>