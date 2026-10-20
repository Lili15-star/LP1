package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CamisaController {

    @FXML
    private Button btnCosturar;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnSecar;

    @FXML
    private Button btnlavar;

    @FXML
    private Label mostrar;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtTamanho;

    @FXML
    private TextField txtTecido;

    @FXML
    void Costurar(ActionEvent event) {
        Camisa c = new Camisa(
                txtCor.getText(),
                txtTamanho.getText(),
                txtTecido.getText()
        );
        mostrar.setText(c.costurar());
    }

    @FXML
    void Lavar(ActionEvent event) {
        Camisa c = new Camisa(
                txtCor.getText(),
                txtTamanho.getText(),
                txtTecido.getText()
        );
        mostrar.setText(c.lavar());
    }

    @FXML
    void Secar(ActionEvent event) {
        Camisa c = new Camisa(
                txtCor.getText(),
                txtTamanho.getText(),
                txtTecido.getText()
        );
        mostrar.setText(c.secar());
    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }

}