<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>N�mero aleat�rio</title>
</head>
<body>
Essa p�gina gera um novo n�mero aleat�rio
toda vez que � acessada: <%= Math.random() * 10 %>
</body>
</html>