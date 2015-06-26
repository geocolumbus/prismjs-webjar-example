"use strict";
require(["jquery", "bootstrap", "prism"], function ($, bootstrap) {

    // Initialize -----------------------------------------------------------------------------------------------------

    // You have to handle left angle brackets in XML
    $('.xml').each(function () {
        $(this).html($(this).html().replace(/</g, "&lt;"));
    });

    Prism.highlightAll();
});

