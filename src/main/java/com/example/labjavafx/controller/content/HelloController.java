package com.example.labjavafx.controller.content;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class HelloController {

    @FXML
    private VBox content;

    public VBox getContent() {
        return content;
    }

    public void setContent(VBox content) {
        this.content = content;
    }
}
