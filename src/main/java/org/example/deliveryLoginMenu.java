package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class deliveryLoginMenu extends LoginMenu {
    @FXML
    private Button deliveryRegisterButton;
    @FXML
    @Override
    public void initialize(){
        super.initialize();
        deliveryRegisterButton.setOnAction(event -> handleDeliveryRegisterButton());
    }
    public void handleDeliveryRegisterButton() {
        try {
            Stage stage = (Stage) deliveryRegisterButton.getScene().getWindow();
            Pane pane = FXMLLoader.load(getClass().getResource("/deliveryRegister.fxml"));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
