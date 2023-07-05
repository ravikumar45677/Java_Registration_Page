<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Registration page</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>

<body class="bg-light">
	<div class=" container">
		<div class="row">
			<div class="col-md-6 offset-md-3 mt-2">
				<div class="card">
					<div class="card-header text-center fs-3">Employee Register</div>

					<%
						String msg = (String) session.getAttribute("msg");
						if (msg != null) {
					%>
					<p class="text-center fs-4">
						<%=msg%>
					</p>


					<%
						session.removeAttribute("msg");
						}
					%>




					<div class="card-body">
						<form method="post" action="register">

							<div class="mb-3">
								<label for="Name" class="form-label">Name</label> <input
									type="text" class="form-control" name="name"
									placeholder="enter your name " required>

							</div>

							<div class="mb-3">
								<label for="department" class="form-label">Department</label> <input
									type="text" class="form-control" name="department"
									placeholder="enter your Department" required>

							</div>



							<div class="mb-3">
								<label for="salary" class="form-label">Salary</label> <input
									type="text" class="form-control" name="salary"
									placeholder="enter your salary" required>

							</div>

							<div class="mb-3">
								<label for="email" class="form-label">email</label> <input
									type="email" class="form-control" name="E-mail"
									placeholder="enter your mail-id" required>

							</div>


							<div class="mb-3">
								<label for="password" class="form-label">Password</label> <input
									type="password" class="form-control" name="password"
									placeholder="enter your password" required>
								<div id="passwordHelp" class="form-text">We'll never
									share your password with anyone else.</div>
							</div>

							<button type="submit" class="btn btn-primary ">register</button>

							<button type="submit" class="btn btn-primary text-center">Search</button>

						</form>

					</div>


				</div>

			</div>



		</div>





	</div>

</body>
</html>