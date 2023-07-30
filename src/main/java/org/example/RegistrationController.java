package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrationController {
    private dataBaseHandler dbHandler;

    public RegistrationController() {
        dbHandler = new dataBaseHandler();
    }

    public void registerUser(String name, String surname, String username, String password, String type) {
        dbHandler.addUser(name, surname, username, password, type);
    }
}
