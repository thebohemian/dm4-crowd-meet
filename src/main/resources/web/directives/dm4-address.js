angular.module("crowd").directive("dm4Address", function() {
    return {
        restrict: "A",
        scope: {
            address: "=dm4Address"
        },
        templateUrl: "views/address.html"
    }
})
