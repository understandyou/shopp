angular.module("myApp",[])
    .controller('detail',['$scope',function (a) {
        a.add = function(){

            console.log("进人+");
            a.shoopNumber++;
        }
        a.sub = function () {
            console.log("进人-");
            a.shoopNumber--;
        }
}]);