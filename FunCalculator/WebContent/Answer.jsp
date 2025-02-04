<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Own Calculator</title>
<style type="text/css">
body {
	text-align: center;
	background: linear-gradient(to right, #2b40ff, #07121a);
}

h1,h3 {
	color: white;
	margin: 15px;
}

input, button {
	font-size: 40px;
	border-radius: 5%; /* corner curve krta hai */
	background-color: black; /*  pure space ho color krega */
	color: white; /* font change krega */
	border: 2px solid white;
}

img {
	height: 20%;
	width: 20%;
	margin-top: 20px;
}

img:hover {
	transform: scale(1.1); /* Enlarge the image on tapping it */
}
</style>
</head>
<body>
	<!--  -->
	<img alt="" src="image\hello.png">
	<h1>Joke of The Day!</h1>
	<h3>🤣<%= request.getParameter("joke")%>🚩</h3>
	

	<form action="MyServlet">
		<input name="num1" placeholder="First Number"></input> <input
			name="num2" placeholder="second Number"></input>
		<button name="bt1" value="1">+</button>
		<button name="bt1" value="2">-</button>
		<button name="bt1" value="3">*</button>
		<button name="bt1" value="4">/</button>
	</form>
	
	<h1>Ans=<%= request.getParameter("ans")%>🚩</h1>
	
	
	
	
	
	
	
</body>
</html>