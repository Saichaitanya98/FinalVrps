package com.mvc.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.dao.Mail;
public class MailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
public MailServlet() {
 }
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
 Mail.secretMail("HIII", "virtusa.training15@gmail.com", "virtusa.training15@gmail.com");   
 }
}
