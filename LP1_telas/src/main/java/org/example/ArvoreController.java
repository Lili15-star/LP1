package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ArvoreController {

    @FXML
    private Button btnCortar;

    @FXML
    private Button btnCuidar;

    @FXML
    private TextField txtEspecie;

    @FXML
    private TextField txtFolhagem;

    @FXML
    private TextField txtTamanho;

    @FXML
    private Label mostrar;

    @FXML
    void cortar(ActionEvent event) {
        Arvore a = new Arvore (
                txtFolhagem.getText(),
                txtEspecie.getText(),
                Double.parseDouble(txtTamanho.getText().replace(",", "."))


        );
        mostrar.setText(a.cortar());
    }
    @FXML
    void cuidar(ActionEvent event) {
        Arvore a = new Arvore (
                txtFolhagem.getText(),
                txtEspecie.getText(),
                Double.parseDouble(txtTamanho.getText().replace(",", "."))


        );
        mostrar.setText(a.cuidar());
    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");

    }



}
