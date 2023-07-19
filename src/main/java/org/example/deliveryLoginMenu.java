package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class deliveryLoginMenu extends LoginMenu {
    private RegisterButtonHandler registerButtonHandler;
    @FXML
    private Button deliveryRegisterButton;
    @FXML
    @Override
    public void initialize(){
        super.initialize();
        registerButtonHandler = new RegisterButtonHandler(deliveryRegisterButton, "/deliveryRegister.fxml");
    }
}
