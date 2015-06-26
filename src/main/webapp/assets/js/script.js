"use strict";
require(["jquery", "bootstrap", "shCore", "shAutoloader"], function ($, bootstrap) {
    SyntaxHighlighter.autoloader(
        ['js','/assets/js/brush/shBrushJScript.js'],
        ['xml', '/assets/js/brush/shBrushXml.js'],
        ['text','plain','/assets/js/brush/shBrushPlain.js']
    );
    SyntaxHighlighter.config.tagName='script';
    SyntaxHighlighter.all();
});

