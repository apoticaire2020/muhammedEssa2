<%@ include file="includes/header.jspf" %>
<body>

<%@ include file="includes/navbar.jspf" %>

</div>


<form action="/first-mvc-app/update" method="post">


    <input type="text" class="form-control" name="id" value="${sts.id}" hidden required >

  <div class="form-group">
    <label for="exampleInputEmail1">username</label>
    <input type="text" class="form-control" name="name" value="${sts.name}" >
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">isActive</label>
    <input type="text" class="form-control"  name="isActive" value="${sts.isActive}" >
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>

<%@ include file="includes/footer.jspf" %>