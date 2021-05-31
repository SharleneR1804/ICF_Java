<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Employee Form</title>
 <link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>
</head>
<body>
 <div class="container">
  <spring:url value="/employee/saveEmployee" var="saveeURL" />
  <h2>Employee</h2>
  <form:form modelAttribute="employeeForm" method="post" action="${saveeURL }" cssClass="form" >
   <form:hidden path="id"/>
   <div class="form-group">
    <label>First Name</label>
    <form:input path="Fname" cssClass="form-control" id="Fname" />
   </div>
   <div class="form-group">
    <label>Last Name</label>
    <form:input path="Lname" cssClass="form-control" id="Lname" />
   </div>
   <div class="form-group">
    <label>Employee ID</label>
    <form:input path="Eid" cssClass="form-control" id="Eid" />
   </div>
   <div class="form-group">
    <label>Start Date</label>
    <form:input path="startdate" cssClass="form-control" id="startdate" />
   </div>
   <div class="form-group">
    <label>Designation</label>
    <form:input path="Designation" cssClass="form-control" id="Designation" />
   </div>
   <div class="form-group">
    <label>Department</label>
    <form:input path="Department" cssClass="form-control" id="Department" />
   </div>
   <div class="form-group">
    <label>End Date</label>
    <form:input path="enddate" cssClass="form-control" id="enddate" />
   </div>
   <div class="form-group">
    <label>Status</label>
    <form:input path="Status" cssClass="form-control" id="Status" />
   </div>
   <div class="form-group">
    <label>DOB</label>
    <form:input path="dob" cssClass="form-control" id="dob" />
   </div>
   <div class="form-group">
    <label>Reporting manager</label>
    <form:input path="Repmgr" cssClass="form-control" id="Repmgr" />
   </div>
   <div class="form-group">
    <label>Gender</label>
    <form:input path="Gender" cssClass="form-control" id="Gender" />
   </div>
   <div class="form-group">
    <label>Blood Group</label>
    <form:input path="Bloodgrp" cssClass="form-control" id="Bloodgrp" />
   </div>
   <div class="form-group">
    <label>Address</label>
    <form:input path="Address" cssClass="form-control" id="Address" />
   </div>
   <button type="submit" class="btn btn-primary">Save</button>
  </form:form>
  
 </div>
</body>
</html>