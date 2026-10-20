package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ColecaoController {

    @FXML
    private Button btnAdicionar;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnRetirar;

    @FXML
    private Label mostrar;

    @FXML
    private TextField txItem; // Usado para quantidade

    @FXML
    private TextField txtTipoArte;

    @FXML
    private TextField txtValor;

    @FXML
    void Adicionar(ActionEvent event) {
        Colecao c = new Colecao(
                txtTipoArte.getText(),
                Integer.parseInt(txItem.getText()),
                Integer.parseInt(txtValor.getText())
        );
        mostrar.setText(c.adicionar());
    }

    @FXML
    void Retirar(ActionEvent event) {
        Colecao c = new Colecao(
                txtTipoArte.getText(),
                Integer.parseInt(txItem.getText()),
                Integer.parseInt(txtValor.getText())
        );
        mostrar.setText(c.retirar());
    }

    @FXML
    void Guardar(ActionEvent event) {
        Colecao c = new Colecao(
                txtTipoArte.getText(),
                Integer.parseInt(txItem.getText()),
                Integer.parseInt(txtValor.getText())
        );
        mostrar.setText(c.guardar());
    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }

}