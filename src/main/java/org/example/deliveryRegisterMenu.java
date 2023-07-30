package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class deliveryRegisterMenu extends AbstractRegisterMenu {
    public deliveryRegisterMenu() {
        this.type = "delivery";
        this.targetFXML = "/deliveryPrimaryStage.fxml";
        this.registerErrorFXML = "/RegisterError.fxml";
    }
    @Override
    @FXML
    public void initialize()
    {
        super.initialize();
    }
}
