module com.codefx.codefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.codefx.app to javafx.fxml;
    exports com.codefx.app;
}