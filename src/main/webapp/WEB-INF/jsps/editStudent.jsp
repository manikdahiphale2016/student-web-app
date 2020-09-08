<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isELIgnored="false" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<title>Update Student</title>
</head>
<body>

	<form action="updateStudent" method="post">
		<div align="center">
			<table class="table table-bordered" style="width:400px" >
				<thead><tr ><th colspan="2">Update Student Form:</th></tr>
				<tr>
			 </thead>
			 <tr>
					<td><b>Student Id:</b></td>
					<td><input type="text" name="id" value="${student.id}" readonly/> </td>
				</tr>
			 	<tr>
					<td><b>Student Name:</b></td>
					<td><input type="text" name="name" value="${student.name}" /> </td>
				</tr>
				<tr>
					<td><b>Student Course:</b></td>
					<td><input type="text" name="course" value="${student.course}" /> </td>
				</tr>
					<tr>
					<td><b>Student Fee:</b></td>
					<td><input type="text" name="fee" value="${student.fee}" /> </td>
				</tr>
				
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Save" /></td>
				</tr>
			</table>
		</div>
	</form>
	

 	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

</body>
</html>