package com.mvc.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.bean.DelBean;
import com.mvc.util.DBConnection;
 
public class DelDao {
 
 public String registerUser(DelBean registerBean)
 {
	 Connection con = null;
 
PreparedStatement stmt = null ;
 //String a="unanswered";
String eid = registerBean.getEid();
 
 try
 {
 con = DBConnection.createConnection();
 String query = "delete from raise1 where empid=?";
 stmt = con.prepareStatement(query);
 stmt.setString(1, eid);
 
int i=stmt.executeUpdate();

if(i!=0) {
 
 return "SUCCESS"; 
}
 }
 catch(SQLException e)
 {
 e.printStackTrace();
 }
 
 return "Oops.. Something went wrong there..!"; 
 }
}