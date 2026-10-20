package org.example;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;


public class MenuAtividade2Controller {


    @FXML
    private Button btnArvore;

    @FXML
    private Button btnBicicleta;

    @FXML
    private Button btnCabelo;

    @FXML
    private Button btnCamisa;

    @FXML
    private Button btnColecao;

    @FXML
    private Button btnExposicao;

    @FXML
    private Button btnGravata;

    @FXML
    private Button btnMascara;

    @FXML
    private Button btnPessoa;

    @FXML
    private Button btnRosto;

    @FXML
    private Button btnTerno;


    @FXML
    private Button btnHome;

    @FXML
    void irArvore(ActionEvent event)throws IOException {
        App.setRoot("Arvore");

    }

    @FXML
    void irBicicleta(ActionEvent event) throws IOException {
        App.setRoot("Bicicleta");

    }



    @FXML
    void irCabelo(ActionEvent event) throws IOException {
        App.setRoot("Cabelo");

    }

    @FXML
    void irHome(ActionEvent event) throws IOException {
        App.setRoot("MenuClasses");

    }

    @FXML
    void irCamisa(ActionEvent event) throws IOException {
        App.setRoot("Camisa");

    }

    @FXML
    void irColecao(ActionEvent event) throws IOException {
        App.setRoot("Colecao");

    }

    @FXML
    void irExposicao(ActionEvent event) throws IOException {
        App.setRoot("Exposicao");
    }

    @FXML
    void irGravata(ActionEvent event) throws IOException {
        App.setRoot("Gravata");

    }

    @FXML
    void irMascara(ActionEvent event) throws IOException {
        App.setRoot("Mascara");
    }

    @FXML
    void irPessoa(ActionEvent event) throws IOException {
        App.setRoot("Pessoa");

    }

    @FXML
    void irRosto(ActionEvent event) throws IOException {
        App.setRoot("Rosto");

    }

    @FXML
    void irTerno(ActionEvent event) throws IOException {
        App.setRoot("Terno");

    }

}
