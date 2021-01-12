<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp" %>


<div class="container">

   <table class="table">
    <thead>
      <tr>
        <th>Username</th>
        <th>Email</th>
        <th>Role</th>
      </tr>
    </thead>
    
    <c:forEach var="user" items="${users}">
    <tbody>
      <tr>
        <td>${user.username}</td>
        <td>${user.email}</td>
        <td>${user.userRole}</td>
        <td>
        
       
       <c:choose>
       <c:when test="${sessionScope.principal.id == user.id}">
       <button class = "btn btn-danger" onClick = "deleteById(${user.id})">삭제</button>
       </c:when>
       <c:when test="${sessionScope.principal.userRole == 'ADMIN'}">
       <button class = "btn btn-danger" onClick = "deleteById(${user.id})">삭제</button>
       </c:when>
       </c:choose>
        
                
              
                
		</td>
      </tr> 
      
    </tbody>
    </c:forEach>

	
  </table>
</div>

<script>
function deleteById(id){

	
	var data = {
		id: id
	}

	$.ajax({
		type: "post",
		url: "/project/user?cmd=delete",
		data:JSON.stringify(data),
		contentType:"application/json; charset=utf-8",
		dataType: "json"
	}).done(function(result){
		console.log(result);
		if(result.status == "ok"){
			location.href="index.jsp";
		}else{
			alert("삭제 실패");
		}
	});
} 

</script>

</body>
</html>
