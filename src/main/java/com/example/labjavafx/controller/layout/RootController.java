package com.example.labjavafx.controller.layout;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RootController {

    @FXML
    private VBox content;
    @FXML
    private RightController rightController;

}
