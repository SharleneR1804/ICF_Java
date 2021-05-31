<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Dependant Form</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/dependants/saveDependant" var="savedURL" />
  <h2>Dependant</h2>
  <form:form modelAttribute="dependantForm" method="post" action="${savedURL }" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>Employee ID</label>
    <form:input path="did" cssClass="form-control" id="did" />
   </div>
   <div class="form-group">
    <label>First Name</label>
    <form:input path="Fname" cssClass="form-control" id="Fname" />
   </div>
   <div class="form-group">
    <label>Last Name</label>
    <form:input path="Lname" cssClass="form-control" id="Lname" />
   </div>
    <div class="form-group">
    <label>Gender</label>
    <form:input path="Gender" cssClass="form-control" id="Gender" />
   </div>
   <div class="form-group">
    <label>DOB</label>
    <form:input path="dob" cssClass="form-control" id="dob" />
   </div>
   <div class="form-group">
    <label>Relationship</label>
    <form:input path="Relationship" cssClass="form-control" id="Relationship" />
   </div>
   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
  
 </div>
</body>
</html>