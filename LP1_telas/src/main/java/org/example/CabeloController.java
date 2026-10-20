package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CabeloController {

    @FXML
    private Button btnCortar;

    @FXML
    private Button btnEscovar;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnLavar;

    @FXML
    private Label mostrar;

    @FXML
    private TextField txtCor;

    @FXML
    private TextField txtTamanho;

    @FXML
    private TextField txtTextura;

    @FXML
    void Cortar(ActionEvent event) {
        Cabelo c = new Cabelo(  //crio um objeto
            txtCor.getText(),
            Double.parseDouble(txtTamanho.getText()),
            txtTextura.getText()
        );

        mostrar.setText(c.cortar());

    }

    @FXML
    void Escovar(ActionEvent event) {
        Cabelo c = new Cabelo(  //crio um objeto
                txtCor.getText(),
                Double.parseDouble(txtTamanho.getText()),
                txtTextura.getText()
        );

        mostrar.setText(c.escovar());

    }

    @FXML
    void Lavar(ActionEvent event) {
        Cabelo c = new Cabelo(  //crio um objeto
                txtCor.getText(),
                Double.parseDouble(txtTamanho.getText()),
                txtTextura.getText()
        );

        mostrar.setText(c.lavar());

    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");

    }

}
