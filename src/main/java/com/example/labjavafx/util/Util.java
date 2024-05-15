package com.example.labjavafx.util;

import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Util {

    private Util() {
    }

    public static void push(Parent parent, Event event) {
        // Crear una nueva escena y configurarla con el nodo raíz
        Scene scene = new Scene(parent);

        // Obtener el escenario actual y establecer la nueva escena
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);

        // Mostrar el escenario
        stage.show();
    }
}
