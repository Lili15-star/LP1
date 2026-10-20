package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TemperaturaController {

    @FXML
    private Button btnEnviar;

    @FXML
    private Button btnHome;

    @FXML
    private Label mostrar;

    @FXML
    private TextField txtAbr;

    @FXML
    private TextField txtAgo;

    @FXML
    private TextField txtDez;

    @FXML
    private TextField txtFev;

    @FXML
    private TextField txtJan;

    @FXML
    private TextField txtJul;

    @FXML
    private TextField txtJun;

    @FXML
    private TextField txtMaio;

    @FXML
    private TextField txtMar;

    @FXML
    private TextField txtNov;

    @FXML
    private TextField txtOut;

    @FXML
    private TextField txtSet;


    @FXML
    void Enviar(ActionEvent event) {

        try {

            List<Integer> temperaturas = new ArrayList<>();

            temperaturas.add(Integer.parseInt(txtJan.getText()));
            temperaturas.add(Integer.parseInt(txtFev.getText()));
            temperaturas.add(Integer.parseInt(txtMar.getText()));
            temperaturas.add(Integer.parseInt(txtAbr.getText()));
            temperaturas.add(Integer.parseInt(txtMaio.getText()));
            temperaturas.add(Integer.parseInt(txtJun.getText()));
            temperaturas.add(Integer.parseInt(txtJul.getText()));
            temperaturas.add(Integer.parseInt(txtAgo.getText()));
            temperaturas.add(Integer.parseInt(txtSet.getText()));
            temperaturas.add(Integer.parseInt(txtOut.getText()));
            temperaturas.add(Integer.parseInt(txtNov.getText()));
            temperaturas.add(Integer.parseInt(txtDez.getText()));

            Temperatura t = new Temperatura();

            mostrar.setText(t.temperatura(temperaturas));

        } catch (NumberFormatException e) {

            mostrar.setText("Preencha todos os meses com números inteiros.");

        }
    }


    @FXML
    void inserirAbr(ActionEvent event) {

    }

    @FXML
    void inserirAgo(ActionEvent event) {

    }

    @FXML
    void inserirDez(ActionEvent event) {

    }

    @FXML
    void inserirFev(ActionEvent event) {

    }

    @FXML
    void inserirJan(ActionEvent event) {

    }

    @FXML
    void inserirJul(ActionEvent event) {

    }

    @FXML
    void inserirJun(ActionEvent event) {

    }

    @FXML
    void inserirMaio(ActionEvent event) {

    }

    @FXML
    void inserirMar(ActionEvent event) {

    }

    @FXML
    void inserirNov(ActionEvent event) {

    }

    @FXML
    void inserirOut(ActionEvent event) {

    }

    @FXML
    void inserirSet(ActionEvent event) {

    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");

    }

}
