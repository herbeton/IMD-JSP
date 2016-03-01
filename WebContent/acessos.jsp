<%@ page import="java.util.*" %>
<html>
	<head>
		<title>Contador</title>
	</head>
	<body>
		<%= (new java.util.Date()).toLocaleString() %><br><br>
		<% aula05.Contador.NovoAcesso(); %>
		Quantidade de acessos a essa página: 
		<b>
			<%= aula05.Contador.getQuantidadeDeAcessos() %>
		</b>
	</body>
</html>