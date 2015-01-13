<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form commandName="jogador" action="jogador" method="post" >
	<div class="form-group">
    	<label for="nome">Nome:</label>
		<input type="text" name="nome" value="${jogador.nome }" class="form-control"/>
		<form:errors path="nome" cssClass="error" cssStyle="color:red;"/>	
	</div>
	<div class="form-group">
	    <label for="email">E-mail:</label>
		<input type="text" name="email" value="${jogador.email }" class="form-control"/>
		<form:errors path="email" cssClass="error" cssStyle="color:red;"/>	
	</div>
	<div class="form-group">
    	<label for="celular">Celular:</label>
		<input type="text" name="celular" value="${jogador.celular}" class="form-control"/>
		<form:errors path="celular" cssClass="error" cssStyle="color:red;"/>	
	</div>
	<input type="submit" value="Cadastrar Atleta" class="btn btn-lg btn-success" />
</form:form>