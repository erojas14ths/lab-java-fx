package com.example.labjavafx.util;

import com.example.labjavafx.controller.layout.RootController;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class Util {

    private Util() {
    }

    /**
     * Update stage with nuew scene with new values.
     * @param parent parent
     * @param event  event
     */
    public static void push(Parent parent, Event event) {
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Get controller by path.
     * @param path path
     * @return controller
     */
    public static <T> T getController(String path) {
        try {
            FXMLLoader fxmlRoot = new FXMLLoader(Util.class.getResource(path));
            Parent rootParent = fxmlRoot.load();
            return fxmlRoot.getController();

        }
        catch (Exception ex) {
            System.out.println("An unexpected error occurred: " + ex.getMessage());
        }
        return null;
    }
}
