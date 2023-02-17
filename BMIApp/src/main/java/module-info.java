module com.tnmt.bmiapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.tnmt.bmiapp to javafx.fxml;
    exports com.tnmt.bmiapp;
}
