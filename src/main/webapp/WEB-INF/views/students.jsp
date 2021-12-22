<%@ include file="includes/header.jspf" %>

<body>

<%@ include file="includes/navbar.jspf" %>

<h1> salam ya ${name }</h1>
</div>


<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">id</th>
      <th scope="col">name</th>
      <th scope="col">active</th>
       <th scope="col">action</th>
      
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${sts}" var="st">
         
    <tr>
      <th scope="row">${st.id} </th>
      <td>${st.name} </td>
      <td>${st.isActive}</td>
      <td><a href="/first-mvc-app/delete?id=${st.id}" class="btn btn-danger">delete</a>
      <a href="/first-mvc-app/edit?id=${st.id}" class="btn btn-info">update</a></td>
    </tr>
   </c:forEach>
  </tbody>
</table>
   
</div>
<div class="container">
  <a class="btn btn-primary" href="/first-mvc-app/add">add student</a>

</div>



<%@ include file="includes/footer.jspf" %>