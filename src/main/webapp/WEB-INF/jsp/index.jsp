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

    <link rel="stylesheet" href="<c:url value='/webjars/bootstrap/3.3.1/css/bootstrap.min.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/assets/css/style.css'/>"/>
    <link rel="stylesheet" href="<c:url value='/assets/css/prism/prism.css'/>"/>

</head>
<body>

<h1>Colorizer Tester</h1>

<div id="container-jsprism" class="demo-container">

    <h2>JsPrism</h2>

    <h3>XML</h3>
    <div class="code">
        <pre class="language-markup"><code class="language-markup xml">${item0}</code></pre>
    </div>

    <h3>JSON</h3>
    <div class="code">
        <pre class="language-javascript"><code class="language-javascript">${item1}</code></pre>
    </div>

    <h3>HTML</h3>
    <div class="code">
        <pre class="language-markup"><code class="language-markup">${item2}</code></pre>
    </div>

    <h3>Plain Text</h3>
    <div class="code">
        <pre class="language-none"><code class="language-none">${item3}</code></pre>
    </div>

</div>

<script src="/assets/js/script.js" class="demo-container"></script>

</body>
</html>