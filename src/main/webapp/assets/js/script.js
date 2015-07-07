"use strict";
require(["jquery", "bootstrap", "prism-core.min", "prism-markup.min", "prism-clike.min", "prism-javascript.min"], function ($, bootstrap) {

    // Initialize -----------------------------------------------------------------------------------------------------

    // You have to handle left angle brackets in XML
    $('.xml').each(function () {
        $(this).html($(this).html().replace(/</g, "&lt;"));
    });

    Prism.highlightAll();
});

