module com.example.proyectopersistencia {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;


    opens com.example.proyectopersistencia to javafx.fxml;
    exports com.example.proyectopersistencia;
}