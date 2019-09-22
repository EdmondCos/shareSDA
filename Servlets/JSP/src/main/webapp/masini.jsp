<html>

<head>
</head>

<body>
<form action="SaveCarServlet" method="get">
    <h4>Brand</h4> <input type="text" name="brand"/>
    <h4>Model</h4> <input type="text" name="model"/>
    <h4>Year</h4> <input type="text" name="year"/>
    <h4>KM</h4> <input type="text" name="km"/>
    <br>
    <input type="submit" value="Save" name="button"/>
</form>

<form action="LoadCarServlet" method="get">
    <input type="submit" value="Load" name="button"/>
</form>

</body>
</html>