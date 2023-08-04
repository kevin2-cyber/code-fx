module com.codefx.codefx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.codefx.app to javafx.fxml;
    exports com.codefx.app;
    exports com.codefx.app.controller;
    opens com.codefx.app.controller to javafx.fxml;
}