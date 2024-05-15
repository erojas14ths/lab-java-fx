package com.example.labjavafx.controller.layout;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class RightController {

    @FXML
    public VBox content;

    public VBox getContent() {
        return content;
    }

    public void setContent(VBox content) {
        this.content.getChildren().clear();
        this.content.getChildren().add(content);
    }
}
