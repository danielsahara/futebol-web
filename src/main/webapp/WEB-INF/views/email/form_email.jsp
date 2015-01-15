<script type="text/javascript" src="resources/js/tinymce/tinymce.min.js"></script>
<script type="text/javascript">
tinymce.init({
    selector: "textarea"
 });
</script>

<div align="center"><h3>Atenção! Deixe esta Área apenas para o Luis utilizar. Obrigado!</h3></div>
<form action="email/enviar" method="post">
	<div class="form-group">
    	<label for="email">Assunto:</label>
    	<input type="text" name="assunto" id="assunto" class="form-control" size="100"/>
    	<br />
  	</div>
  	<div class="form-group">
  	    <label for="texto">Texto:</label>
  		<textarea name="texto" id="texto" class="form-control" rows="10"></textarea>
  	</div>
	
 <input type="submit" value="Enviar a todos os atletas" class="btn btn-lg btn-success" />
</form>