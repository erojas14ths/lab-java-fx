package com.example.labjavafx.controller.content;

import java.net.URL;
import java.util.Base64;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Base64Controller implements Initializable {
    @FXML
    private VBox content;
    @FXML
    public TextArea taInputEncode;
    @FXML
    public TextArea taOutputEncode;
    @FXML
    private Button btnEncrypt;
    @FXML
    private Button btnClear;
    @FXML
    private ChoiceBox selectOption;
    @FXML
    private String selectedOption;

    private final String CODIFICAR = "Codificar";
    private final String DECODIFICAR = "Decodificar";

    @FXML
    public void onEncrypt(ActionEvent event) {
        System.out.println("Select option: " + selectOption.getSelectionModel().getSelectedItem());
        System.out.println("Encrypt word: " + this.taInputEncode.getText());

        if (Objects.nonNull(selectOption.getSelectionModel().getSelectedItem())) {
            if (CODIFICAR.equals(selectOption.getSelectionModel().getSelectedItem())) {
                var base64 = Base64.getEncoder().encodeToString(this.taInputEncode.getText().getBytes());
                this.taOutputEncode.setText(String.valueOf(base64));

            }
            if (DECODIFICAR.equals(selectOption.getSelectionModel().getSelectedItem())) {
                var base64 = Base64.getDecoder().decode(this.taInputEncode.getText().getBytes());
                this.taOutputEncode.setText(new String(base64));
            }
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setResizable(false);
            alert.setTitle("Error");
            alert.setHeaderText("Ha ocurrido un error:");
            alert.setContentText("Debes seleccionar una opción: Codificar o Decodificar");
            alert.showAndWait();
        }
    }

    @FXML
    public void onClear(ActionEvent event) {
        System.out.println("Clear word " + this.taInputEncode);
        this.taInputEncode.clear();
        this.taOutputEncode.clear();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.selectOption.setItems(FXCollections.observableArrayList(CODIFICAR, DECODIFICAR));
    }

}
