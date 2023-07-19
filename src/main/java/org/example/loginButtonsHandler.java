package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class loginButtonsHandler {
    @FXML
    private Button adminLoginButton;
    @FXML
    private Button userLoginButton;
    @FXML
    private Button deliveryLoginButton;
    @FXML
    private Button dataBaseLoginButton;

    @FXML
    public void initialize() {
        adminLoginButton.setOnAction(event -> loadScene(adminLoginButton, "/ADMINlogin.fxml"));
        userLoginButton.setOnAction(event -> loadScene(userLoginButton, "/userLogin.fxml"));
        deliveryLoginButton.setOnAction(event -> loadScene(deliveryLoginButton, "/deliveryLogin.fxml"));
        dataBaseLoginButton.setOnAction(event -> loadScene(dataBaseLoginButton, "/dataBaselogin.fxml"));
    }

    private void loadScene(Button button, String fxmlFile) {
        try {
            Stage stage = (Stage) button.getScene().getWindow();
            Pane pane = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene scene = new Scene(pane);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
