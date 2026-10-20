package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class RostoController {

    @FXML
    private Button btnHidratar;

    @FXML
    private Button btnHome;

    @FXML
    private Button btnLimpar;

    @FXML
    private Button btnMaquiar;

    @FXML
    private Label mostrar;

    @FXML
    private TextField txtCorBoca;

    @FXML
    private TextField txtCorOlho;

    @FXML
    private TextField txtTamanhoNariz;

    @FXML
    void Hidratar(ActionEvent event) {
        Rosto r = new Rosto(
                txtCorOlho.getText(),
                txtTamanhoNariz.getText(),
                txtCorBoca.getText()
        );
        mostrar.setText(r.hidratar());
    }

    @FXML
    void Limapr(ActionEvent event) { // Mantido com o nome exato do seu FXML
        Rosto r = new Rosto(
                txtCorOlho.getText(),
                txtTamanhoNariz.getText(),
                txtCorBoca.getText()
        );
        mostrar.setText(r.limpar());
    }

    @FXML
    void Maquiar(ActionEvent event) {
        Rosto r = new Rosto(
                txtCorOlho.getText(),
                txtTamanhoNariz.getText(),
                txtCorBoca.getText()
        );
        mostrar.setText(r.maquiar());
    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");
    }

}