var app = angular.module('app',['ngRoute', 'ngTable']);
 
app.config(function($routeProvider, $locationProvider)
{
   $routeProvider
   .when('/', {
      templateUrl : 'app/views/home.html',
      controller     : 'HomeCtrl',
   })
   .when('/poi', {
      templateUrl : 'app/views/poi.html',
      controller  : 'PoiCtrl',
   })
   .when('/poi-register', {
      templateUrl : 'app/views/poi-register.html',
      controller  : 'PoiRegisterCtrl',
   })
   .when('/poi-proximity-calculation', {
      templateUrl : 'app/views/poi-proximity-calculation.html',
      controller  : 'PoiProximityCalculationCtrl',
   })
   .otherwise ({ redirectTo: '/' });
});
