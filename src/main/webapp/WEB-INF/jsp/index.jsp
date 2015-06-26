<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">

<head>
    <meta charset="UTF-8"/>
    <script src="<c:url value='/assets/js/config.js'/>"></script>

    <script>
        var require = require || {};
        require.baseUrl = '/assets/js';
    </script>
    <script src="<c:url value='/webjars/requirejs/2.1.18/require.min.js'/>"></script>

    <link rel="stylesheet" href="<c:url value='/assets/css/brush/shCore.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/assets/css/brush/shCoreDefault.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/assets/css/brush/shThemeDefault.css'/>"/>
    <!-- <link rel="stylesheet" href="<c:url value='/webjars/bootstrap/3.3.1/css/bootstrap.min.css'/>"/>-->
    <link rel="stylesheet" href="<c:url value='/assets/css/style.css'/>"/>

</head>
<body>

<h1>Colorizer Tester</h1>

<h2>XML</h2>
<div class="code">
    <script type="syntaxhighlighter" class="brush: xml"><![CDATA[${item0}]]></script>
</div>

<h2>JSON</h2>
<div class="code">
    <script type="syntaxhighlighter" class="brush: js"><![CDATA[${item1}]]></script>
</div>

<h2>HTML</h2>
<div class="code">
    <script type="syntaxhighlighter" class="brush: html"><![CDATA[${item2}]]></script>
</div>

<h2>Plain Text</h2>
<div class="code">
    <script type="syntaxhighlighter" class="brush: text"><![CDATA[${item3}]]></script>
</div>

<script src="/assets/js/script.js"></script>

</body>
</html>