package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginAsGuestButtonHandler {
    @FXML
    private Button loginAsGuestButton;
    public LoginAsGuestButtonHandler(Button loginAsGuestButton) {
        this.loginAsGuestButton = loginAsGuestButton;
        setLoginAsGuestButtonAction();
    }
    public void setLoginAsGuestButtonAction() {
        loginAsGuestButton.setOnAction(event -> {
            try {
                Stage stage = (Stage) loginAsGuestButton.getScene().getWindow();
                Pane pane = FXMLLoader.load(getClass().getResource("/guestRegister.fxml"));
                Scene scene = new Scene(pane);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

}
