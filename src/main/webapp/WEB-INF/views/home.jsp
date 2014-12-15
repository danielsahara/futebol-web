<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html ng-app>
<head>
	<title>Home</title>
	<!-- Bootstrap -->
    <link href="resources/css/bootstrap.css" rel="stylesheet">
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="resources/js/bootstrap.js"></script>
    
	<script src="http://code.angularjs.org/1.0.1/angular-1.0.1.min.js"></script>
	<script type="text/javascript" src="resources/js/home.js"></script>
</head>
<body>
	<a href="jogador">Novo</a> <br />
	<a href="jogador/all">Listar Json</a>

	<div ng-controller="JogadorController">
		<table class="table table-striped table-hover table-bordered">
			<thead>
				<tr>
					<th>Nome</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="jogador in jogadores">
					<td><strong>{{ jogador.nome }}</strong></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
