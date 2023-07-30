package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    private String targetFXML;
    private String notMatchFXML;
    private dataBaseHandler dbHandler;
    private String type;

    public LoginController(TextField usernameField, PasswordField passwordField, String targetFXML, String notMatchFXML, String type) {
        this.usernameField = usernameField;
        this.passwordField = passwordField;
        this.targetFXML = targetFXML;
        this.dbHandler = new dataBaseHandler();
        this.notMatchFXML = notMatchFXML;
        this.type = type;
    }

    public void setLoginButtonAction(Button loginButton) {
        loginButton.setOnAction(event -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            boolean isValidUser = dbHandler.validateUser(username, password, type);

            if (!isValidUser || username.isEmpty() || password.isEmpty()) {
                try {
                    Stage stage = (Stage) loginButton.getScene().getWindow();
                    Pane pane = FXMLLoader.load(getClass().getResource(notMatchFXML));
                    Scene scene = new Scene(pane);
                    stage.setScene(scene);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    Stage stage = (Stage) loginButton.getScene().getWindow();
                    Pane pane = FXMLLoader.load(getClass().getResource(targetFXML));
                    Scene scene = new Scene(pane);
                    stage.setScene(scene);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}