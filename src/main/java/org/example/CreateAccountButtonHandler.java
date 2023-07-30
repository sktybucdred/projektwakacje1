package org.example;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateAccountButtonHandler {

    @FXML
    private TextField nameField;
    @FXML
    private TextField surnameField;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button createAccountButton;
    private RegistrationController registrationController;
    private String targetFXML;
    private String registerErrorFXML;

    public CreateAccountButtonHandler(TextField nameField, TextField surnameField, TextField usernameField, PasswordField passwordField, Button createAccountButton, String type, String targetFXML, String registerErrorFXML) {
        this.nameField = nameField;
        this.surnameField = surnameField;
        this.usernameField = usernameField;
        this.passwordField = passwordField;
        this.createAccountButton = createAccountButton;
        this.registrationController = new RegistrationController();
        this.targetFXML = targetFXML;
        this.registerErrorFXML = registerErrorFXML;
        setCreateAccountButtonAction(type);
    }

    public void setCreateAccountButtonAction(String type) {
        createAccountButton.setOnAction(event -> {
            String name = nameField.getText();
            String surname = surnameField.getText();
            String username = usernameField.getText();
            String password = passwordField.getText();
            // Sprawdź, czy wszystkie pola są wypełnione
            if(name.isEmpty() || surname.isEmpty() || username.isEmpty() || password.isEmpty()) {
                try {
                    Stage stage = (Stage) createAccountButton.getScene().getWindow();
                    Pane pane = FXMLLoader.load(getClass().getResource(registerErrorFXML));
                    Scene scene = new Scene(pane);
                    stage.setScene(scene);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                registrationController.registerUser(name, surname, username, password, type);
                try {
                    Stage stage = (Stage) createAccountButton.getScene().getWindow();
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
