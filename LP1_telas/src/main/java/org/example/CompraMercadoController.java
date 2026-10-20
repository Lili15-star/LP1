package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CompraMercadoController {

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnHome;

    @FXML
    private Label totalCompra;

    @FXML
    private TextField txtAcucar;

    @FXML
    private TextField txtArroz;

    @FXML
    private TextField txtCafe;

    @FXML
    private TextField txtFarinha;

    @FXML
    private TextField txtFeijao;

    @FXML
    private TextField txtFuba;

    @FXML
    private TextField txtMacarrao;

    @FXML
    private TextField txtOleo;

    @FXML
    void Enviar(ActionEvent event) {
        CompraMercado c = new CompraMercado();
        totalCompra.setText(c.somarCompra(//pega o return e coloca no lebal que vai aparecer na tela
                Double.parseDouble(txtArroz.getText()),
                Double.parseDouble(txtFeijao.getText()),
                Double.parseDouble(txtOleo.getText()),
                Double.parseDouble(txtAcucar.getText()),
                Double.parseDouble(txtCafe.getText()),
                Double.parseDouble(txtMacarrao.getText()),
                Double.parseDouble(txtFarinha.getText()),
                Double.parseDouble(txtFuba.getText())
        ));
    }

    @FXML
    void inserirAcucar(ActionEvent event) {

    }

    @FXML
    void inserirArroz(ActionEvent event) {

    }

    @FXML
    void inserirCafe(ActionEvent event) {

    }

    @FXML
    void inserirFarinha(ActionEvent event) {

    }

    @FXML
    void inserirFeijao(ActionEvent event) {

    }

    @FXML
    void inserirFuba(ActionEvent event) {

    }

    @FXML
    void inserirMacarrao(ActionEvent event) {

    }

    @FXML
    void inserirOleo(ActionEvent event) {

    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");

    }

}
