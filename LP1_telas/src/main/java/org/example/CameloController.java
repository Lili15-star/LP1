

package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class  CameloController {

    @FXML
    private Button btnHome;

    @FXML
    private Label respostaCamelo;

    @FXML
    private Button txtEnviarCamelo;

    @FXML
    private TextField txtQuantidadeCamelo;

    @FXML
    void calcular(ActionEvent event) {
        Camelo c = new Camelo();
        respostaCamelo.setText(c.dividirCamelo(Integer.parseInt(txtQuantidadeCamelo.getText()))); //método que cálcula

    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }
}