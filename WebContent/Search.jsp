<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
  <%@page import="java.sql.*,com.mvc.*"
%>
<%@page import="com.mvc.util.DBConnection"%>
<style>
body{
  background: url(images/multi.jpg) no-repeat;
  background-size: 100%;
}
</style>
</head>
<body>

<div id="container">
<div align="center">
<h2>View Page</h2>
</div>
<br>
<br>
 <table class="table table-dark">
 <thead class="text-success">
<tr> 
<td>question</td>
<td>answer</td>
</tr>
</thead>
<%
try
{
String qid=request.getParameter("qid");
String query="select question,answer from raise1 where question=?";
Connection con=DBConnection.createConnection();
PreparedStatement stmt=con.prepareStatement(query);
stmt.setString(1, qid);
ResultSet rs= stmt.executeQuery();
while(rs.next())
{
%>
<tbody>
    <tr>   
    <td><%=rs.getString("question")%></td>
    <td><%=rs.getString("answer")%></td>
    </tr>
 <%
 
}
%>
 </tbody>
    </table>
    </div>
    <%
    rs.close();
    stmt.close();
    con.close();
}
catch(Exception e)
{
    e.printStackTrace();
}
%>
</body>
</html>