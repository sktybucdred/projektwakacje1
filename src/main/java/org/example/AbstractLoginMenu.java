package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public abstract class AbstractLoginMenu extends Menu {
    private LoginController loginController;
    @FXML
    private Button loginButton;
    private RegisterButtonHandler registerButtonHandler;
    @FXML
    private Button registerButton;
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;
    protected String registerFXML;
    protected String targetFXML;
    private final String notMatchFXML = "/notMatch.fxml";
    protected String type;
    @FXML
    @Override
    public void initialize(){
        super.initialize();
        loginController = new LoginController(usernameField, passwordField, targetFXML, notMatchFXML, type);
        loginController.setLoginButtonAction(loginButton);
        registerButtonHandler = new RegisterButtonHandler(registerButton, registerFXML);
    }
}
