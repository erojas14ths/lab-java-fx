package com.example.labjavafx.controller.layout;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class RootController {

    @FXML
    private VBox content;
    @FXML
    private RightController rightController;

    public RightController getRightController() {
        return rightController;
    }

    public void setRightController(RightController rightController) {
        this.rightController = rightController;
    }

    public VBox getContent() {
        return content;
    }

    public void setContent(VBox content) {
        this.content = content;
    }
}
