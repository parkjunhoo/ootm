/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-23 13:27:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypage_005freserve_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>적립금 내역</title>\r\n");
      out.write("<link rel=\"icon\" href=\"/ootm/images/favicon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/all.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"/ootm/component/header/header.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"/ootm/component/footer/footer.css\" />\r\n");
      out.write("<style type=\"text/css\">\r\n");
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
      out.write("\r\n");
      out.write(".page-navigation li a:hover:after {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("/* 컨텐츠 박스 */\r\n");
      out.write(".page-content {\r\n");
      out.write("	float: right;\r\n");
      out.write("	width: calc(100% - 250px);\r\n");
      out.write("	min-height: 40vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-content .section-title {\r\n");
      out.write("	margin-top: 0;\r\n");
      out.write("	margin-bottom: 50px;\r\n");
      out.write("	border-top: 2px solid #222;\r\n");
      out.write("	padding-top: 50px;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("h4 {\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write(".page-content .section {\r\n");
      out.write("    margin-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".page-list .list-row {\r\n");
      out.write("    border-bottom: 1px solid #dcdcdc;\r\n");
      out.write("    padding: 20px 0;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write(".page-list .list-header {\r\n");
      out.write("    padding-top: 0;\r\n");
      out.write("}\r\n");
      out.write(".point-list .list-row .date, .point-list .list-row .balance {\r\n");
      out.write("    width: 15%;\r\n");
      out.write("}\r\n");
      out.write(".point-list .list-row .detail {\r\n");
      out.write("    width: 70%;\r\n");
      out.write("}\r\n");
      out.write(".page-list .list-row:before, .page-list .list-row:after {\r\n");
      out.write("    content: '';\r\n");
      out.write("    display: table;\r\n");
      out.write("}\r\n");
      out.write(".page-list .list-row:after {\r\n");
      out.write("    clear: both;\r\n");
      out.write("}\r\n");
      out.write(".page-list .list-row .item {\r\n");
      out.write("    float: left;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write(".page-list .list-header .item {\r\n");
      out.write("    font-weight: 400;\r\n");
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
      out.write("/* 푸터고정 */\r\n");
      out.write(".footer{\r\n");
      out.write("	clear: both;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("		<header-component logoDark=\"true\" logoHoverDark=\"true\"\r\n");
      out.write("			mTextColor=\"black\" bgHoverColor=\"#F9F9F9\"></header-component>\r\n");
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
      out.write("					<li data-page-target=\"dashboard\"><a\r\n");
      out.write("						href=\"./mypage_main.jsp\">마이페이지</a></li>\r\n");
      out.write("					<li data-page-target=\"orders\"><a href=\"./mypage_orderlist.jsp\">주문내역</a></li>\r\n");
      out.write("					<li data-page-target=\"wishlist\"><a\r\n");
      out.write("						href=\"./mypage_wishlist.jsp\">위시리스트</a></li>\r\n");
      out.write("					<li data-page-target=\"coupons\"><a href=\"./mypage_coupon.jsp\">쿠폰</a></li>\r\n");
      out.write("					<li data-page-target=\"points\" class=\"current\"><a href=\"./mypage_reserve.jsp\">적립금</a></li>\r\n");
      out.write("					<li data-page-target=\"balance\"><a href=\"./mypage_deposit.jsp\">예치금</a></li>\r\n");
      out.write("					<li data-page-target=\"support\"><a href=\"./mypage_inquiry.jsp\">문의내역</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"page-content\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"section-title\">\r\n");
      out.write("					<h4>현재 보유중인 적립금은 2,900원 입니다.</h4>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div class=\"section page-list point-list\">\r\n");
      out.write("					<div class=\"list-header list-row\">\r\n");
      out.write("						<div class=\"item date\">변경일자</div>\r\n");
      out.write("						<div class=\"item detail\">내역</div>\r\n");
      out.write("						<div class=\"item balance\">적립금</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"list-row\">\r\n");
      out.write("						<div class=\"item date\">2023-04-13</div>\r\n");
      out.write("						<div class=\"item detail\">가입축하금입니다.</div>\r\n");
      out.write("						<div class=\"item balance\">2,000원</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"info-list\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li>상품 구매 적립금은 배송 완료 후 자동으로 적립됩니다.</li>\r\n");
      out.write("							<li>보유하신 적립금이 1,000원 이상일 경우, 5,000원 이상 주문 시 현금과 동일하게 사용하실 수\r\n");
      out.write("								있습니다.</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		<footer-component />\r\n");
      out.write("	</div>\r\n");
      out.write("	<script src=\"../component/header/header.js\"></script>\r\n");
      out.write("	<script src=\"../component/footer/footer.js\"></script>\r\n");
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
