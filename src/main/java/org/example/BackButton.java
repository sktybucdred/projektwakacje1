package org.example;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class BackButton extends Button {

    private String targetFXML;

    public BackButton(String targetFXML) {
        super("Cofnij");  // Ustawiamy tekst przycisku
        this.targetFXML = targetFXML;

        this.setOnAction(event -> {
            try{
                Stage stage = (Stage) this.getScene().getWindow();
                Pane pane = FXMLLoader.load(getClass().getResource(targetFXML));
                Scene scene = new Scene(pane);
                stage.setScene(scene);
            }catch(IOException e){
                e.printStackTrace();
            }
        });
    }
}
