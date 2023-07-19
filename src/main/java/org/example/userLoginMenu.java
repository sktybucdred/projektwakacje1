package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class userLoginMenu extends LoginMenu {
    @FXML
    private Button userRegisterButton;
    @FXML
    private Button userLoginAsGuest;
    @FXML
    @Override
    public void initialize(){
        super.initialize();
        userRegisterButton.setOnAction(event -> handleUserRegisterButton());
    }
    public void handleUserRegisterButton() {
        try {
            Stage stage = (Stage) userRegisterButton.getScene().getWindow();
            Pane pane = FXMLLoader.load(getClass().getResource("/userRegister.fxml"));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
