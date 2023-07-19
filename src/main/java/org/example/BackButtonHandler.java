package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class BackButtonHandler {
    @FXML
    private Button backButton;
    private String targetFXML;
    public BackButtonHandler(Button backButton, String targetFXML) {
        this.backButton = backButton;
        this.targetFXML = targetFXML;
        setBackButtonAction();
    }
    public void setBackButtonAction() {
        backButton.setOnAction(event -> {
            try {
                Stage stage = (Stage) backButton.getScene().getWindow();
                Pane pane = FXMLLoader.load(getClass().getResource(targetFXML));
                Scene scene = new Scene(pane);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
