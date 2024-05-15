module com.example.labjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labjavafx to javafx.fxml; // Abre el paquete principal
    opens com.example.labjavafx.controller.layout to javafx.fxml; // Abre el nuevo paquete
    opens com.example.labjavafx.controller.content to javafx.fxml; // Abre el nuevo paquete
    exports com.example.labjavafx; // Exporta el paquete principal
}