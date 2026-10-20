package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class PessoaController {

    @FXML
    private Button btnCorrer;

    @FXML
    private Button btnPedalar;

    @FXML
    private Button btnTreinar;

    @FXML
    private Label mostrarAcao;

    @FXML
    private TextField txtAltura;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtNome;

    @FXML
    void Pedalar(ActionEvent event) {
        Pessoa p = new Pessoa(
                txtNome.getText(),
                Integer.parseInt(txtIdade.getText()),
               Double.parseDouble(txtAltura.getText().replace(",", "."))
        );
        mostrarAcao.setText(p.pedalar());
    }

    @FXML
    void correr(ActionEvent event) {
        Pessoa p = new Pessoa(
                txtNome.getText(),
                Integer.parseInt(txtIdade.getText()),
               Double.parseDouble(txtAltura.getText().replace(",", "."))
        );


        mostrarAcao.setText(p.correr());
    }

    @FXML
    void inserirAltura(ActionEvent event) {

    }

    @FXML
    void inserirIdade(ActionEvent event) {

    }

    @FXML
    void inserirNome(ActionEvent event) {


    }
    @FXML
    void treinar(ActionEvent event) {
        Pessoa p = new Pessoa(
                txtNome.getText(),
                Integer.parseInt(txtIdade.getText()),
               Double.parseDouble(txtAltura.getText().replace(",", "."))
        );
        mostrarAcao.setText(p.treinar());
    }
    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }


}
