var require = {

    paths: {
        // Define jquery ahead of RequireJS loading.  Allows us to load the page immediately after RequireJS loads.

        "bootstrap": ["../../webjars/bootstrap/3.3.1/js/bootstrap", "js/bootstrap"],

        "bootstrap-css": ["../../webjars/bootstrap/3.3.1/css/bootstrap", "css/bootstrap"],

        "shCore": ["/assets/js/brush/shCore", "scripts/shCore"],

        "shAutoloader": ["/assets/js/brush/shAutoloader", "scripts/shAutoloader"],

        "jquery": ["../../webjars/jquery/1.11.1/jquery", "jquery"],

        "domReady": ["../../webjars/requirejs-domready/2.0.1/domReady", "domReady"]
    },

    shim: {
        "jquery": {"exports": "$"},
        "bootstrap": {"deps": ["jquery"]},
        "shAutoloader": {"deps": ["shCore"]}
    },

    deps: ["jquery"],

    callback: function () {
        // Load RequireJS module configurations after RequireJS is loaded.
        console.log("RequireJS callback complete.");
    }
};
