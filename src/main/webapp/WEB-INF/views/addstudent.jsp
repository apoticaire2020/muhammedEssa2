<%@ include file="includes/header.jspf" %>

<body>

<%@ include file="includes/navbar.jspf" %>

</div>
   <div class="container">
   <c:if test="${error.length() >0 }">
 <div class="alert alert-warning" role="alert">
  <c:out value="${error}"></c:out>
</div>
 
  
 </c:if>
 
<form action="/first-mvc-app/add" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">username</label>
    <input type="text" class="form-control" name="name" required>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">isActive</label>
    <input type="text" class="form-control"  name="isActive" >
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>

<%@ include file="includes/footer.jspf" %>
