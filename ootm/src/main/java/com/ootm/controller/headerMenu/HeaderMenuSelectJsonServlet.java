package com.ootm.controller.headerMenu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.ootm.dao.headerMenu.HeaderMenuDAOImpl;
import com.ootm.dao.headerMenu.HeaderMenuDTO;
import com.ootm.dao.headerMenu.HeaderSubMenuDTO;

@WebServlet("/get-header-menu")
public class HeaderMenuSelectJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<HeaderMenuDTO> list = new HeaderMenuDAOImpl().select();
		
		
		ArrayList<HashMap<String, Object>> mapList = new ArrayList<HashMap<String, Object>>();
		
		for(HeaderMenuDTO hmDTO : list) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("id", hmDTO.getId());
			map.put("name", hmDTO.getName());
			map.put("idx", hmDTO.getIdx());
			ArrayList<HeaderSubMenuDTO> subList = hmDTO.getSubMenu();
			
			ArrayList<HashMap<String, Object>> subMapList = new ArrayList<HashMap<String, Object>>();
			for(HeaderSubMenuDTO hsmDTO : subList) {
				HashMap<String, Object> subMap = new HashMap<String, Object>();
				subMap.put("id", hsmDTO.getId());
				subMap.put("menuId", hsmDTO.getMenuId());
				subMap.put("name", hsmDTO.getName());
				subMap.put("korName", hsmDTO.getKorName());
				subMap.put("idx", hsmDTO.getIdx());
				subMap.put("highlight", hsmDTO.getHighlight());
				subMapList.add(subMap);
			}
			map.put("subMenu", subMapList);
			
			mapList.add(map);
		}
		
		String json = JSONArray.toJSONString(mapList);
		
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
	}

}
