package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MultiploController {

    @FXML
    private Button btnConfirmar;

    @FXML
    private Button btnHome;

    @FXML
    private Label primeiroNumero;

    @FXML
    private Label segundoNumero;

    @FXML
    private TextField txtSegundoNumero;

    @FXML
    private TextField txtprimeroNumero;


    @FXML
    void confirmar(ActionEvent event) {

        int primeiro = Integer.parseInt(txtprimeroNumero.getText());
        int segundo = Integer.parseInt(txtSegundoNumero.getText());

        if (primeiro == 0) {
            mostrar.setText("O primeiro número não pode ser zero");
            return;
        }

        Multiplo m = new Multiplo();

        mostrar.setText(m.identificarmultiplo(primeiro, segundo));
    }


    @FXML
    void digitarPrimeiroNumero(ActionEvent event) {

    }

    @FXML
    private Label mostrar; {

    }
    @FXML
    void digitarSegundoNumero(ActionEvent event) {

    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");

    }

}
