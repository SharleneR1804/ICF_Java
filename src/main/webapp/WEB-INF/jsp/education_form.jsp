<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Education Form</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/education/saveEducation" var="savedURL" />
  <h2>Education</h2>
  <form:form modelAttribute="educationForm" method="post" action="${savedURL }" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>Employee ID</label>
    <form:input path="edid" cssClass="form-control" id="edid" />
   </div>
   <div class="form-group">
    <label>Type</label>
    <form:input path="Type" cssClass="form-control" id="Type" />
   </div>
   <div class="form-group">
    <label>Start Date</label>
    <form:input path="Startdate" cssClass="form-control" id="Startdate" />
   </div>
    <div class="form-group">
    <label>End Date</label>
    <form:input path="Enddate" cssClass="form-control" id="Enddate" />
   </div>
   <div class="form-group">
    <label>Institute</label>
    <form:input path="institute" cssClass="form-control" id="institute" />
   </div><div class="form-group">
    <label>Address</label>
    <form:input path="address" cssClass="form-control" id="address" />
   </div>
   <div class="form-group">
    <label>Percentage</label>
    <form:input path="Percentage" cssClass="form-control" id="Percentage" />
   </div>
   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
  
 </div>
</body>
</html>