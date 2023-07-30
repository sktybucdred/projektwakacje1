package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class adminRegisterMenu extends AbstractRegisterMenu {
    public adminRegisterMenu() {
        this.type = "ADMIN";
        this.targetFXML = "/adminPrimaryStage.fxml";
        this.registerErrorFXML = "/RegisterError.fxml";
    }
    @Override
    @FXML
    public void initialize()
    {
        super.initialize();
    }
}
