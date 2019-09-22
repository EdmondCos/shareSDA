package com.sda.cars;

import com.sda.service.CarService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

@WebServlet("/LoadCarServlet"   )
public class LoadCarServlet extends HttpServlet {
    private List<Car> cars = new LinkedList();
    private CarService service = new CarService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            cars = service.fetchCars();
            request.setAttribute("cars",cars);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.setContentType("text/html");
        RequestDispatcher dispatcher = request.getRequestDispatcher("results.jsp");
        dispatcher.forward(request, response);

    }

}
