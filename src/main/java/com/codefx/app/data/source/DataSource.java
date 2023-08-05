package com.codefx.app.data.source;

import com.codefx.app.data.model.Drug;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.*;

public class DataSource {

    public static ObservableList<Drug> drugs = FXCollections.observableArrayList();

    public static final String URL = "jdbc:mariadb://localhost:3306/pharmacy_sys";

    public static final String USERNAME = "root";

    public static final String PASSWORD = "";

    public static void save() {
        String query = "INSERT INTO drug values(?,?,?,?,?,?)";

        try {
            // Get a connection to the database
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            // SQL statement
            Statement statement = connection.createStatement();
            // Execute the SQL query
            ResultSet resultSet = statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
