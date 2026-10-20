package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuAtividade1Controller {

        @FXML
        private Button btnAluguelCarro;

        @FXML
         private Button btnHome;

        @FXML
        private Button btnCamelo;

        @FXML
        private Button btnLogin;

        @FXML
        private Button btnMercado;

        @FXML
        private Button btnMultiplo;

        @FXML
        private Button btnTemperatura;

        @FXML
        private Button btnViagem;

        @FXML
        void irAluguelCarro(ActionEvent event) throws IOException {
                App.setRoot("aluguelDeCarro");

        }

        @FXML
        void irCamelo(ActionEvent event) throws IOException {
            App.setRoot("camelo");

        }

        @FXML
        void irLogin(ActionEvent event) throws IOException {
                App.setRoot("LoginSimplificado");

        }

        @FXML
        void irMercado(ActionEvent event) throws  IOException {
                App.setRoot("CompraMercado");
        }

        @FXML
        void irTemperatura(ActionEvent event) throws IOException {
                App.setRoot("Temperatura");

        }

        @FXML
        void irViagem(ActionEvent event) throws IOException {
                App.setRoot("calculadoraViagem");

        }

        @FXML
        void itMultiplo(ActionEvent event) throws IOException {
                App.setRoot("Multiplo");

        }

         @FXML
         void irHome(ActionEvent event) throws IOException {
             App.setRoot("MenuClasses");

        }

    }



