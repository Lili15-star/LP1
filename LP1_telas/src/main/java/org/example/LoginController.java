package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

import java.io.IOException;

public class LoginController {

    @FXML
    private Button btnHome;

    @FXML
    private Button entrarSenha;

    @FXML
    private Label mostrar;

    @FXML
    private Label senha;

    @FXML
    private PasswordField txtSenha;


    @FXML
    void entrar(ActionEvent event) {
        Login l = new Login();

        int senhaDigitada = Integer.parseInt(txtSenha.getText());

        mostrar.setText(l.validarSenha(senhaDigitada));
    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");


    }

}
