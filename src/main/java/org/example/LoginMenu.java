package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

abstract public class LoginMenu {
    @FXML
    protected Button backButton;

    protected BackButtonHandler backButtonController;
    protected String previousScene = "/primaryStage.fxml";
    @FXML
    protected Button adminRegisterButton;
    protected RegisterButtonHandler registerButtonHandler;

    @FXML
    public void initialize(){
        backButtonController = new BackButtonHandler(backButton, previousScene);
    }
}
