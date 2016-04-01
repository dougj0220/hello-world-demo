function Hello($scope, $http) {
    $http.get('http://localhost:9090/hello').
        success(function(data) {
            $scope.greeting = data;
        });
}
