package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class userLoginMenu extends AbstractLoginMenu {
    private LoginAsGuestButtonHandler loginAsGuestButtonHandler;
    @FXML
    private Button userLoginAsGuest;
    public userLoginMenu()
    {
        this.registerFXML = "/userRegister.fxml";
        this.targetFXML = "/userPrimaryStage.fxml";
        this.type = "user";
    }
    @FXML
    @Override
    public void initialize(){
        super.initialize();
        loginAsGuestButtonHandler = new LoginAsGuestButtonHandler(userLoginAsGuest);
    }
}

