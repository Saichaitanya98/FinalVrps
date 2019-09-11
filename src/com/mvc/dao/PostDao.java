package com.mvc.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.bean.PostBean;
import com.mvc.util.DBConnection;
 
public class PostDao {
 
 public String registerUser(PostBean registerBean)
 {
// String pid = registerBean.getPid();
 String qpid = registerBean.getQpid();
 String questionpid = registerBean.getQuestionpid();
 
 
 
 
 Connection con = null;
 PreparedStatement preparedStatement = null;
 
 try
 {
 con = DBConnection.createConnection();
 String query = "update raise1 set answer=? where question=?";
 preparedStatement = con.prepareStatement(query); 
 preparedStatement.setString(1, qpid);
// preparedStatement.setString(2, pid);
 preparedStatement.setString(2, questionpid);
 
 int i= preparedStatement.executeUpdate();
 
 if (i!=0) 
 return "SUCCESS"; 
 }
 catch(SQLException e)
 {
 e.printStackTrace();
 }
 
 return "Oops.. Something went wrong there..!"; 
 }
}