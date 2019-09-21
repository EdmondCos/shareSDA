package com.sda.cars;

import com.sda.cars.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CarsServlet extends HttpServlet {
    Car car;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");
        int year = Integer.valueOf(request.getParameter("year"));
        double km = Double.valueOf(request.getParameter("km"));

        car = new Car(brand, model, year, km);
        System.out.println(car.print());
    }
}
