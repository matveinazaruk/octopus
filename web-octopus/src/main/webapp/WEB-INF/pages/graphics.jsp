<html>
	<head>
    <link href="${pageContext.request.contextPath}/resources/css/main.css" rel="stylesheet" >
		<!-- add scripts -->
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
		<script src="http://code.highcharts.com/highcharts.js"></script>
    <script src="http://code.highcharts.com/themes/gray.js"></script>
    <script src="http://code.highcharts.com/modules/exporting.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
	</head>
<body style="background-image:url(${pageContext.request.contextPath}/resources/images/background.jpeg)">
	<h1>Text: ${text}</h1>	
	<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

</body>
</html>
