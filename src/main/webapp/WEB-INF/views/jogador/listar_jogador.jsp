<script>
function JogadorController($scope, $http) {
	$http.get('../jogador/all').success(function (response) {
        $scope.jogadores = response; 
	});
}
</script>

<div ng-controller="JogadorController">
	<table class="table table-striped table-hover table-bordered">
		<thead>
			<tr>
				<th>Nome</th>
				<th>E-mail</th>
				<th>Celular</th>
			</tr>
		</thead>
		<tbody>
			<tr ng-repeat="jogador in jogadores">
				<td ><strong>{{ jogador.nome }}</strong></td>
				<td><strong>{{ jogador.email }}</strong></td>
				<td><strong>{{ jogador.Celular }}</strong></td>
			</tr>
		</tbody>
	</table>
</div>