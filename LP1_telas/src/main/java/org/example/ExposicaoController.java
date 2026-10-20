package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ExposicaoController {

    @FXML
    private Button btnHome;

    @FXML
    private Button btnObservar;

    @FXML
    private Button btnOrganizar;

    @FXML
    private Button btnVisitar;

    @FXML
    private Label mostrar;

    @FXML
    private TextField txtArte;

    @FXML
    private TextField txtDia;

    @FXML
    private TextField txtLocal;

    @FXML
    void Organizar(ActionEvent event) {
        Exposicao e = new Exposicao(
                txtDia.getText(), // Pegando direto como String, aceitando as barras!
                txtLocal.getText(),
                txtArte.getText()
        );
        mostrar.setText(e.organizar());
    }

    @FXML
    void Visitar(ActionEvent event) {
        Exposicao e = new Exposicao(
                txtDia.getText(),
                txtLocal.getText(),
                txtArte.getText()
        );
        mostrar.setText(e.visitar());
    }

    @FXML
    void Observar(ActionEvent event) {
        Exposicao e = new Exposicao(
                txtDia.getText(),
                txtLocal.getText(),
                txtArte.getText()
        );
        mostrar.setText(e.observar());
    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }

}