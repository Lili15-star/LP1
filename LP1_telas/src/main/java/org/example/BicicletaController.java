package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class BicicletaController {

    @FXML
    private Button btnFreiou;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnNada;

    @FXML
    private Button btnQuebrou;

    @FXML
    private Label mostrar;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtModelo;

    @FXML
    void Freiou(ActionEvent event) {
        Bicicleta b = new Bicicleta(
                txtCor.getText(),
                txtMarca.getText(),
                txtModelo.getText()
        );
        mostrar.setText(b.freiar());
    }

    @FXML
    void Nada(ActionEvent event) {
        Bicicleta b = new Bicicleta(
                txtCor.getText(),
                txtMarca.getText(),
                txtModelo.getText()
        );
        mostrar.setText(b.andar());
    }

    @FXML
    void Quebrou(ActionEvent event) {
        Bicicleta b = new Bicicleta(
                txtCor.getText(),
                txtMarca.getText(),
                txtModelo.getText()
        );
        mostrar.setText(b.quebrar());
    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }

}