<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<label for="college">Choose a table:</label>

<form action = "/list">
<select name ="tablename"  id="college" >
  <option value="/"> Select a table</option>
  <option value="college">College</option>
  <option value="course">Course</option>
  <option value="department">Department</option>
  <option value="instructor">Instructor</option>
  <option value="section">Section</option>
  <option value="student">Student</option>
  <option value="takes">Takes</option>
  
</select> 
<input type="submit" value="select" />
</form>


<div align="center">
   <table border="1" cellpadding="5">
      <caption><h2>List of ${tablename}</h2></caption>
      
       <tr>
       <c:forEach var="column" items="${columnname}">
          <td>${column}</td>
       </c:forEach>   
       </tr>
       <c:forEach var="row" items="${data}">
       <tr>
           <c:forEach var="column" items="${row}">
          		<td>${column}</td>
       	   </c:forEach>
       </tr>
         </c:forEach>

        </table>
    </div> 
  
</body>
</html>