package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class userLoginMenu extends LoginMenu {

    private RegisterButtonHandler registerButtonHandler;
    @FXML
    private Button userRegisterButton;
    @FXML
    private Button userLoginAsGuest;
    @FXML
    @Override
    public void initialize(){
        super.initialize();
        registerButtonHandler = new RegisterButtonHandler(userRegisterButton, "/userRegister.fxml");
    }

}
