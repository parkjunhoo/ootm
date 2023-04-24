package com.ootm.controller.headerMenu;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ootm.dao.headerMenu.HeaderMenuDAOImpl;
import com.ootm.dao.headerMenu.HeaderMenuDTO;

@WebServlet(name = "select" , urlPatterns = "/select")
public class HeaderMenuSelectSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ArrayList<HeaderMenuDTO> menuList = new HeaderMenuDAOImpl().select();
		
		HttpSession session = req.getSession();
		
		session.setAttribute("headerMenu", menuList);
		
		String context = req.getContextPath();
	    String url = req.getRequestURI().substring(context.length());
	    
		RequestDispatcher rd = req.getRequestDispatcher(url);
		rd.include(req, res);
	}
}
