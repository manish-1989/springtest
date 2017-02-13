<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>

 <form:form method="post" action="addproduct/" commandName="productObj" class="form-vertical">
 <div class="form-group">
               <form:label class="control-label col-sm-2 sr-only" for="id" path="id">id</form:label>
               <div class="col-sm-4">
                  <form:input type="text" path="id" class="form-control sr-only" value="${productObj.id}"/>
               </div> 
                </br>
            </div>
 <div class="form-group">
               <form:label class="control-label col-sm-2" for="Airport" path="name">name</form:label>
               <div class="col-sm-4">
                  <form:input type="text" path="name" class="form-control" value="${productObj.name}"/>
               </div> 
                </br>
            </div>
            
  
            
 <div class="form-group">
               <form:label class="control-label col-sm-2" for="Minimum" path="description">description</form:label>
               <div class="col-sm-4">
                  <form:input type="text" path="description" class="form-control" value="${productObj.description}"/>
               </div> 
                </br>
            </div>
            
 <div class="form-group">
               <form:label class="control-label col-sm-2" for="lbs_100" path="price">price</form:label>
               <div class="col-sm-4">
                  <form:input type="text" path="price" class="form-control" value="${productObj.price}"/>
               </div> 
                </br>
            </div>
 
 <input type="submit" value="add"/>
 
            </form:form>
            </div>
<div>



 <form:form method="post" action="addproduct/" commandName="categoryObj" class="form-vertical">
 <div class="form-group">
               <form:label class="control-label col-sm-2 sr-only" for="id" path="id">id</form:label>
               <div class="col-sm-4">
                  <form:input type="text" path="id" class="form-control sr-only" value="${categoryObj.id}"/>
               </div> 
                </br>
            </div>
 <div class="form-group">
               <form:label class="control-label col-sm-2" for="Airport" path="name">name</form:label>
               <div class="col-sm-4">
                  <form:input type="text" path="name" class="form-control" value="${categoryObj.name}"/>
               </div> 
                </br>
            </div>
            
<input type="submit" value="add"/>
 
            </form:form>

</div>
</body>
</html>