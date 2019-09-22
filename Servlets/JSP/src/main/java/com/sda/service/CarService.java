package com.sda.service;

import com.sda.cars.Car;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class CarService {
    private String user = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/CarsDB?useSSL=false";

    private List<Car> cars = new LinkedList<>();

    public void addCar(Car car) throws SQLException {
        String sqlString =
                "INSERT INTO CARS(BRAND, MODEL, BUILD_YEAR, KM) VALUES('"
                        + car.getBrand() + "', '" + car.getModel() + "', '" + car.getYear() + "', '" + car.getKm() + "')";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager
                .getConnection(url, user, password);
             Statement statement = conn.createStatement()) {

            conn.setAutoCommit(false);

            statement.executeUpdate(sqlString);

            conn.commit();
        }
    }

    public List<Car> fetchCars() throws SQLException {
        String sqlString = "SELECT * FROM CARS";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery(sqlString);

            while (rs.next()) {
                String brand = rs.getString("BRAND");
                String model = rs.getString("MODEL");
                int year = rs.getInt("BUILD_YEAR");
                double km = rs.getDouble("KM");
                Car car = new Car(brand, model, year, km);
                cars.add(car);
            }
        }
        return cars;
    }

    public void deleteCars(String[] ids) {
        for (String i : ids) {
            String sqlString = "DELETE FROM CARS WHERE ID = " + i;
//            String sqlString = "DELETE FROM CARS WHERE ROW_NUMBER BETWEEN " + i + " AND " + i;

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try (Connection conn = DriverManager.getConnection(url, user, password);
                 Statement statement = conn.createStatement()) {

                conn.setAutoCommit(false);
                statement.executeUpdate(sqlString);
                conn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
