package com.sda.cars;

import com.sda.service.CarService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DeleteCarServlet")
public class DeleteCarServlet extends HttpServlet {
    CarService service = new CarService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] x = request.getParameterValues("cars");
        service.deleteCars(x);

        response.getWriter().append("Car(s) successfully deleted!");
    }
}
