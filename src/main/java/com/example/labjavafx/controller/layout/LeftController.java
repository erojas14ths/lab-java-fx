package com.example.labjavafx.controller.layout;

import java.io.IOException;

import com.example.labjavafx.controller.content.HelloController;
import com.example.labjavafx.util.Util;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LeftController {

    @FXML
    public void loadContentSayHello(MouseEvent mouseEvent) throws IOException {

        FXMLLoader fxmlRoot = new FXMLLoader(getClass().getResource("/com/example/labjavafx/controller/layout/root.fxml"));
        Parent rootParent = fxmlRoot.load();
        RootController rootController = fxmlRoot.getController();

        FXMLLoader fxmlHello = new FXMLLoader(getClass().getResource("/com/example/labjavafx/controller/content/hello.fxml"));
        Parent helloPane = fxmlHello.load();
        HelloController helloController = fxmlHello.getController();

        rootController.getRightController().getDynamicContent().getChildren().clear();
        rootController.getRightController().getDynamicContent().getChildren().add(helloController.getContent());
        Util.push(rootParent, mouseEvent);


    }
}
