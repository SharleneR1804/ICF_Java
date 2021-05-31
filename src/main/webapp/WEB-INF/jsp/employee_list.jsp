<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Employee List</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
  <center><h2 style="padding:10 px;">Employee Manager</h2></center>
  <br>
  <div> 
  <table class="table table-striped" style="margin: 0px;">
   <thead>
    <th scope="row">#ID</th>
    <th scope="row">Name</th>
    <th scope="row">Employee ID</th>
    <th scope="row">Start date</th>
    <th scope="row">Designation</th>
    <th scope="row">Department</th>
    <th scope="row">End date</th>
    <th scope="row">Status</th>
    <th scope="row">DOB</th>
    <th scope="row">Reporting Manager</th>
    <th scope="row">Gender</th>
    <th scope="row">Blood Grp</th>
    <th scope="row">Address</th>
    <th scope="row">Update</th>
    <th scope="row">Delete</th>
   </thead>
   <tbody>
    <c:forEach items="${employeeList }" var="employee" >
     <tr>
      <td>${employee.id }</td>
      <td>${employee.fname } ${employee.lname }</td>
      <td>${employee.eid }</td>      
      <td>${employee.startdate }</td>
      <td>${employee.designation }</td>
      <td>${employee.department }</td>
      <td>${employee.enddate }</td>
      <td>${employee.status }</td>
      <td>${employee.dob }</td>
      <td>${employee.repmgr }</td>
      <td>${employee.gender }</td>
      <td>${employee.bloodgrp }</td>
      <td>${employee.address }</td>
      <td>
       <spring:url value="/employee/updateEmployee/${employee.id }" var="updateURL" />
       <a class="btn btn-primary" href="${updateURL }" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="/employee/deleteEmployee/${employee.id }" var="deleteURL" />
       <a class="btn btn-primary" href="${deleteURL }" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <br>   
  <spring:url value="/employee/addEmployee/" var="addURL" />
  <a class="btn btn-primary" href="${addURL }" role="button" >Add New Employee</a>
   <spring:url value="/education/list/" var="eduURL" />
  <a class="btn btn-primary" href="${eduURL }" role="button" >Manage Education Details</a>
  <spring:url value="/dependants/list/" var="depURL" />
  <a class="btn btn-primary" href="${depURL }" role="button" >Manage Dependants</a>
 </div>
</body>
</html>