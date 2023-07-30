package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterButtonHandler {
@FXML
private Button registerButton;
    private String targetFXML;
    public RegisterButtonHandler(Button registerButton, String targetFXML) {
        this.registerButton = registerButton;
        this.targetFXML = targetFXML;
        setRegisterButtonAction();
    }
    public void setRegisterButtonAction() {
        registerButton.setOnAction(event -> {
            try {
                Stage stage = (Stage) registerButton.getScene().getWindow();
                Pane pane = FXMLLoader.load(getClass().getResource(targetFXML));
                Scene scene = new Scene(pane);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
