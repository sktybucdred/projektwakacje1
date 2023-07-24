package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class adminRegisterMenu extends LoginMenu{
    @FXML
    private TextField name;
    @FXML
    private TextField surname;
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;
    @Override
    @FXML
    public void initialize()
    {
        super.initialize();
    }
}
