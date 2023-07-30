package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class adminLoginMenu extends AbstractLoginMenu {
    public adminLoginMenu()
    {
        this.registerFXML = "/ADMINRegister.fxml";
        this.targetFXML = "/adminPrimaryStage.fxml";
        this.type = "ADMIN";
    }
    @FXML
    @Override
    public void initialize() {
        super.initialize();
    }
}
