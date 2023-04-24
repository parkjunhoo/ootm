package com.ootm.controller.product;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "product-list-best-servlet", urlPatterns = { "/product/best" })
public class ProductListTopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setAttribute("product-best", "따로따로 불러온 데이터");
		
		RequestDispatcher rd = req.getRequestDispatcher("");
		rd.include(req, res);

	}


}
