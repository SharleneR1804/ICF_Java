<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Education List</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
  <center><h2>Employee Education Details</h2></center>
  <br><br>
  <div> 
  <table class="table table-striped" style="margin: 0px;">
   <thead>
    <th scope="row">Employee ID</th>
    <th scope="row">Education type</th>
    <th scope="row">Startdate</th>
    <th scope="row">Enddate</th>
    <th scope="row">Institute</th>
    <th scope="row">Address</th>
    <th scope="row">Percentage</th>
    <th scope="row">Update</th>
    <th scope="row">Delete</th>
   </thead>
   <tbody>
    <c:forEach items="${educationList }" var="education" >
     <tr>
      <td>${education.edid }</td>
      <td>${education.type }</td>
      <td>${education.startdate } </td>
      <td>${education.enddate }</td>      
      <td>${education.institute }</td>
      <td>${education.address }</td>
      <td>${education.percentage }</td>
      <td>
       <spring:url value="/education/updateEducation/${education.id }" var="updateURL" />
       <a class="btn btn-primary" href="${updateURL }" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="/education/deleteEducation/${education.id }" var="deleteURL" />
       <a class="btn btn-primary" href="${deleteURL }" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <br>   
  <spring:url value="/education/addEducation/" var="addURL" />
  <a class="btn btn-primary" href="${addURL }" role="button" >Add New education</a>
  <spring:url value="/employee/list/" var="empURL" />
  <a class="btn btn-primary" href="${empURL }" role="button" >Employee Manager</a>
  <spring:url value="/dependants/list/" var="depURL" />
  <a class="btn btn-primary" href="${depURL }" role="button" >Manage Dependants</a>
 </div>
</body>
</html>