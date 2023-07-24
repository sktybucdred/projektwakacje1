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

public class deliveryRegisterMenu extends LoginMenu {
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
