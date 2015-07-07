var require = {

    paths: {
        // Define jquery ahead of RequireJS loading.  Allows us to load the page immediately after RequireJS loads.

        "bootstrap": ["../../webjars/bootstrap/3.3.1/js/bootstrap", "js/bootstrap"],

        "bootstrap-css": ["../../webjars/bootstrap/3.3.1/css/bootstrap", "css/bootstrap"],

        "jquery": ["../../webjars/jquery/1.11.1/jquery", "jquery"],

        "domReady": ["../../webjars/requirejs-domready/2.0.1/domReady", "domReady"],

        "prism-core.min": ["../../webjars/prismjs/1.0.0/components/prism-core.min", "prism-core.min"],

        "prism-clike.min": ["../../webjars/prismjs/1.0.0/components/prism-clike.min", "prism-clike.min"],

        "prism-markup.min": ["../../webjars/prismjs/1.0.0/components/prism-markup.min", "prism-markup.min"],

        "prism-javascript.min": ["../../webjars/prismjs/1.0.0/components/prism-javascript.min", "prism-javascript.min"]

    },

    shim: {
        "jquery": {"exports": "$"},
        "bootstrap": {"deps": ["jquery"]}
    },

    deps: ["jquery", "prism-core.min", "prism-clike.min"],

    callback: function () {
        // Load RequireJS module configurations after RequireJS is loaded.
        console.log("RequireJS callback complete.");
    }
};
