package com.codefx.app.data.source;

import com.codefx.app.data.model.Drug;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;
import java.util.logging.Logger;

public class DataSource {

    public static ObservableList<Drug> drugs = FXCollections.observableArrayList();

    public static final String URL = "jdbc:mariadb://localhost:3306/pharmacy_sys";

    public static final String USERNAME = "root";

    public static final String PASSWORD = "";

    public static void save() {
        String query = "INSERT INTO drug values(?,?,?,?,?,?)";

        try {
            // Get connection to database
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            // SQL statement
            Statement statement = connection.createStatement();
            // Execute SQL query
            ResultSet resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            Logger.getLogger(e.toString());
        }
    }

    public static Drug find(int id){
        String query = "SELECT drugId from drug";

        try {
            // Get connection to database
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            // SQL statement
            Statement statement = connection.createStatement();
            // Execute SQL query
            ResultSet resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            Logger.getLogger(e.toString());
        }
        return null;
    }

    public static ObservableList<Drug> findAll() {
        String query = "SELECT * FROM drug";

        try {
            // Get connection to database
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            // SQL statement
            Statement statement = connection.createStatement();
            // Execute SQL query
            ResultSet resultSet = statement.executeQuery(query);

            // process the results
            while (resultSet.next()) {
                // create a drug object
                Drug drug = new Drug(resultSet.getCursorName(),
                        resultSet.getString(2),
                        resultSet.getDouble(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5)
                );
                drugs.add(drug);
            }
        } catch (SQLException e) {
            Logger.getLogger(e.toString());
        }
        return null;
    }
}
