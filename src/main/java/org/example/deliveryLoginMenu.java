package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class deliveryLoginMenu extends AbstractLoginMenu {
    public deliveryLoginMenu(){
        this.registerFXML = "/deliveryRegister.fxml";
        this.targetFXML = "/deliveryPrimaryStage.fxml";
        this.type = "delivery";
    }
    @FXML
    @Override
    public void initialize(){
        super.initialize();
    }
}
