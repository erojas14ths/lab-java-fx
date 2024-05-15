package com.example.labjavafx.controller.layout;

import javafx.fxml.FXML;

public class RootController {

    @FXML
    private RightController rightController;

    public RightController getRightController() {
        return rightController;
    }

    public void setRightController(RightController rightController) {
        this.rightController = rightController;
    }

    @Override
    public String toString() {
        return "RootController{" +
                "rightController=" + rightController +
                '}';
    }
}
