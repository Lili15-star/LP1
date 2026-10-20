package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MascaraController {

    @FXML
    private Button btnHome;

    @FXML
    private Button btnPendurar;

    @FXML
    private Button btnProduzir;

    @FXML
    private Button btnRestaurar;

    @FXML
    private Label mostrar;

    @FXML
    private TextField txtEstampa;

    @FXML
    private TextField txtEstilo;

    @FXML
    private TextField txtMatrial; // Mantido o nome exato conforme o seu FXML

    @FXML
    void Pendurar(ActionEvent event) {
        Mascara m = new Mascara(
                txtMatrial.getText(),
                txtEstampa.getText(),
                txtEstilo.getText()
        );
        mostrar.setText(m.pendurar());
    }

    @FXML
    void Produzir(ActionEvent event) {
        Mascara m = new Mascara(
                txtMatrial.getText(),
                txtEstampa.getText(),
                txtEstilo.getText()
        );
        mostrar.setText(m.produzir());
    }

    @FXML
    void Restaurar(ActionEvent event) {
        Mascara m = new Mascara(
                txtMatrial.getText(),
                txtEstampa.getText(),
                txtEstilo.getText()
        );
        mostrar.setText(m.restaurar());
    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }

}