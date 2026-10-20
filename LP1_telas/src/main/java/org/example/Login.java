package org.example;

public class Login {
    String validarSenha(int senhaDoUsuario) {
        int SenhaCorreta = 1234;
        if (senhaDoUsuario == SenhaCorreta) {
            return ("Acesso permitido");
        } else {
           return("Acesso negado");
        }
    }
}
