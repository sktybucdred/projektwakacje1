package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class adminLoginMenu extends LoginMenu {
    @FXML
    private Button adminRegisterButton;
    private RegisterButtonHandler registerButtonHandler;
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;


    @FXML
    public void onLoginButtonClicked() {
        String username = usernameField.getText();
        String password = passwordField.getText();


    }

    @FXML
    @Override
    public void initialize() {
        super.initialize();
        registerButtonHandler = new RegisterButtonHandler(adminRegisterButton, "/ADMINregister.fxml");
    }
}
