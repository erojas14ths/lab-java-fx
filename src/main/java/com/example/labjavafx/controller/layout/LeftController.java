package com.example.labjavafx.controller.layout;

import com.example.labjavafx.controller.content.Base64Controller;
import com.example.labjavafx.controller.content.HelloController;
import com.example.labjavafx.util.Util;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class LeftController {

    @FXML
    public void loadContentSayHello(MouseEvent mouseEvent) {

        RootController rootController = Util.getController("/fxml/layout/root.fxml");
        HelloController helloController = Util.getController("/fxml/content/hello.fxml");

        rootController.getRightController().getContent().getChildren().clear();
        rootController.getRightController().getContent().getChildren().add(helloController.getContent());
        Util.push(rootController.getContent(), mouseEvent);


    }

    public void onEncodeBase64(MouseEvent mouseEvent) {
        RootController rootController = Util.getController("/fxml/layout/root.fxml");
        Base64Controller base64Controller = Util.getController("/fxml/content/base64.fxml");

        rootController.getRightController().getContent().getChildren().clear();
        rootController.getRightController().getContent().getChildren().add(base64Controller.getContent());
        Util.push(rootController.getContent(), mouseEvent);
    }
}
