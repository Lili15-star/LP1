package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TernoController {

    @FXML
    private Button btnHome;

    @FXML
    private Button btnPassar;

    @FXML
    private Button btnRasgar;

    @FXML
    private Button btnSujar;

    @FXML
    private Label mostrar;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtTamanho;

    @FXML
    private TextField txtTecido;

    @FXML
    void Passar(ActionEvent event) {
        Terno t = new Terno(
                txtCor.getText(),
                txtTamanho.getText(),
                txtTecido.getText()
        );
        mostrar.setText(t.passar());
    }

    @FXML
    void Rasgar(ActionEvent event) {
        Terno t = new Terno(
                txtCor.getText(),
                txtTamanho.getText(),
                txtTecido.getText()
        );
        mostrar.setText(t.rasgar());
    }

    @FXML
    void Sujar(ActionEvent event) {
        Terno t = new Terno(
                txtCor.getText(),
                txtTamanho.getText(),
                txtTecido.getText()
        );
        mostrar.setText(t.sujar());
    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }

}