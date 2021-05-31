<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Employee Dependants</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
  <center><h2 style="margin:10 px;">Employee Dependants</h2></center>
  <br><br>
  <div> 
  <table class="table table-striped" style="margin: 0px;">
   <thead>
    <th scope="row">#ID</th>
    <th scope="row">Employee ID</th>
    <th scope="row">Name</th>
    <th scope="row">Gender</th>
    <th scope="row">DOB</th>
    <th scope="row">Relationship</th>
    <th scope="row">Update</th>
    <th scope="row">Delete</th>
   </thead>
   <tbody>
    <c:forEach items="${dependantList }" var="dependants" >
     <tr>
      <td>${dependants.id }</td>
      <td>${dependants.did }</td>
      <td>${dependants.fname } ${dependants.lname }</td>
      <td>${dependants.gender }</td>      
      <td>${dependants.dob }</td>
      <td>${dependants.relationship }</td>
      <td>
       <spring:url value="/dependants/updateDependant/${dependants.id }" var="updateURL" />
       <a class="btn btn-primary" href="${updateURL }" role="button" >Update</a>
      </td>
      <td>
       <spring:url value="/dependants/deleteDependant/${dependants.id }" var="deleteURL" />
       <a class="btn btn-primary" href="${deleteURL }" role="button" >Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <br>   
  <spring:url value="/dependants/addDependant/" var="addURL" />
  <a class="btn btn-primary" href="${addURL }" role="button" >Add New Dependant</a>
   <spring:url value="/employee/list/" var="empURL" />
  <a class="btn btn-primary" href="${empURL }" role="button" >Employee Manager</a>
  <spring:url value="/education/list/" var="eduURL" />
  <a class="btn btn-primary" href="${eduURL }" role="button" >Manage Education Details</a>
 </div>
</body>
</html>