package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuController {




        @FXML
        private Button btnClasseAtividade1;

        @FXML
        private Button btnClasseAtividade2;

        @FXML
        void irParaAtividade1(ActionEvent event) throws IOException {
            App.setRoot("MenuAtividade1");
        }

        @FXML
        void irParaAtividade2(ActionEvent event) throws IOException {
                App.setRoot("MenuAtividade2");

        }

    }


