package com.example.labjavafx.controller.layout;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class RightController {

    @FXML
    public VBox dynamicContent;

    public VBox getDynamicContent() {
        return dynamicContent;
    }

    @FXML
    public void setDynamicContent(VBox content) {
        this.dynamicContent.getChildren().clear();
        this.dynamicContent.getChildren().add(content);
    }
}
