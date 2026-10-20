package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CalculadoraDeViagemController {

    @FXML
    private Label DistanciaViagem;

    @FXML
    private Button btnCalcular;

    @FXML
    private Button btnHome;

    @FXML
    private Label mostrar;

    @FXML
    private Label preçoLitro;

    @FXML
    private TextField txtDistanciaViagem;

    @FXML
    private TextField txtPrecoLitro;

    @FXML
    void Calcular(ActionEvent event) { CalculadoraDeViagem c = new CalculadoraDeViagem();
        mostrar.setText(c.calculadora(Integer.parseInt(txtDistanciaViagem.getText()), Integer.parseInt(txtPrecoLitro.getText())));

    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }

}
