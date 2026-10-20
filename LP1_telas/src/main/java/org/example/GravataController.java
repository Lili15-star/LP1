package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class GravataController {

    @FXML
    private Button btnAmarrar;

    @FXML
    private Button btnCortar;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnPendurar;

    @FXML
    private Label mostrar;

    @FXML
    private TextField txtEstampa;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtTextura;

    @FXML
    void Amarrar(ActionEvent event) {
        Gravata g = new Gravata(
                txtTextura.getText(),
                txtEstampa.getText(),
                txtModelo.getText()
        );
        mostrar.setText(g.amarrar());
    }

    @FXML
    void Cortar(ActionEvent event) {
        Gravata g = new Gravata(
                txtTextura.getText(),
                txtEstampa.getText(),
                txtModelo.getText()
        );
        mostrar.setText(g.cortar());
    }

    @FXML
    void Pendurar(ActionEvent event) {
        Gravata g = new Gravata(
                txtTextura.getText(),
                txtEstampa.getText(),
                txtModelo.getText()
        );
        mostrar.setText(g.pendurar());
    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }

}