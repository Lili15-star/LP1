package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AluguelDeCarroController {

    @FXML
    private Button calcular;

    @FXML
    private Button btnHome;

    @FXML
    private TextField diaria;

    @FXML
    private TextField distancia;

    @FXML
    private Label mostrar;

    @FXML
    void calcularAluguel(ActionEvent event) { AluguelDeCarro a = new AluguelDeCarro();
        mostrar.setText(a.alugar(Integer.parseInt(distancia.getText()), Integer.parseInt(diaria.getText())));

    }

    @FXML
    void contarKm(ActionEvent event) {

    }

    @FXML
    void inserirDiaria(ActionEvent event) {

    }


    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");


    }
}
