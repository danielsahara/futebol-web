<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html ng-app>
<head>
	<title><tiles:getAsString name="titulo" /></title>
	<!-- Bootstrap -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">    
	
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->    
	<script src="http://code.angularjs.org/1.0.1/angular-1.0.1.min.js"></script>
</head>
<body>
	
	
	<tiles:insertAttribute name="cabecalho"/>
	

	<tiles:insertAttribute name="conteudo"/>


	<tiles:insertAttribute name="rodape"/>
</body>
</html>