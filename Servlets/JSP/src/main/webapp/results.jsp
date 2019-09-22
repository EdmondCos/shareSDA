<%@ page import="java.util.LinkedList, com.sda.cars.Car"%>

<html>

<head>
</head>

<body>
<form action="DeleteCarServlet" method="get">
<%
    LinkedList<Car> cars = (LinkedList<Car>)request.getAttribute("cars");
    int count = 1;
    for (Car i : cars) {
        String builder =("Brand:" + i.getBrand() + " Model:" + i.getModel() + " Year:" + i.getYear() + " KM:" + i.getKm());
        out.println(builder);
%>
        <input type="checkbox" name ="cars" value= <%=count++%> /> <br>
<%
        }
%>
    <br>
    <input type="submit" value="Delete" name="button"/>
</form>

</body>
</html>