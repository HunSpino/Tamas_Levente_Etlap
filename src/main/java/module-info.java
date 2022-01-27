module com.example.etlap {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.etlapDb to javafx.fxml;
    exports com.example.etlap;
    exports com.example.etlap.Controllers;
    opens com.example.etlap.Controllers to javafx.fxml;
}