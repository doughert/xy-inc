app.controller('HomeCtrl', function($rootScope, $location) {
	$rootScope.activetab = $location.path();
});

app.controller('PoiCtrl', function($rootScope, $location, NgTableParams,
		$scope, $http) {
	$rootScope.activetab = $location.path();

	$http.get('poi').success(function(pois) {
		$scope.tableParams = new NgTableParams({}, {
			dataset : pois
		});
	});

	$scope.redirectToPoiRegister = function() {
		$location.path('poi-register');
	};
	
	$scope.redirectToCalculateProximity = function() {
		$location.path('poi-proximity-calculation');
	};

});

app.controller('PoiRegisterCtrl', function($scope, $http, $location) {

	$scope.submit = function() {
		$http.post('poi', $scope.poi).success(function(data) {
			$location.path('poi');
		});
	};

});

app.controller('PoiProximityCalculationCtrl', function($scope, $http, $location) {

	$scope.submit = function() {
		$http.post('poi', $scope.poi).success(function(data) {
			$location.path('poi');
		});
	};

});