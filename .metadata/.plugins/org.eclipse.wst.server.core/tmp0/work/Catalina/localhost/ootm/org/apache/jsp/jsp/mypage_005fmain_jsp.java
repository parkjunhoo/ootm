/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-23 15:12:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypage_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>마이페이지 메인</title>\r\n");
      out.write("<!-- 글꼴 -->\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"icon\" href=\"/ootm/images/favicon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/all.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"/ootm/component/header/header.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"/ootm/component/footer/footer.css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("/* 네비게이터 박스 css */\r\n");
      out.write(".page-container {\r\n");
      out.write("	margin-top: 80px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation {\r\n");
      out.write("	float: left;\r\n");
      out.write("	margin-top: 52px;\r\n");
      out.write("	width: 250px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation ul li {\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	padding-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation ul li a {\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation ul .current {\r\n");
      out.write("	font-weight: 700;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-navigation li a:after {\r\n");
      out.write("	background-color: #222;\r\n");
      out.write("	content: '';\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	bottom: -5px;\r\n");
      out.write("	left: 0;\r\n");
      out.write("	width: 0;\r\n");
      out.write("	height: 1px;\r\n");
      out.write("	transition: width 0.25s ease-out;\r\n");
      out.write("}\r\n");
      out.write(".page-navigation li a:hover:after {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 컨텐츠 박스 */\r\n");
      out.write(".page-content {\r\n");
      out.write("	float: right;\r\n");
      out.write("	width: calc(100% - 250px);\r\n");
      out.write("	min-height: 40vh;\r\n");
      out.write("}\r\n");
      out.write(".page-content .section-title {\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("    border-top: 2px solid #222;\r\n");
      out.write("    padding-top: 50px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write("h4{\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write(".account-menu {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 55px;\r\n");
      out.write("    right: 0;\r\n");
      out.write("}\r\n");
      out.write(".account-menu a {\r\n");
      out.write("    font-weight: 500;\r\n");
      out.write("    margin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write(".page-content .section {\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write(".account-summary {\r\n");
      out.write("    display: flex;\r\n");
      out.write("}\r\n");
      out.write(".account-summary .item {\r\n");
      out.write("    flex: auto;\r\n");
      out.write("}\r\n");
      out.write(".account-summary .item .label {\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write(".account-summary .item .label a:after {\r\n");
      out.write("    content: '>>';\r\n");
      out.write("    font-family: 'Ionicons';\r\n");
      out.write("    font-weight: 900;\r\n");
      out.write("    margin-left: 5px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".account-summary .item .value {\r\n");
      out.write("	font-size: 28px;\r\n");
      out.write("	font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write(".account-summary .membership-grade .value {\r\n");
      out.write("	font-size: 32px;\r\n");
      out.write("	font-weight: 700;\r\n");
      out.write("	color: #c0c4c4;\r\n");
      out.write("	position: relative;\r\n");
      out.write("	top: -3px;\r\n");
      out.write("}\r\n");
      out.write(".page-content .info-list {\r\n");
      out.write("    margin-top: 50px;\r\n");
      out.write("}\r\n");
      out.write(".page-content .info-list li {\r\n");
      out.write("    padding-left: 12px;\r\n");
      out.write("    padding-bottom: 5px;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    line-height: 1.65;\r\n");
      out.write("}\r\n");
      out.write(".info-list li:before {\r\n");
      out.write("    content: '\\00b7';\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: -7px;\r\n");
      out.write("    left: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 주문내역이 없습니다. */\r\n");
      out.write(".page-content .section {\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write(".empty-list {\r\n");
      out.write("    border-top: 1px solid #dcdcdc;\r\n");
      out.write("    padding-top: 50px;\r\n");
      out.write("    font-size: 15px;\r\n");
      out.write("    color: #aaa;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 푸터고정 */\r\n");
      out.write(".footer{\r\n");
      out.write("	clear: both;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"header\">\r\n");
      out.write("		<header-component logoDark=\"true\" logoHoverDark=\"true\"\r\n");
      out.write("			mTextColor=\"black\" bgHoverColor=\"#F9F9F9\" menuBtnColor=\"black\"></header-component>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"all-margin\">\r\n");
      out.write("		<div class=\"page-header\">\r\n");
      out.write("			<h2>My Page</h2>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"page-container mypage\" data-page-title=\"orders\">\r\n");
      out.write("			<!-- 왼쪽 -->\r\n");
      out.write("			<div class=\"page-navigation\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li data-page-target=\"dashboard\" class=\"current\"><a href=\"./mypage_main.jsp\">마이페이지</a></li>\r\n");
      out.write("					<li data-page-target=\"orders\"><a href=\"./mypage_orderlist.jsp\">주문내역</a></li>\r\n");
      out.write("					<li data-page-target=\"wishlist\"><a href=\"./mypage_wishlist.jsp\">위시리스트</a></li>\r\n");
      out.write("					<li data-page-target=\"coupons\"><a href=\"./mypage_coupon.jsp\">쿠폰</a></li>\r\n");
      out.write("					<li data-page-target=\"points\"><a href=\"./mypage_reserve.jsp\">적립금</a></li>\r\n");
      out.write("					<li data-page-target=\"balance\"><a href=\"./mypage_deposit.jsp\">예치금</a></li>\r\n");
      out.write("					<li data-page-target=\"support\"><a href=\"./mypage_inquiry.jsp\">문의내역</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"page-content\">\r\n");
      out.write("				<!-- 첫번째 박스 -->\r\n");
      out.write("				<div class=\"section-title\">\r\n");
      out.write("					<h4>???님 안녕하세요!</h4>\r\n");
      out.write("					<div class=\"account-menu\">\r\n");
      out.write("						<a href=\"\">회원정보수정</a> <a href=\"\">로그아웃</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"section\">\r\n");
      out.write("					<div class=\"account-summary\">\r\n");
      out.write("						<div class=\"item membership-grade\">\r\n");
      out.write("							<div class=\"label\">\r\n");
      out.write("								<a href=\"#\">등급</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"value\" data-member-grade=\"\">Group</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"item\">\r\n");
      out.write("							<div class=\"label\">\r\n");
      out.write("								<a href=\"#\">쿠폰</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"value\">0장</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"item\">\r\n");
      out.write("							<div class=\"label\">\r\n");
      out.write("								<a href=\"#\">적립금</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"value\">2000원</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"item\">\r\n");
      out.write("							<div class=\"label\">\r\n");
      out.write("								<a href=\"#\">예치금</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"value\">0원</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"item\">\r\n");
      out.write("							<div class=\"label\">\r\n");
      out.write("								<a href=\"#\">누적주문금액</a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"value\">0원</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"info-list\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li>평생회원 전환으로 Lifetime 등급이 되면 더 많은 혜택을 받으실 수 있습니다.</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"section-title\">\r\n");
      out.write("					<h4>최근 주문</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"section page-list order-list\">\r\n");
      out.write("					<div class=\"empty-list\">주문내역이 없습니다.</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"section-title\">\r\n");
      out.write("					<h4>오늘 본 상품</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"section recommendations\">\r\n");
      out.write("					<div class=\"product-list\"></div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		<footer-component />\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"/ootm/component/header/header.js\"></script>\r\n");
      out.write("	<script src=\"/ootm/component/footer/footer.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
