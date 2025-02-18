package com.example.labjavafx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/fxml/layout/root.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        stage.setScene(scene);
        stage.setResizable(true);
        Image image = new Image(getClass().getResourceAsStream("/icons/retro-tv.ico"));
        stage.getIcons().add(image);
        stage.setTitle("Hands-On Tools");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}