package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.DelBean;
import com.mvc.dao.DelDao;
 
public class DelServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
public DelServlet() {
 }
 
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 //String answer = request.getParameter("did");
	 String eid = request.getParameter("eid");
 DelBean registerBean = new DelBean();
 DelDao registerDao = new DelDao();
 registerBean.setEid(eid);
 String userRegistered = registerDao.registerUser(registerBean);
 
 if(userRegistered.equals("SUCCESS"))
 {
 request.getRequestDispatcher("/repdel.html").forward(request, response);
 }
 else 
 {
 request.setAttribute("errMessage", userRegistered);
 request.getRequestDispatcher("/Register.html").forward(request, response);
 }
 }
}
