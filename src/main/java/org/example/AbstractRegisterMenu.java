package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public abstract class AbstractRegisterMenu extends Menu{
    @FXML
    protected TextField nameField;
    @FXML
    protected TextField surnameField;
    @FXML
    protected TextField usernameField;

    @FXML
    protected PasswordField passwordField;
    @FXML
    protected Button registerButton;
    protected CreateAccountButtonHandler createAccountButtonHandler;

    protected String type;
    protected String targetFXML;
    protected String registerErrorFXML;

    @Override
    @FXML
    public void initialize()
    {
        super.initialize();
        createAccountButtonHandler = new CreateAccountButtonHandler(nameField, surnameField, usernameField, passwordField, registerButton, type, targetFXML, registerErrorFXML);
    }
}
