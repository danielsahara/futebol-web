function JogadorController($scope, $http) {
	$http.get('jogador/all').success(function (response) {
        $scope.jogadores = response; 
	});
}